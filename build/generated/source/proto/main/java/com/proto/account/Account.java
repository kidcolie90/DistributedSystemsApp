// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account/account.proto

package com.proto.account;

public final class Account {
  private Account() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AccountInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AccountInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AccountResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025account/account.proto\"G\n\013AccountInfo\022\014" +
      "\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\017\n\007address\030\003 " +
      "\001(\t\022\013\n\003age\030\004 \001(\005\"m\n\016AccountRequest\022!\n\013ac" +
      "countInfo\030\001 \001(\0132\014.AccountInfo\022\014\n\004name\030\002 " +
      "\001(\t\022\014\n\004type\030\003 \001(\t\022\017\n\007address\030\004 \001(\t\022\013\n\003ag" +
      "e\030\005 \001(\005\"!\n\017AccountResponse\022\016\n\006Result\030\001 \001" +
      "(\t2=\n\013OpenAccount\022.\n\007account\022\017.AccountRe" +
      "quest\032\020.AccountResponse\"\000B\025\n\021com.proto.a" +
      "ccountP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AccountInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AccountInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AccountInfo_descriptor,
        new java.lang.String[] { "Name", "Type", "Address", "Age", });
    internal_static_AccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AccountRequest_descriptor,
        new java.lang.String[] { "AccountInfo", "Name", "Type", "Address", "Age", });
    internal_static_AccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AccountResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
