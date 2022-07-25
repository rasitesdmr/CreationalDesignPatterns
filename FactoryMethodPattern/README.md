# FACTORY METHOD ?
<img src="https://github.com/rasitesdmr/CreationalDesignPatterns/blob/master/images/img1.jpg" width="60%" height="50%"/>

* Bir nesne yaratmak için bir arayüz (interface) tanımla , fakat hangi sınıfın nesnesinin oluşturulacağına alt
sınıflar karar versin.
* karisikExample.Factory method bir sınıfın nesne oluşturmasını alt sınıflarına ötelenmesine izin ver.

## 📌 Problem ?

* Nesne merkezli programlardaki en temel iş , nesne yaratmaktır .
* Uygulamalarda farklı karmaşıklıkta pek çok sınıf vardır ve bu sınıfın nesneleri uyulamanın farklı yerlerinde oluşturulur.
* Bir nesne yaratmak , onu kullanmaktan daha karmaşık olabilir.
* Çünkü nesneleri yaratmak için pek çok bilgiye ihtiyaç duyulur.
* Bu yüzden tipik olarak kurucular(constructor), diğer metotlardan daha çok parametre alma eğilimindedirler.

## 📌 Çözüm ? 

* karisikExample.Factory Method kalıbı , nesnenin nerede yaratılacağı sorununu çözer.
* Nesnelerin yaratılmalarını soyutlar ve bu işi istemci kodlarından çıkarıp "üretici" ya da "factory " metotlara
  havale eder.
* karisikExample.Factory method , nesnenin yaratılmasından sorumlu bir metottur öyle ki bir arayüzde tanımlanır ve alt sınıflarda gerçekleşir.
* Her alt sınıf başka bir nesneyi oluşturur.

## 📌 Özetlersek ?

* Factory (Fabrika) tasarım deseni, istemci tarafından verilen bilgilere göre nesne oluşumunu soyutlayarak
merkezi bir yerden kontrol etmemizi sağlar. Sınıflar, arayüz üzerinden türetilir. Böylece, istemci ile işi 
yapacak olan nesne birbirinden ayrılarak gevşek bağlılık sağlanmış olur. Oluşturulacak nesnelerden birbirine 
benzer olanlar aynı arayüzden türetilerek gruplanır. Fabrika deseni, aynı zamanda sistemimizde tanımladığımız 
soyut sınıflardan örnekler oluşturmamızı sağlar. Fabrika deseni, Java’da en çok kullanılan desenlerden birisidir.