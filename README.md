jStellarAPI
==========

This library is an API for the [Stellar](http://stellar.org/)  network. It uses websocket to provide synchronous and asynchronous access. Currently requires eclipse to build.

This is very much a work in progress, contributions are welcomed.

Features
==
* Pure Java implementation, from scratch
* Websocket support, can subscribe to stellard events
* Full binary read/write of the stellar wire format
* Offline signing
* HTTP REST support
* Address generation
* Uses Java futures for multi-threading ease


Quick start
==
How to send 10 XRP to the JStellarAPI project, the simplest way possible.
```java
File testWalletFile = new File("myUnEncryptedWallet.wallet");
StellarSeedAddress seed = new StellarSeedAddress("sXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
StellarWallet wallet = StellarWallet.createWallet(seed, testWalletFile);
wallet.sendXRP(BigInteger.TEN, new StellarAddress("r32fLio1qkmYqFFYkwdnsaVN7cxBwkW4cT"));
```

Libraries required
==
*  [Jetty](http://www.eclipse.org/jetty/) as the websocket client
*  [JSONSimple](https://code.google.com/p/json-simple/) for JSON handling
*  [BouncyCastle](http://www.bouncycastle.org/) for crypto
