# FACTORY METHOD ? 

* Bir nesne yaratmak için bir arayüz (interface) tanımla , fakat hangi sınıfın nesnesinin oluşturulacağına alt
sınıflar karar versin.
* Factory method bir sınıfın nesne oluşturmasını alt sınıflarına ötelenmesine izin ver.

## Problem ?

* Nesne merkezli programlardaki en temel iş , nesne yaratmaktır .
  * Uygulamalarda farklı karmaşıklıkta pek çok sınıf vardır ve bu sınıfın nesneleri uyulamanın farklı yerlerinde oluşturulur.
* Bir nesne yaratmak , onu kullanmaktan daha karmaşık olabilir.
  * Çünkü nesneleri yaratmak için pek çok bilgiye ihtiyaç duyulur.
  * Bu yüzden tipik olarak kurucular(constructor), diğer metotlardan daha çok parametre alma eğilimindedirler.

## Çözüm ? 

* Factory Method kalıbı , nesnenin nerede yaratılacağı sorununu çözer.
  * Nesnelerin yaratılmalarını soyutlar ve bu işi istemci kodlarından çıkarıp "üretici" ya da "factory " metotlara
  havale eder.
* Factory method , nesnenin yaratılmasından sorumlu bir metottur öyle ki bir arayüzde tanımlanır ve alt sınıflarda gerçekleşir.
* Her alt sınıf başka bir nesneyi oluşturur.