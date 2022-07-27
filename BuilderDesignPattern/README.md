# Builder Design Pattern ? 

<img src="https://github.com/rasitesdmr/CreationalDesignPatterns/blob/master/images/build.png" width="70%" height="50%"/>

* Önce problemin ne olduğunu analiz edelim 
* Constructor’lar nesne oluşturma amacı ile kullanılan metotlar olduğundan 
dolayı çok sayıda parametre almaya yatkınlardır. 
* Bu durum da onları ister istemez karmaşık metotlar haline getirmektedir. 
* Örneğin, yaratılacak olan nesnenin yalnızca belirli özelliklerine değer atamak istediğimizi farz edelim.
* Elbette, getter/setter kullanarak tek tek değer atamanın ne kadar karmaşık ve zahmetli olduğunu tahmin edebilirsiniz.
* Bunun için tüm özelliklere ait parametreleri bulunan Constructor kullanmak da zaman kaybı olacaktır.
* Bunların yerine sadece değer atamak istediğimiz değişkenlere değer atayan bir Constructor kullanmak gerekecektir. 
* Böylece, bir sınıfta birden fazla Constructor görmek mümkün hale gelecektir.
* Bu gibi durumlarda hangi Constructor’ın kullanılması gerektiği ile ilgili kafa karışıklığı oluşacaktır. 
* Ayrıca, bahsedilen kafa karışıklığı yalnızca yazılımcılar için geçerli değildir. Derleyici de bu 
gibi durumlarda ne yapacağını kestiremez. 
* Overloading konusundan da hatırlayacağınız üzere eğer birbirleri ile aynı isme sahip birden fazla metot 
tanımlamak istiyorsak bu metotların parametre dizinleri(tip, sıra, sayı) birebir aynı olamaz. 
* Bu gibi problemlerden etkilenmeden, istenilen özelliklere değer atayabilmek adına Builder sınıfı oluşturulur.
* Bu sınıf içerisinde aynı özellikler tekrardan tanımlanır.

## 📌 Özet

* Şimdi daha iyi anlamak için örnek verelim .
* Bir ev yapmak istiyoruz bunu için işte çatı , duvarlar , kapılar , vb. gibi şeyler gerek.
* Ama ben bahçe istemiyorum ve bunun gibi çok şey istemediğimi düşünün .
* Constructor'ın için null'la doldu buda karmaşıklığa yol açabilir.
* Bunun için Builder kullanılır.
* Builder , karmaşık nesneleri adım adım oluşturmanıza olanak tanıyan yaratıcı bir tasarım modelidir. 
