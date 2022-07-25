# Abstract Factory ?
* Birbirleriyle ilgili ya da bağımlı nesne ailelerini , nesnelerin somut sınıflarını belirtmeden 
yaratmak için bir arayüz sağlar. 
* Abstract Factory , tek nesne yerine , nesne ailesi oluşturmak üzere kullanılan bir kalıptır.
* İsimlendirmesi , Factory Method kalıbı da düşünüldüğünde problemlidir.
* Abstract Factory bir sınıftır , Faktory Method ise bir metottur.
* Factory Method tek bir nesnenin , Abstract Factory birden fazla nesnenin yaratılmasını soyutlar.
* Bu amaçla Abstract Factory birden fazla Factory Method'a sahiptir.

## Nesne Ailesi ?
* Kalıbın açıklamasında geçen birbirleriyle ilgili ya da birbirlerine bağımlı nesne ailesi (families of related 
or dependent objects) birbirleriyle ilgili ürün ailesi (a family of related product) ile kastedilen
birlikte kullanılacak şekilde tasarlanmış ve bunun uygulandığı nesnelerdir (a family of related product objects 
is designed to be used together, and you need to enforce this constraint.)

## Solution 1 ?
* Factory Method tek bir nesne yaratmaktan sorumludur.
* Yaratılacak nesne bir değil birden çok ise yapılacak şey birden fazla Factory Method kullanmaktır.
* Bu durumda farklı methodlar farklı arayüzlerde bulunur.
* Çünkü nesneler arasında bir ilgi ya da bağımlılık yoktur.
* Benzer şekilde her bir nesne için arayüzü gerçekleştiren dolayısıyla da Factory Method’unu ezen sınıflar oluşturulur.

<img src="" width="100%" height="50%"/>
