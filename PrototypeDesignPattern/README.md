# Prototype Design Pattern ?

<img src="https://github.com/rasitesdmr/CreationalDesignPatterns/blob/master/images/prototype.png" width="100%" height="50%"/>

* Nesne yaratma işlemini gerçekleştirmek için Constructor metotları kullanmaktayız.
* Constructor metotlar ise doğaları gereği fazla sayıda parametre alabilmekte ve bu durum yazılımda belirli
bir karmaşıklığa yol açabilmekte.
* Örnek vermek gerekirse , 10 parametre alan bir Constructor metot ile nesne oluşturuken parametrelerin sırasını 
karıştırmak mümkün.
* Bu durum yazılımın çalışmasında sıkıntı çıkarır.
* Eğer birbirleri ile pek çok özelliği aynı ve birkaç özelliği farklı olan nesneler üretmek istersek , var olan
nesneyi tamamen kopyalamak ve yalnızca belirli özellikleri değiştirmek bu problemden kaçmak için 
kullanılabilecek mantıklı bir yoldur.
* Böylece, hem sürekli olarak Constructor metotlara parametre geçmenin sebep olabileceği karışıklıktan 
sıyrılmış oluruz hem de daha hızlı bir şekilde ilerleme imkanı elde ederiz.

## 📌 Örnek Verelim ? 
* Örneğin, bir savaş oyununda aynı askerden yüzlerce tane bulunurken bu askerlerin yalnızca kimlik numaraları 
farklıdır.Her defasında yeni asker nesnesi yaratmak yerine var olan asker nesneleri kopyalanır ve 
kimlik numaraları değiştirilir.
