package com.proto.greet;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *first service, will be unary API that will ask the users name and greet them
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: Greet/greet.proto")
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.proto.greet.GreetRequest.class,
      responseType = com.proto.greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.PromoStreamRequest,
      com.proto.greet.PromoStreamResponse> getPromoStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PromoStream",
      requestType = com.proto.greet.PromoStreamRequest.class,
      responseType = com.proto.greet.PromoStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.PromoStreamRequest,
      com.proto.greet.PromoStreamResponse> getPromoStreamMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.PromoStreamRequest, com.proto.greet.PromoStreamResponse> getPromoStreamMethod;
    if ((getPromoStreamMethod = GreetServiceGrpc.getPromoStreamMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getPromoStreamMethod = GreetServiceGrpc.getPromoStreamMethod) == null) {
          GreetServiceGrpc.getPromoStreamMethod = getPromoStreamMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.PromoStreamRequest, com.proto.greet.PromoStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PromoStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.PromoStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.PromoStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("PromoStream"))
              .build();
        }
      }
    }
    return getPromoStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *first service, will be unary API that will ask the users name and greet them
   * </pre>
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     */
    public void promoStream(com.proto.greet.PromoStreamRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.PromoStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPromoStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.greet.GreetRequest,
                com.proto.greet.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getPromoStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.greet.PromoStreamRequest,
                com.proto.greet.PromoStreamResponse>(
                  this, METHODID_PROMO_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   *first service, will be unary API that will ask the users name and greet them
   * </pre>
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void promoStream(com.proto.greet.PromoStreamRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.PromoStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPromoStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *first service, will be unary API that will ask the users name and greet them
   * </pre>
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.greet.GreetResponse greet(com.proto.greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.greet.PromoStreamResponse> promoStream(
        com.proto.greet.PromoStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPromoStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *first service, will be unary API that will ask the users name and greet them
   * </pre>
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greet.GreetResponse> greet(
        com.proto.greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_PROMO_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.proto.greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse>) responseObserver);
          break;
        case METHODID_PROMO_STREAM:
          serviceImpl.promoStream((com.proto.greet.PromoStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.PromoStreamResponse>) responseObserver);
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

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.greet.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getPromoStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
