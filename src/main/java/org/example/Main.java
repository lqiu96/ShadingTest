package org.example;

import com.google.protos.zetasketch.Annotation;
import dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal.metadata.ProtoBuf;

public class Main {
  public static void main(String[] args) {
    // Dagger
    try {
      ProtoBuf.Annotation annotation =
          ProtoBuf.Annotation.newBuilder()
              .mergeFrom(
                  (dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal
                          .protobuf.CodedInputStream)
                      null,
                  dagger.spi.internal.shaded.androidx.room.jarjarred.kotlin.metadata.internal
                      .protobuf.ExtensionRegistryLite.getEmptyRegistry())
              .build();
    } catch (Exception e) {
      // Expect a NullPointerException from CodeInputStream.readTag()
      e.printStackTrace();
    }

    // ZetaSketch
    try {
      Annotation.AggregatorSchema aggregatorSchema =
          Annotation.AggregatorSchema.newBuilder()
              .mergeFrom(
                  (com.google.zetasketch.shaded.com.google.protobuf.CodedInputStream) null,
                  com.google.zetasketch.shaded.com.google.protobuf.ExtensionRegistryLite
                      .getEmptyRegistry())
              .build();
    } catch (Exception e) {
      // Expect a NullPointerException from CodeInputStream.readTag()
      e.printStackTrace();
    }
  }
}
