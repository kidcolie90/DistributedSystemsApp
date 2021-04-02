package com.proto.account;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *open account service : account rpc sends an  account request and returns a the account response
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: account/account.proto")
public final class OpenAccountGrpc {

  private OpenAccountGrpc() {}

  public static final String SERVICE_NAME = "OpenAccount";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.account.AccountRequest,
      com.proto.account.AccountResponse> getAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "account",
      requestType = com.proto.account.AccountRequest.class,
      responseType = com.proto.account.AccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.account.AccountRequest,
      com.proto.account.AccountResponse> getAccountMethod() {
    io.grpc.MethodDescriptor<com.proto.account.AccountRequest, com.proto.account.AccountResponse> getAccountMethod;
    if ((getAccountMethod = OpenAccountGrpc.getAccountMethod) == null) {
      synchronized (OpenAccountGrpc.class) {
        if ((getAccountMethod = OpenAccountGrpc.getAccountMethod) == null) {
          OpenAccountGrpc.getAccountMethod = getAccountMethod =
              io.grpc.MethodDescriptor.<com.proto.account.AccountRequest, com.proto.account.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "account"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.account.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.account.AccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OpenAccountMethodDescriptorSupplier("account"))
              .build();
        }
      }
    }
    return getAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OpenAccountStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpenAccountStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpenAccountStub>() {
        @java.lang.Override
        public OpenAccountStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpenAccountStub(channel, callOptions);
        }
      };
    return OpenAccountStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OpenAccountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpenAccountBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpenAccountBlockingStub>() {
        @java.lang.Override
        public OpenAccountBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpenAccountBlockingStub(channel, callOptions);
        }
      };
    return OpenAccountBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OpenAccountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpenAccountFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpenAccountFutureStub>() {
        @java.lang.Override
        public OpenAccountFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpenAccountFutureStub(channel, callOptions);
        }
      };
    return OpenAccountFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *open account service : account rpc sends an  account request and returns a the account response
   * </pre>
   */
  public static abstract class OpenAccountImplBase implements io.grpc.BindableService {

    /**
     */
    public void account(com.proto.account.AccountRequest request,
        io.grpc.stub.StreamObserver<com.proto.account.AccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.account.AccountRequest,
                com.proto.account.AccountResponse>(
                  this, METHODID_ACCOUNT)))
          .build();
    }
  }

  /**
   * <pre>
   *open account service : account rpc sends an  account request and returns a the account response
   * </pre>
   */
  public static final class OpenAccountStub extends io.grpc.stub.AbstractAsyncStub<OpenAccountStub> {
    private OpenAccountStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenAccountStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpenAccountStub(channel, callOptions);
    }

    /**
     */
    public void account(com.proto.account.AccountRequest request,
        io.grpc.stub.StreamObserver<com.proto.account.AccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *open account service : account rpc sends an  account request and returns a the account response
   * </pre>
   */
  public static final class OpenAccountBlockingStub extends io.grpc.stub.AbstractBlockingStub<OpenAccountBlockingStub> {
    private OpenAccountBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenAccountBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpenAccountBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.account.AccountResponse account(com.proto.account.AccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *open account service : account rpc sends an  account request and returns a the account response
   * </pre>
   */
  public static final class OpenAccountFutureStub extends io.grpc.stub.AbstractFutureStub<OpenAccountFutureStub> {
    private OpenAccountFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenAccountFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpenAccountFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.account.AccountResponse> account(
        com.proto.account.AccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OpenAccountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OpenAccountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCOUNT:
          serviceImpl.account((com.proto.account.AccountRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.account.AccountResponse>) responseObserver);
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

  private static abstract class OpenAccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OpenAccountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.account.Account.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OpenAccount");
    }
  }

  private static final class OpenAccountFileDescriptorSupplier
      extends OpenAccountBaseDescriptorSupplier {
    OpenAccountFileDescriptorSupplier() {}
  }

  private static final class OpenAccountMethodDescriptorSupplier
      extends OpenAccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OpenAccountMethodDescriptorSupplier(String methodName) {
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
      synchronized (OpenAccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OpenAccountFileDescriptorSupplier())
              .addMethod(getAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
