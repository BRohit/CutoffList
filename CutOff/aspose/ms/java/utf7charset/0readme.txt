aspose.charset package is a container for additional charsets not supported by core java.
UTF-7 only added at the moment.

New charset should fulfil java.nio.charset.Charset.CharsetProvider contract so JVM will be able to
load the new charset as an extension charset:
1. A charset provider identifies itself with a provider-configuration file named
   java.nio.charset.spi.CharsetProvider in the resource directory META-INF/services.
2. The file should contain a list of fully-qualified concrete charset-provider class names,
   one per line. (com.aspose.words.CharsetProvider in our case).
3. com.aspose.words.CharsetProvider should implement java.nio.charset.spi.CharsetProvider: init and
   return all added charsets (see com.aspose.words.CharsetProvider).

NOTE! Developer should take care during obfuscation of this package since it contains classes referenced from JVM
(external non-aspose calls).