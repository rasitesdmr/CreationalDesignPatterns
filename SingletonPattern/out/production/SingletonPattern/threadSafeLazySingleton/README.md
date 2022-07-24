## Thread-Safe Sonradan Yüklemeli Singleton ?
* Bu durumda thread safety sağlamak için getInstance()metodunu aynı anda sadece bir tek kanal tarafından
çağrılabileceğinden emin olmak gereklidir .
* getInstance() metodund Java’da synchronized ile tüm metodun ya da belirlenen kapsamın (scope) aynı anda sadece bir
kanal tarafından çalıştırılması sağlanır

## Burda Bir Problemimiz Var ?
<img src="https://github.com/rasitesdmr/CreationalDesignPatterns/blob/master/images/img5.jpg" width="70%" height="50%"/>

* Sonradan yüklemeli ve thread-safe çözümde getInstance’da singleton nesnenin null kontrolünün mutex lock ile yapılması 
performans açısından sorunludur.
* Çünkü mutex lock sadece singleton nesne oluşturuluncaya kadar gereklidir, sonrasında referans null olmaktan 
çıktığından if kontrolü hiçbir zaman true dönmeyecektir.
* Ama buna rağmen çalışma zamanında tüm null kontrolleri mutex lock ile yapılamaktdır.
* Bu durumdan singleton nesnenin null kontrolünü, birisi mutex lock içinde diğer öncesinde olmak üzere iki defa 
yapılmakla kurtulmak mümkündür.

