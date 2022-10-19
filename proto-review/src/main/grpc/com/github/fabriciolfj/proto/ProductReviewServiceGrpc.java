package com.github.fabriciolfj.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.2)",
    comments = "Source: Review.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductReviewServiceGrpc {

  private ProductReviewServiceGrpc() {}

  public static final String SERVICE_NAME = "com.github.fabriciolfj.proto.ProductReviewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.fabriciolfj.proto.ProductReviewRequest,
      com.github.fabriciolfj.proto.ProductReviewResponse> getFindMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "find",
      requestType = com.github.fabriciolfj.proto.ProductReviewRequest.class,
      responseType = com.github.fabriciolfj.proto.ProductReviewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.fabriciolfj.proto.ProductReviewRequest,
      com.github.fabriciolfj.proto.ProductReviewResponse> getFindMethod() {
    io.grpc.MethodDescriptor<com.github.fabriciolfj.proto.ProductReviewRequest, com.github.fabriciolfj.proto.ProductReviewResponse> getFindMethod;
    if ((getFindMethod = ProductReviewServiceGrpc.getFindMethod) == null) {
      synchronized (ProductReviewServiceGrpc.class) {
        if ((getFindMethod = ProductReviewServiceGrpc.getFindMethod) == null) {
          ProductReviewServiceGrpc.getFindMethod = getFindMethod =
              io.grpc.MethodDescriptor.<com.github.fabriciolfj.proto.ProductReviewRequest, com.github.fabriciolfj.proto.ProductReviewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "find"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.fabriciolfj.proto.ProductReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.fabriciolfj.proto.ProductReviewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductReviewServiceMethodDescriptorSupplier("find"))
              .build();
        }
      }
    }
    return getFindMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductReviewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductReviewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductReviewServiceStub>() {
        @java.lang.Override
        public ProductReviewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductReviewServiceStub(channel, callOptions);
        }
      };
    return ProductReviewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductReviewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductReviewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductReviewServiceBlockingStub>() {
        @java.lang.Override
        public ProductReviewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductReviewServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductReviewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductReviewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductReviewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductReviewServiceFutureStub>() {
        @java.lang.Override
        public ProductReviewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductReviewServiceFutureStub(channel, callOptions);
        }
      };
    return ProductReviewServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductReviewServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void find(com.github.fabriciolfj.proto.ProductReviewRequest request,
        io.grpc.stub.StreamObserver<com.github.fabriciolfj.proto.ProductReviewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.github.fabriciolfj.proto.ProductReviewRequest,
                com.github.fabriciolfj.proto.ProductReviewResponse>(
                  this, METHODID_FIND)))
          .build();
    }
  }

  /**
   */
  public static final class ProductReviewServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductReviewServiceStub> {
    private ProductReviewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductReviewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductReviewServiceStub(channel, callOptions);
    }

    /**
     */
    public void find(com.github.fabriciolfj.proto.ProductReviewRequest request,
        io.grpc.stub.StreamObserver<com.github.fabriciolfj.proto.ProductReviewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductReviewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductReviewServiceBlockingStub> {
    private ProductReviewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductReviewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductReviewServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.github.fabriciolfj.proto.ProductReviewResponse> find(
        com.github.fabriciolfj.proto.ProductReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductReviewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductReviewServiceFutureStub> {
    private ProductReviewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductReviewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductReviewServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FIND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductReviewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductReviewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND:
          serviceImpl.find((com.github.fabriciolfj.proto.ProductReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.github.fabriciolfj.proto.ProductReviewResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductReviewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductReviewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.fabriciolfj.proto.Review.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductReviewService");
    }
  }

  private static final class ProductReviewServiceFileDescriptorSupplier
      extends ProductReviewServiceBaseDescriptorSupplier {
    ProductReviewServiceFileDescriptorSupplier() {}
  }

  private static final class ProductReviewServiceMethodDescriptorSupplier
      extends ProductReviewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductReviewServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductReviewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductReviewServiceFileDescriptorSupplier())
              .addMethod(getFindMethod())
              .build();
        }
      }
    }
    return result;
  }
}
