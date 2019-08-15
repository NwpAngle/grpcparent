package com.nwp.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: user_service.proto")
public class UserServiceGrpcGrpc {

  private UserServiceGrpcGrpc() {}

  public static final String SERVICE_NAME = "com.nwp.service.UserServiceGrpc";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.nwp.model.User,
      com.nwp.model.Greeting> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.nwp.service.UserServiceGrpc", "sayHello"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.nwp.model.User.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.nwp.model.Greeting.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceGrpcStub newStub(io.grpc.Channel channel) {
    return new UserServiceGrpcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceGrpcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceGrpcFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.nwp.model.User request,
        io.grpc.stub.StreamObserver<com.nwp.model.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
    }

     public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                com.nwp.model.User,
                com.nwp.model.Greeting>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceGrpcStub extends io.grpc.stub.AbstractStub<UserServiceGrpcStub> {
    private UserServiceGrpcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceGrpcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceGrpcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceGrpcStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.nwp.model.User request,
        io.grpc.stub.StreamObserver<com.nwp.model.Greeting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceGrpcBlockingStub extends io.grpc.stub.AbstractStub<UserServiceGrpcBlockingStub> {
    private UserServiceGrpcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceGrpcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceGrpcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nwp.model.Greeting sayHello(com.nwp.model.User request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceGrpcFutureStub extends io.grpc.stub.AbstractStub<UserServiceGrpcFutureStub> {
    private UserServiceGrpcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceGrpcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceGrpcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nwp.model.Greeting> sayHello(
        com.nwp.model.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceGrpcImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(UserServiceGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.nwp.model.User) request,
              (io.grpc.stub.StreamObserver<com.nwp.model.Greeting>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_SAY_HELLO);
  }

}
