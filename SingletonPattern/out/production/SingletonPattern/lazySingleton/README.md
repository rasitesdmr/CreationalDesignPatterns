## Sonradan Yüklemeli Singleton ?

* Bu çözüm en basit olandır ve üzerinde bazı iyileştirmeler yapılabilir
* İlk akla gelen iyileştirme statik olan singleton nesnenin sınıf yüklenirken yaratılması değil aksine yaratılmasının 
ihtiyaç oluncaya kadar geciktirilmesidir.
* Bu durumda singleton nesne geç/sonradan yüklemeli (lazy loading)hale gelir.
* Geç yüklemeli (lazy loaded) singletonun problemi ise çok kanallı (multiThreaded) ortamlarda probleme yol açmasıdır.
* Null kontrolünün aynı anda birden fazla kanalın yapması , birden fazla singleton nesnesinin oluşmasına sebep olur .
