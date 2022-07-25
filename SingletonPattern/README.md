## SINGLETON KALIBI ?
<img src="https://github.com/rasitesdmr/CreationalDesignPatterns/blob/master/images/rm6.png" width="80%" height="50%"/>

* Türkçe karşılığı "tek" , "tek olan" demek .
* Amaç : Bir sınıfın sadece bir tane nesnesinin olduğundan emin olun ve ona global bir erişim noktası sağla.
* Bir sınıfın bir tane nesne olmasından kasıt ise , herkesin istediği zaman bu sınıfın bir nesnesini oluşturmaya
  çalışmaması , oluşturamaması , var olan tek nesneyi kullanmasıdır .

## 📌 SINGLETON VE INHERITANCE ? 

* Singleton'ın tüm kurucuları private olduğundan miras olarak devralınamazlar.
* Yani singleton'ın alt sınıfları olamaz , genişletilebilen bir yapı değildir.
* Ama bu önemli bir kısıt değildir çünkü singletondaki davranışlar da zaten singleton yani tek olma eğilimindedir.


