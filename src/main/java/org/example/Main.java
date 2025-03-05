package org.example;

import com.google.protos.zetasketch.Annotation;
import com.google.zetasketch.shaded.com.google.protobuf.CodedInputStream;
import com.google.zetasketch.shaded.com.google.protobuf.ExtensionRegistryLite;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Annotation.AggregatorSchema aggregatorSchema = Annotation.AggregatorSchema.newBuilder().mergeFrom((CodedInputStream) null, ExtensionRegistryLite.getEmptyRegistry()).build();
    System.out.println("Hello world!");
  }
}