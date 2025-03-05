![image](https://github.com/user-attachments/assets/f94419ed-779a-458f-8ad6-1f27d6a90a4e)

Protobuf is shaded and it invokes the shaded artifacts. The code will run, but is vulnerable to DDOS attacks.

Error:
```
java.lang.NullPointerException: Cannot invoke "dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal.protobuf.CodedInputStream.readTag()" because "input" is null
	at dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal.metadata.ProtoBuf$Annotation.<init>(ProtoBuf.java:1910)
	at dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal.metadata.ProtoBuf$Annotation.<init>(ProtoBuf.java:1875)
	at dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal.metadata.ProtoBuf$Annotation$1.parsePartialFrom(ProtoBuf.java:1962)
	at dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal.metadata.ProtoBuf$Annotation$1.parsePartialFrom(ProtoBuf.java:1957)
	at dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal.metadata.ProtoBuf$Annotation$Builder.mergeFrom(ProtoBuf.java:4433)
	at org.example.Main.main(Main.java:13)
java.lang.NullPointerException: Cannot invoke "com.google.zetasketch.shaded.com.google.protobuf.CodedInputStream.readTag()" because "input" is null
	at com.google.protos.zetasketch.Annotation$AggregatorSchema.<init>(Annotation.java:94)
	at com.google.protos.zetasketch.Annotation$AggregatorSchema.<init>(Annotation.java:61)
	at com.google.protos.zetasketch.Annotation$AggregatorSchema$1.parsePartialFrom(Annotation.java:688)
	at com.google.protos.zetasketch.Annotation$AggregatorSchema$1.parsePartialFrom(Annotation.java:682)
	at com.google.protos.zetasketch.Annotation$AggregatorSchema$Builder.mergeFrom(Annotation.java:533)
	at org.example.Main.main(Main.java:21)
```

`makeExtensionsImmutable()` is invoked and it fails due to the null input.
