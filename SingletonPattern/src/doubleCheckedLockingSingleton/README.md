## Double Checked Locking ?
* Singleton nesneye olan referansın null olup olmadığının , birisi kilitli blokta 
diğeri ise öncesinde olmak üzere iki defa kontrol edildiği çözüme denir.
* Burada iki defa null kontrolü yapılmaktadır.
* Mutex lock null kontrolü , singleton nesne oluşuncaya kadar çalışır.
* Singleton nesne thread-safe olarak oluşturulduktan sonra çalışma ilk null kontrolü
true döndüreceğinden bir daha mutex lock alanına girmez.
* Bu da performans kazanımı sağlar.

## Thread ? 
* Aynı anda birden fazla işlem yapmayı sağlayan yapıya thread denir. 
* Bu yapı sayesinde işlemler birbirini beklemeden kendi işlemini yapar .

## Volatile ? 
* Java "volatile" anahtar kelimesi değişkenin sakladığı değerin Threadlar tarafından 
okunmaya çalışıldığında hepsinin aynı değerinin okunacağının garantisini verir.

## Volatile Örnek Verelim
* 4 çekirdekli bir bilgisayarınız olduğunu varsayın ve oluşturduğunuz bir değişken farklı thread'ler 
tarafından erişime açık. Herhangi bir thread bu değişken üzerinde değişiklik yaptığında diğer thread'in bu 
değişikliğin farkında olması için volatile sözcüğünü kullanarak yapılacak tüm değişikliklerin ram 
üzerinde yapılmasını garanti altına almış oluruz. Bunu bir şekil üzerinde göstermek gerekirse.

* Thread 1 -> CPU 1 Cache -> Main Memory (RAM)
* Thread 2 -> CPU 2 Cache -> Main Memory (RAM)

* X adında bir integer değişkenimiz olsun ve ilk değeri 3 olsun.
* Thread 1 X'i ram'den okusun ve değerini 5 arttırsın. X'in yeni değeri 8 ancak ram'e yazılmadığını düşünelim. 
Çünkü bu arttırma işlemi 1. cache bellekte gerçekleşmektedir.
* Thread 2 X'i ram'den okuduğunda X'i 8 değil 3 olarak okuyacaktır. 
Çünkü Thread1 X'in yeni değerini ram'e yazmamıştır. Thread2 de X'in değerini 1 azaltsın ve 
değerini 2 yapsın. Şu an elimizde 3 farklı X değeri var. İlki ram'de bulunan X=3, diğer değerimiz 
Thread1'de bulunan X=8, ve son olarak da Thread2'de bulunan X=2 değerimiz.
* Bu gibi sorunlarla karşılaşmamak için "volatile" kullanılır. Eğer yukarıdaki durumda volatile 
kullanılsaydı X değeri Thread1 tarafından değiştirildiğinde bu yeni değer CPU1 cache belleğe değil 
ram'e yazılacaktı ve Thread2 X değerini okuduğunda X'i 3 olarak değil 8 olarak yani bizim bekledğimiz 
şekilde okuyacaktı.
