# YARATIMSAL KALIPLAR ?
<img src="https://github.com/rasitesdmr/CreationalDesignPatterns/blob/master/images/cp1.jpeg" width="100%" height="50%"/>

## Nesne Yaratma Problemi ? 
* Nesne-merkezli programlamada en temel ve yaygın iş nesne yaratmaktır.
* Nesne yaratma , kulağa gelişinin aksine , basit bir iş değildir.
* Çünkü nesneler , gerçek dünyada programlama öğrenirken gördüğümüz örneklerinden çok daha karmaşıktır .
* Kötü oluşturulmuş bir modelde nesneler zaten gelişigüzellikten kaynaklanan karmaşıklığa sahiptirler.
* İyi oluşturulmuş bir modelde nesneler, aralarındaki düzenli ilişkiler, tanımlı durumları (state) ve tekrar kullanılabilirlik (reusability) gibi kaygılardan dolayı anlaşılır bir karmaşığa sahiptirler .
* Bu anlamda genel olarak iş nesneleri ile kontrol nesneleri daha karmaşık olma eğilimindedirler.
* Dolayısıyla nesne yaratma, sadece bir kurucu (constructor) çağrısına indirgenemeyecek kadar karmaşıktır.
* Çoğu zaman bir nesneyi oluşturmak, o nesneyi kullanmaktan daha zordur.
* Çünkü nesnenin sağladığı basit ve anlaşılır bir arayüzün arkasındaki mekanizmayı kurmak zordur.

## Nesne Yaratmada Temel Problem Şunlardır ?
* Nesnenin yaratılacağı yer : Nesneler belirli yerlerde yaratılmalı .
* Nesnenin nasıl yaratılacağı : Nesnelerin nasıl yaratılacağını belirleyen şey genelde nesnelerin durumları 
(state) ve diğer nesnelerle olan ilişkileridir

## Nesne Nerede Yaratılmalı ?
* Dolayısıyla nesne yaratmak zordur, uzmanlık gerektiren bir iştir.
* Bu yüzden nesne yaratmak, bir iş süreci ya da bir iş kuralı gibi özel bir sorumluluktur ve sistemde bu sorumluluk için oluşturulmuş özel yerler olmalıdır.
* Burada nesne ile kastedilen genel olarak iş nesneleridir (business objects).
* Çünkü framework nesneleri daha basittirler yaratılması karmaşık olan genelde bizim modellediğimiz nesnelerdir, iş nesneleridir.

## Nesne Nasıl Yaratılır ?
* Modern nesne-merkezli dillerde nesneler kurucu(constructor) denen özel metot çağrılarıyla yaratılır .
* Bazen nesne, gerekli tüm parametreleri kendisine geçilen bir kurucuyla bir seferde yaratılır.
* Bazen de nesne önce parametre almayan, varsayılan (default) kurucu ile yaratılır, sonrasında gerekli parametreler set metotlarıyla nesneye geçilir.
* Bu ikincisine, JavaBean yöntemi de denir.

## Nesne Yaratma Ters Kalıpları ? 
* Aksi taktirde şu problemler ya da ters kalıplar (anti-pattern) oluşur:
* Nesne yaratan kodlar sistemde her tarafa yayılır,
* Bu yayılma gittikçe daha çok copy-paste ile yapılır hale gelir,
* İstemcilerin nesnelere olan bağımlılıkları artar,
* İstemciler, nesnelerin yaratılma şekillerindeki değişikliklerden etkilenirler,
* Nesneler hatalı bir şekilde, yanlış ilişki ve durumlarda yaratılır,
* Zor bulunan buglar ortaya çıkar

## Örnek Yapalım ? 
<img src="https://github.com/rasitesdmr/CreationalDesignPatterns/blob/master/images/cr2.jpg" width="80%" height="50%"/>

## Problem Nedir ? 
* Yukarıdaki kod parçasında en fazla yer kaplayan ve en karmaşık kısımlar, nesne oluşturan kodlardır.
* Kurucuların (constructor) çok parametre alması normaldir,
* Bir sınıfın bir çok karmaşık kurucusunun olması da normaldir,
* Normal olmayan, bu karmaşık kodları çağıran kod parçalarının her tarafa yayılmasıdır.
* Öte taraftan kurucularda tasarımsızlıktan kaynaklanan gereksiz bir karmaşıklık vardır.

## Peki Ne Yapılmalı ? 
* Nesnelerin yaratılması basitleştirilmeli,
* Nesnelerin yaratılması tekrar kullanılabilir olmalı,
* İstemcilerin, nesnelerin yaratılmasına olan bağımlılıkları asgari seviyeye 
indirilmeli

## Özetlersek ?
* Nesnelerin yaratılması kodun diğer kısımlarından soyutlanmalıdır; nesneler, sadece ve sadece belirli yerlerde yaratılmalı, bunun dışında new kullanımı engellenmelidir.

## Yaratımsal kalıplar 5 Tanedir 
* Singleton : Bır sınıftan sadece bir tane nesne yaratmak.
* Factory Method : Nesne yaratmayı soyutlamak.
* Abstract Factory : Nesne ailesi yaratnayı soyutlamak.
