package net.grpc.chord;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: chordManagerService.proto")
public final class ChordManagerServiceGrpc {

  private ChordManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "chord.ChordManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.JoinRequest,
      net.grpc.chord.JoinResponse> getJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Join",
      requestType = net.grpc.chord.JoinRequest.class,
      responseType = net.grpc.chord.JoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.JoinRequest,
      net.grpc.chord.JoinResponse> getJoinMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.JoinRequest, net.grpc.chord.JoinResponse> getJoinMethod;
    if ((getJoinMethod = ChordManagerServiceGrpc.getJoinMethod) == null) {
      synchronized (ChordManagerServiceGrpc.class) {
        if ((getJoinMethod = ChordManagerServiceGrpc.getJoinMethod) == null) {
          ChordManagerServiceGrpc.getJoinMethod = getJoinMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.JoinRequest, net.grpc.chord.JoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordManagerService", "Join"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.JoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.JoinResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordManagerServiceMethodDescriptorSupplier("Join"))
                  .build();
          }
        }
     }
     return getJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.PutRequest,
      net.grpc.chord.PutResponse> getPutManagerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutManager",
      requestType = net.grpc.chord.PutRequest.class,
      responseType = net.grpc.chord.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.PutRequest,
      net.grpc.chord.PutResponse> getPutManagerMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.PutRequest, net.grpc.chord.PutResponse> getPutManagerMethod;
    if ((getPutManagerMethod = ChordManagerServiceGrpc.getPutManagerMethod) == null) {
      synchronized (ChordManagerServiceGrpc.class) {
        if ((getPutManagerMethod = ChordManagerServiceGrpc.getPutManagerMethod) == null) {
          ChordManagerServiceGrpc.getPutManagerMethod = getPutManagerMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.PutRequest, net.grpc.chord.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordManagerService", "PutManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.PutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordManagerServiceMethodDescriptorSupplier("PutManager"))
                  .build();
          }
        }
     }
     return getPutManagerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.GetRequest,
      net.grpc.chord.GetResponse> getGetManagerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetManager",
      requestType = net.grpc.chord.GetRequest.class,
      responseType = net.grpc.chord.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.GetRequest,
      net.grpc.chord.GetResponse> getGetManagerMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.GetRequest, net.grpc.chord.GetResponse> getGetManagerMethod;
    if ((getGetManagerMethod = ChordManagerServiceGrpc.getGetManagerMethod) == null) {
      synchronized (ChordManagerServiceGrpc.class) {
        if ((getGetManagerMethod = ChordManagerServiceGrpc.getGetManagerMethod) == null) {
          ChordManagerServiceGrpc.getGetManagerMethod = getGetManagerMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.GetRequest, net.grpc.chord.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordManagerService", "GetManager"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordManagerServiceMethodDescriptorSupplier("GetManager"))
                  .build();
          }
        }
     }
     return getGetManagerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.FindRequest,
      net.grpc.chord.FindResponse> getFindSuccessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindSuccessor",
      requestType = net.grpc.chord.FindRequest.class,
      responseType = net.grpc.chord.FindResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.FindRequest,
      net.grpc.chord.FindResponse> getFindSuccessorMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.FindRequest, net.grpc.chord.FindResponse> getFindSuccessorMethod;
    if ((getFindSuccessorMethod = ChordManagerServiceGrpc.getFindSuccessorMethod) == null) {
      synchronized (ChordManagerServiceGrpc.class) {
        if ((getFindSuccessorMethod = ChordManagerServiceGrpc.getFindSuccessorMethod) == null) {
          ChordManagerServiceGrpc.getFindSuccessorMethod = getFindSuccessorMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.FindRequest, net.grpc.chord.FindResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordManagerService", "FindSuccessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.FindRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.FindResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordManagerServiceMethodDescriptorSupplier("FindSuccessor"))
                  .build();
          }
        }
     }
     return getFindSuccessorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChordManagerServiceStub newStub(io.grpc.Channel channel) {
    return new ChordManagerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChordManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChordManagerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChordManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChordManagerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChordManagerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void join(net.grpc.chord.JoinRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.JoinResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinMethod(), responseObserver);
    }

    /**
     */
    public void putManager(net.grpc.chord.PutRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutManagerMethod(), responseObserver);
    }

    /**
     */
    public void getManager(net.grpc.chord.GetRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetManagerMethod(), responseObserver);
    }

    /**
     */
    public void findSuccessor(net.grpc.chord.FindRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.FindResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindSuccessorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getJoinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.JoinRequest,
                net.grpc.chord.JoinResponse>(
                  this, METHODID_JOIN)))
          .addMethod(
            getPutManagerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.PutRequest,
                net.grpc.chord.PutResponse>(
                  this, METHODID_PUT_MANAGER)))
          .addMethod(
            getGetManagerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.GetRequest,
                net.grpc.chord.GetResponse>(
                  this, METHODID_GET_MANAGER)))
          .addMethod(
            getFindSuccessorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.FindRequest,
                net.grpc.chord.FindResponse>(
                  this, METHODID_FIND_SUCCESSOR)))
          .build();
    }
  }

  /**
   */
  public static final class ChordManagerServiceStub extends io.grpc.stub.AbstractStub<ChordManagerServiceStub> {
    private ChordManagerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordManagerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChordManagerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordManagerServiceStub(channel, callOptions);
    }

    /**
     */
    public void join(net.grpc.chord.JoinRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.JoinResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putManager(net.grpc.chord.PutRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutManagerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getManager(net.grpc.chord.GetRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetManagerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findSuccessor(net.grpc.chord.FindRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.FindResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindSuccessorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChordManagerServiceBlockingStub extends io.grpc.stub.AbstractStub<ChordManagerServiceBlockingStub> {
    private ChordManagerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordManagerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChordManagerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.grpc.chord.JoinResponse join(net.grpc.chord.JoinRequest request) {
      return blockingUnaryCall(
          getChannel(), getJoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.PutResponse putManager(net.grpc.chord.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutManagerMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.GetResponse getManager(net.grpc.chord.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetManagerMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.FindResponse findSuccessor(net.grpc.chord.FindRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindSuccessorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChordManagerServiceFutureStub extends io.grpc.stub.AbstractStub<ChordManagerServiceFutureStub> {
    private ChordManagerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordManagerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChordManagerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordManagerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.JoinResponse> join(
        net.grpc.chord.JoinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.PutResponse> putManager(
        net.grpc.chord.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutManagerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.GetResponse> getManager(
        net.grpc.chord.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetManagerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.FindResponse> findSuccessor(
        net.grpc.chord.FindRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindSuccessorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOIN = 0;
  private static final int METHODID_PUT_MANAGER = 1;
  private static final int METHODID_GET_MANAGER = 2;
  private static final int METHODID_FIND_SUCCESSOR = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChordManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChordManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOIN:
          serviceImpl.join((net.grpc.chord.JoinRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.JoinResponse>) responseObserver);
          break;
        case METHODID_PUT_MANAGER:
          serviceImpl.putManager((net.grpc.chord.PutRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.PutResponse>) responseObserver);
          break;
        case METHODID_GET_MANAGER:
          serviceImpl.getManager((net.grpc.chord.GetRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.GetResponse>) responseObserver);
          break;
        case METHODID_FIND_SUCCESSOR:
          serviceImpl.findSuccessor((net.grpc.chord.FindRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.FindResponse>) responseObserver);
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

  private static abstract class ChordManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChordManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.grpc.chord.ChordManagerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChordManagerService");
    }
  }

  private static final class ChordManagerServiceFileDescriptorSupplier
      extends ChordManagerServiceBaseDescriptorSupplier {
    ChordManagerServiceFileDescriptorSupplier() {}
  }

  private static final class ChordManagerServiceMethodDescriptorSupplier
      extends ChordManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChordManagerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChordManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChordManagerServiceFileDescriptorSupplier())
              .addMethod(getJoinMethod())
              .addMethod(getPutManagerMethod())
              .addMethod(getGetManagerMethod())
              .addMethod(getFindSuccessorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
