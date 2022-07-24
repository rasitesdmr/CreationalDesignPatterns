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
