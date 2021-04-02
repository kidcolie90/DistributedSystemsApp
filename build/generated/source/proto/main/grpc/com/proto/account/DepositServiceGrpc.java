package com.proto.account;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *deposit crypto currency service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: Deposit/deposit.proto")
public final class DepositServiceGrpc {

  private DepositServiceGrpc() {}

  public static final String SERVICE_NAME = "DepositService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.account.DepositRequest,
      com.proto.account.DepositResponse> getDepositCryptoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositCrypto",
      requestType = com.proto.account.DepositRequest.class,
      responseType = com.proto.account.DepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.account.DepositRequest,
      com.proto.account.DepositResponse> getDepositCryptoMethod() {
    io.grpc.MethodDescriptor<com.proto.account.DepositRequest, com.proto.account.DepositResponse> getDepositCryptoMethod;
    if ((getDepositCryptoMethod = DepositServiceGrpc.getDepositCryptoMethod) == null) {
      synchronized (DepositServiceGrpc.class) {
        if ((getDepositCryptoMethod = DepositServiceGrpc.getDepositCryptoMethod) == null) {
          DepositServiceGrpc.getDepositCryptoMethod = getDepositCryptoMethod =
              io.grpc.MethodDescriptor.<com.proto.account.DepositRequest, com.proto.account.DepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositCrypto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.account.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.account.DepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepositServiceMethodDescriptorSupplier("DepositCrypto"))
              .build();
        }
      }
    }
    return getDepositCryptoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepositServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepositServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepositServiceStub>() {
        @java.lang.Override
        public DepositServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepositServiceStub(channel, callOptions);
        }
      };
    return DepositServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepositServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepositServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepositServiceBlockingStub>() {
        @java.lang.Override
        public DepositServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepositServiceBlockingStub(channel, callOptions);
        }
      };
    return DepositServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepositServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepositServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepositServiceFutureStub>() {
        @java.lang.Override
        public DepositServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepositServiceFutureStub(channel, callOptions);
        }
      };
    return DepositServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *deposit crypto currency service
   * </pre>
   */
  public static abstract class DepositServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.account.DepositRequest> depositCrypto(
        io.grpc.stub.StreamObserver<com.proto.account.DepositResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDepositCryptoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDepositCryptoMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.account.DepositRequest,
                com.proto.account.DepositResponse>(
                  this, METHODID_DEPOSIT_CRYPTO)))
          .build();
    }
  }

  /**
   * <pre>
   *deposit crypto currency service
   * </pre>
   */
  public static final class DepositServiceStub extends io.grpc.stub.AbstractAsyncStub<DepositServiceStub> {
    private DepositServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepositServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepositServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.account.DepositRequest> depositCrypto(
        io.grpc.stub.StreamObserver<com.proto.account.DepositResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getDepositCryptoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *deposit crypto currency service
   * </pre>
   */
  public static final class DepositServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DepositServiceBlockingStub> {
    private DepositServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepositServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepositServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *deposit crypto currency service
   * </pre>
   */
  public static final class DepositServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DepositServiceFutureStub> {
    private DepositServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepositServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepositServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DEPOSIT_CRYPTO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DepositServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DepositServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPOSIT_CRYPTO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.depositCrypto(
              (io.grpc.stub.StreamObserver<com.proto.account.DepositResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DepositServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepositServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.account.Deposit.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepositService");
    }
  }

  private static final class DepositServiceFileDescriptorSupplier
      extends DepositServiceBaseDescriptorSupplier {
    DepositServiceFileDescriptorSupplier() {}
  }

  private static final class DepositServiceMethodDescriptorSupplier
      extends DepositServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DepositServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DepositServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepositServiceFileDescriptorSupplier())
              .addMethod(getDepositCryptoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
