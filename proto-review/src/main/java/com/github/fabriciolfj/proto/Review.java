// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Review.proto

package com.github.fabriciolfj.proto;

public final class Review {
  private Review() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_fabriciolfj_proto_ProductReviewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_fabriciolfj_proto_ProductReviewRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_fabriciolfj_proto_ProductReviewResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_fabriciolfj_proto_ProductReviewResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Review.proto\022\034com.github.fabriciolfj.p" +
      "roto\"$\n\024ProductReviewRequest\022\014\n\004code\030\001 \001" +
      "(\t\"R\n\025ProductReviewResponse\022\014\n\004code\030\001 \001(" +
      "\t\022\017\n\007message\030\002 \001(\t\022\014\n\004rate\030\003 \001(\005\022\014\n\004date" +
      "\030\004 \001(\t2\211\001\n\024ProductReviewService\022q\n\004find\022" +
      "2.com.github.fabriciolfj.proto.ProductRe" +
      "viewRequest\0323.com.github.fabriciolfj.pro" +
      "to.ProductReviewResponse0\001B \n\034com.github" +
      ".fabriciolfj.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_github_fabriciolfj_proto_ProductReviewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_fabriciolfj_proto_ProductReviewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_fabriciolfj_proto_ProductReviewRequest_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_com_github_fabriciolfj_proto_ProductReviewResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_github_fabriciolfj_proto_ProductReviewResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_fabriciolfj_proto_ProductReviewResponse_descriptor,
        new java.lang.String[] { "Code", "Message", "Rate", "Date", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
