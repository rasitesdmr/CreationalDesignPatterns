## Thread-Safe Sonradan Yüklemeli Singleton ?
* Bu durumda thread safety sağlamak için getInstance()metodunu aynı anda sadece bir tek kanal tarafından
çağrılabileceğinden emin olmak gereklidir .
* getInstance() metodund Java’da synchronized ile tüm metodun ya da belirlenen kapsamın (scope) aynı anda sadece bir
kanal tarafından çalıştırılması sağlanır