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
    comments = "Source: chordNodeService.proto")
public final class ChordNodeServiceGrpc {

  private ChordNodeServiceGrpc() {}

  public static final String SERVICE_NAME = "chord.ChordNodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.NotifyRequest,
      net.grpc.chord.NotifyResponse> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Notify",
      requestType = net.grpc.chord.NotifyRequest.class,
      responseType = net.grpc.chord.NotifyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.NotifyRequest,
      net.grpc.chord.NotifyResponse> getNotifyMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.NotifyRequest, net.grpc.chord.NotifyResponse> getNotifyMethod;
    if ((getNotifyMethod = ChordNodeServiceGrpc.getNotifyMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getNotifyMethod = ChordNodeServiceGrpc.getNotifyMethod) == null) {
          ChordNodeServiceGrpc.getNotifyMethod = getNotifyMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.NotifyRequest, net.grpc.chord.NotifyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "Notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.NotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.NotifyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("Notify"))
                  .build();
          }
        }
     }
     return getNotifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.FindSuccessorRequest,
      net.grpc.chord.FindSuccessorResponse> getFindSuccessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindSuccessor",
      requestType = net.grpc.chord.FindSuccessorRequest.class,
      responseType = net.grpc.chord.FindSuccessorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.FindSuccessorRequest,
      net.grpc.chord.FindSuccessorResponse> getFindSuccessorMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.FindSuccessorRequest, net.grpc.chord.FindSuccessorResponse> getFindSuccessorMethod;
    if ((getFindSuccessorMethod = ChordNodeServiceGrpc.getFindSuccessorMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getFindSuccessorMethod = ChordNodeServiceGrpc.getFindSuccessorMethod) == null) {
          ChordNodeServiceGrpc.getFindSuccessorMethod = getFindSuccessorMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.FindSuccessorRequest, net.grpc.chord.FindSuccessorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "FindSuccessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.FindSuccessorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.FindSuccessorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("FindSuccessor"))
                  .build();
          }
        }
     }
     return getFindSuccessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.InquirePredecessorRequest,
      net.grpc.chord.InquirePredecessorResponse> getInquirePredecessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InquirePredecessor",
      requestType = net.grpc.chord.InquirePredecessorRequest.class,
      responseType = net.grpc.chord.InquirePredecessorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.InquirePredecessorRequest,
      net.grpc.chord.InquirePredecessorResponse> getInquirePredecessorMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.InquirePredecessorRequest, net.grpc.chord.InquirePredecessorResponse> getInquirePredecessorMethod;
    if ((getInquirePredecessorMethod = ChordNodeServiceGrpc.getInquirePredecessorMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getInquirePredecessorMethod = ChordNodeServiceGrpc.getInquirePredecessorMethod) == null) {
          ChordNodeServiceGrpc.getInquirePredecessorMethod = getInquirePredecessorMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.InquirePredecessorRequest, net.grpc.chord.InquirePredecessorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "InquirePredecessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.InquirePredecessorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.InquirePredecessorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("InquirePredecessor"))
                  .build();
          }
        }
     }
     return getInquirePredecessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.PingRequest,
      net.grpc.chord.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = net.grpc.chord.PingRequest.class,
      responseType = net.grpc.chord.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.PingRequest,
      net.grpc.chord.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.PingRequest, net.grpc.chord.PingResponse> getPingMethod;
    if ((getPingMethod = ChordNodeServiceGrpc.getPingMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getPingMethod = ChordNodeServiceGrpc.getPingMethod) == null) {
          ChordNodeServiceGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.PingRequest, net.grpc.chord.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.PingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.TransferDataRequest,
      net.grpc.chord.TransferDataResponse> getTransferDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferData",
      requestType = net.grpc.chord.TransferDataRequest.class,
      responseType = net.grpc.chord.TransferDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.TransferDataRequest,
      net.grpc.chord.TransferDataResponse> getTransferDataMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.TransferDataRequest, net.grpc.chord.TransferDataResponse> getTransferDataMethod;
    if ((getTransferDataMethod = ChordNodeServiceGrpc.getTransferDataMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getTransferDataMethod = ChordNodeServiceGrpc.getTransferDataMethod) == null) {
          ChordNodeServiceGrpc.getTransferDataMethod = getTransferDataMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.TransferDataRequest, net.grpc.chord.TransferDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "TransferData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.TransferDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.TransferDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("TransferData"))
                  .build();
          }
        }
     }
     return getTransferDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.PutRequest,
      net.grpc.chord.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = net.grpc.chord.PutRequest.class,
      responseType = net.grpc.chord.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.PutRequest,
      net.grpc.chord.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.PutRequest, net.grpc.chord.PutResponse> getPutMethod;
    if ((getPutMethod = ChordNodeServiceGrpc.getPutMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getPutMethod = ChordNodeServiceGrpc.getPutMethod) == null) {
          ChordNodeServiceGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.PutRequest, net.grpc.chord.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.PutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("Put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.GetRequest,
      net.grpc.chord.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = net.grpc.chord.GetRequest.class,
      responseType = net.grpc.chord.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.GetRequest,
      net.grpc.chord.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.GetRequest, net.grpc.chord.GetResponse> getGetMethod;
    if ((getGetMethod = ChordNodeServiceGrpc.getGetMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getGetMethod = ChordNodeServiceGrpc.getGetMethod) == null) {
          ChordNodeServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.GetRequest, net.grpc.chord.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.InquireSuccessorsListRequest,
      net.grpc.chord.InquireSuccessorsListResponse> getInquireSuccessorsListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InquireSuccessorsList",
      requestType = net.grpc.chord.InquireSuccessorsListRequest.class,
      responseType = net.grpc.chord.InquireSuccessorsListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.InquireSuccessorsListRequest,
      net.grpc.chord.InquireSuccessorsListResponse> getInquireSuccessorsListMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.InquireSuccessorsListRequest, net.grpc.chord.InquireSuccessorsListResponse> getInquireSuccessorsListMethod;
    if ((getInquireSuccessorsListMethod = ChordNodeServiceGrpc.getInquireSuccessorsListMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getInquireSuccessorsListMethod = ChordNodeServiceGrpc.getInquireSuccessorsListMethod) == null) {
          ChordNodeServiceGrpc.getInquireSuccessorsListMethod = getInquireSuccessorsListMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.InquireSuccessorsListRequest, net.grpc.chord.InquireSuccessorsListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "InquireSuccessorsList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.InquireSuccessorsListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.InquireSuccessorsListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("InquireSuccessorsList"))
                  .build();
          }
        }
     }
     return getInquireSuccessorsListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.AcceptMyDataRequest,
      net.grpc.chord.AcceptMyDataResponse> getAcceptMyDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptMyData",
      requestType = net.grpc.chord.AcceptMyDataRequest.class,
      responseType = net.grpc.chord.AcceptMyDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.AcceptMyDataRequest,
      net.grpc.chord.AcceptMyDataResponse> getAcceptMyDataMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.AcceptMyDataRequest, net.grpc.chord.AcceptMyDataResponse> getAcceptMyDataMethod;
    if ((getAcceptMyDataMethod = ChordNodeServiceGrpc.getAcceptMyDataMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getAcceptMyDataMethod = ChordNodeServiceGrpc.getAcceptMyDataMethod) == null) {
          ChordNodeServiceGrpc.getAcceptMyDataMethod = getAcceptMyDataMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.AcceptMyDataRequest, net.grpc.chord.AcceptMyDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "AcceptMyData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.AcceptMyDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.AcceptMyDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("AcceptMyData"))
                  .build();
          }
        }
     }
     return getAcceptMyDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.RemoveReplicaRequest,
      net.grpc.chord.RemoveReplicaResponse> getRemoveReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveReplica",
      requestType = net.grpc.chord.RemoveReplicaRequest.class,
      responseType = net.grpc.chord.RemoveReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.RemoveReplicaRequest,
      net.grpc.chord.RemoveReplicaResponse> getRemoveReplicaMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.RemoveReplicaRequest, net.grpc.chord.RemoveReplicaResponse> getRemoveReplicaMethod;
    if ((getRemoveReplicaMethod = ChordNodeServiceGrpc.getRemoveReplicaMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getRemoveReplicaMethod = ChordNodeServiceGrpc.getRemoveReplicaMethod) == null) {
          ChordNodeServiceGrpc.getRemoveReplicaMethod = getRemoveReplicaMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.RemoveReplicaRequest, net.grpc.chord.RemoveReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "RemoveReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.RemoveReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.RemoveReplicaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("RemoveReplica"))
                  .build();
          }
        }
     }
     return getRemoveReplicaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.AddReplicaRequest,
      net.grpc.chord.AddReplicaResponse> getAddReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReplica",
      requestType = net.grpc.chord.AddReplicaRequest.class,
      responseType = net.grpc.chord.AddReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.AddReplicaRequest,
      net.grpc.chord.AddReplicaResponse> getAddReplicaMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.AddReplicaRequest, net.grpc.chord.AddReplicaResponse> getAddReplicaMethod;
    if ((getAddReplicaMethod = ChordNodeServiceGrpc.getAddReplicaMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getAddReplicaMethod = ChordNodeServiceGrpc.getAddReplicaMethod) == null) {
          ChordNodeServiceGrpc.getAddReplicaMethod = getAddReplicaMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.AddReplicaRequest, net.grpc.chord.AddReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "AddReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.AddReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.AddReplicaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("AddReplica"))
                  .build();
          }
        }
     }
     return getAddReplicaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.AddScatteredReplicaRequest,
      net.grpc.chord.AddScatteredReplicaResponse> getAddScatteredReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddScatteredReplica",
      requestType = net.grpc.chord.AddScatteredReplicaRequest.class,
      responseType = net.grpc.chord.AddScatteredReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.AddScatteredReplicaRequest,
      net.grpc.chord.AddScatteredReplicaResponse> getAddScatteredReplicaMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.AddScatteredReplicaRequest, net.grpc.chord.AddScatteredReplicaResponse> getAddScatteredReplicaMethod;
    if ((getAddScatteredReplicaMethod = ChordNodeServiceGrpc.getAddScatteredReplicaMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getAddScatteredReplicaMethod = ChordNodeServiceGrpc.getAddScatteredReplicaMethod) == null) {
          ChordNodeServiceGrpc.getAddScatteredReplicaMethod = getAddScatteredReplicaMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.AddScatteredReplicaRequest, net.grpc.chord.AddScatteredReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "AddScatteredReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.AddScatteredReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.AddScatteredReplicaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("AddScatteredReplica"))
                  .build();
          }
        }
     }
     return getAddScatteredReplicaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.AddMultipleScatteredReplicaRequest,
      net.grpc.chord.AddMultipleScatteredReplicaResponse> getAddMultipleScatteredReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultipleScatteredReplica",
      requestType = net.grpc.chord.AddMultipleScatteredReplicaRequest.class,
      responseType = net.grpc.chord.AddMultipleScatteredReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.AddMultipleScatteredReplicaRequest,
      net.grpc.chord.AddMultipleScatteredReplicaResponse> getAddMultipleScatteredReplicaMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.AddMultipleScatteredReplicaRequest, net.grpc.chord.AddMultipleScatteredReplicaResponse> getAddMultipleScatteredReplicaMethod;
    if ((getAddMultipleScatteredReplicaMethod = ChordNodeServiceGrpc.getAddMultipleScatteredReplicaMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getAddMultipleScatteredReplicaMethod = ChordNodeServiceGrpc.getAddMultipleScatteredReplicaMethod) == null) {
          ChordNodeServiceGrpc.getAddMultipleScatteredReplicaMethod = getAddMultipleScatteredReplicaMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.AddMultipleScatteredReplicaRequest, net.grpc.chord.AddMultipleScatteredReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "AddMultipleScatteredReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.AddMultipleScatteredReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.AddMultipleScatteredReplicaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("AddMultipleScatteredReplica"))
                  .build();
          }
        }
     }
     return getAddMultipleScatteredReplicaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.RemoveMultipleScatteredReplicaRequest,
      net.grpc.chord.RemoveMultipleScatteredReplicaResponse> getRemoveMultipleScatteredReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMultipleScatteredReplica",
      requestType = net.grpc.chord.RemoveMultipleScatteredReplicaRequest.class,
      responseType = net.grpc.chord.RemoveMultipleScatteredReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.RemoveMultipleScatteredReplicaRequest,
      net.grpc.chord.RemoveMultipleScatteredReplicaResponse> getRemoveMultipleScatteredReplicaMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.RemoveMultipleScatteredReplicaRequest, net.grpc.chord.RemoveMultipleScatteredReplicaResponse> getRemoveMultipleScatteredReplicaMethod;
    if ((getRemoveMultipleScatteredReplicaMethod = ChordNodeServiceGrpc.getRemoveMultipleScatteredReplicaMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getRemoveMultipleScatteredReplicaMethod = ChordNodeServiceGrpc.getRemoveMultipleScatteredReplicaMethod) == null) {
          ChordNodeServiceGrpc.getRemoveMultipleScatteredReplicaMethod = getRemoveMultipleScatteredReplicaMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.RemoveMultipleScatteredReplicaRequest, net.grpc.chord.RemoveMultipleScatteredReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "RemoveMultipleScatteredReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.RemoveMultipleScatteredReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.RemoveMultipleScatteredReplicaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("RemoveMultipleScatteredReplica"))
                  .build();
          }
        }
     }
     return getRemoveMultipleScatteredReplicaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.MeasureDistanceRequest,
      net.grpc.chord.MeasureDistanceResponse> getMeasureDistanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MeasureDistance",
      requestType = net.grpc.chord.MeasureDistanceRequest.class,
      responseType = net.grpc.chord.MeasureDistanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.MeasureDistanceRequest,
      net.grpc.chord.MeasureDistanceResponse> getMeasureDistanceMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.MeasureDistanceRequest, net.grpc.chord.MeasureDistanceResponse> getMeasureDistanceMethod;
    if ((getMeasureDistanceMethod = ChordNodeServiceGrpc.getMeasureDistanceMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getMeasureDistanceMethod = ChordNodeServiceGrpc.getMeasureDistanceMethod) == null) {
          ChordNodeServiceGrpc.getMeasureDistanceMethod = getMeasureDistanceMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.MeasureDistanceRequest, net.grpc.chord.MeasureDistanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "MeasureDistance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.MeasureDistanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.MeasureDistanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("MeasureDistance"))
                  .build();
          }
        }
     }
     return getMeasureDistanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.TellmeKeyNumberRequest,
      net.grpc.chord.TellmeKeyNumberResponse> getTellmeKeyNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TellmeKeyNumber",
      requestType = net.grpc.chord.TellmeKeyNumberRequest.class,
      responseType = net.grpc.chord.TellmeKeyNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.TellmeKeyNumberRequest,
      net.grpc.chord.TellmeKeyNumberResponse> getTellmeKeyNumberMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.TellmeKeyNumberRequest, net.grpc.chord.TellmeKeyNumberResponse> getTellmeKeyNumberMethod;
    if ((getTellmeKeyNumberMethod = ChordNodeServiceGrpc.getTellmeKeyNumberMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getTellmeKeyNumberMethod = ChordNodeServiceGrpc.getTellmeKeyNumberMethod) == null) {
          ChordNodeServiceGrpc.getTellmeKeyNumberMethod = getTellmeKeyNumberMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.TellmeKeyNumberRequest, net.grpc.chord.TellmeKeyNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "TellmeKeyNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.TellmeKeyNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.TellmeKeyNumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("TellmeKeyNumber"))
                  .build();
          }
        }
     }
     return getTellmeKeyNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.TellmeFingerTableRequest,
      net.grpc.chord.TellmeFingerTableResponse> getTellmeFingerTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TellmeFingerTable",
      requestType = net.grpc.chord.TellmeFingerTableRequest.class,
      responseType = net.grpc.chord.TellmeFingerTableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.TellmeFingerTableRequest,
      net.grpc.chord.TellmeFingerTableResponse> getTellmeFingerTableMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.TellmeFingerTableRequest, net.grpc.chord.TellmeFingerTableResponse> getTellmeFingerTableMethod;
    if ((getTellmeFingerTableMethod = ChordNodeServiceGrpc.getTellmeFingerTableMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getTellmeFingerTableMethod = ChordNodeServiceGrpc.getTellmeFingerTableMethod) == null) {
          ChordNodeServiceGrpc.getTellmeFingerTableMethod = getTellmeFingerTableMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.TellmeFingerTableRequest, net.grpc.chord.TellmeFingerTableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "TellmeFingerTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.TellmeFingerTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.TellmeFingerTableResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("TellmeFingerTable"))
                  .build();
          }
        }
     }
     return getTellmeFingerTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.TellmeReplicaKeyNumberRequest,
      net.grpc.chord.TellmeReplicaKeyNumberResponse> getTellmeReplicaKeyNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TellmeReplicaKeyNumber",
      requestType = net.grpc.chord.TellmeReplicaKeyNumberRequest.class,
      responseType = net.grpc.chord.TellmeReplicaKeyNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.TellmeReplicaKeyNumberRequest,
      net.grpc.chord.TellmeReplicaKeyNumberResponse> getTellmeReplicaKeyNumberMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.TellmeReplicaKeyNumberRequest, net.grpc.chord.TellmeReplicaKeyNumberResponse> getTellmeReplicaKeyNumberMethod;
    if ((getTellmeReplicaKeyNumberMethod = ChordNodeServiceGrpc.getTellmeReplicaKeyNumberMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getTellmeReplicaKeyNumberMethod = ChordNodeServiceGrpc.getTellmeReplicaKeyNumberMethod) == null) {
          ChordNodeServiceGrpc.getTellmeReplicaKeyNumberMethod = getTellmeReplicaKeyNumberMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.TellmeReplicaKeyNumberRequest, net.grpc.chord.TellmeReplicaKeyNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "TellmeReplicaKeyNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.TellmeReplicaKeyNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.TellmeReplicaKeyNumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("TellmeReplicaKeyNumber"))
                  .build();
          }
        }
     }
     return getTellmeReplicaKeyNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.KillRequest,
      net.grpc.chord.KillResponse> getKillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Kill",
      requestType = net.grpc.chord.KillRequest.class,
      responseType = net.grpc.chord.KillResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.KillRequest,
      net.grpc.chord.KillResponse> getKillMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.KillRequest, net.grpc.chord.KillResponse> getKillMethod;
    if ((getKillMethod = ChordNodeServiceGrpc.getKillMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getKillMethod = ChordNodeServiceGrpc.getKillMethod) == null) {
          ChordNodeServiceGrpc.getKillMethod = getKillMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.KillRequest, net.grpc.chord.KillResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "Kill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.KillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.KillResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("Kill"))
                  .build();
          }
        }
     }
     return getKillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.grpc.chord.FindSuccessorIterativelyRequest,
      net.grpc.chord.FindSuccessorIterativelyResponse> getFindSuccessorIterativelyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindSuccessorIteratively",
      requestType = net.grpc.chord.FindSuccessorIterativelyRequest.class,
      responseType = net.grpc.chord.FindSuccessorIterativelyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.grpc.chord.FindSuccessorIterativelyRequest,
      net.grpc.chord.FindSuccessorIterativelyResponse> getFindSuccessorIterativelyMethod() {
    io.grpc.MethodDescriptor<net.grpc.chord.FindSuccessorIterativelyRequest, net.grpc.chord.FindSuccessorIterativelyResponse> getFindSuccessorIterativelyMethod;
    if ((getFindSuccessorIterativelyMethod = ChordNodeServiceGrpc.getFindSuccessorIterativelyMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getFindSuccessorIterativelyMethod = ChordNodeServiceGrpc.getFindSuccessorIterativelyMethod) == null) {
          ChordNodeServiceGrpc.getFindSuccessorIterativelyMethod = getFindSuccessorIterativelyMethod = 
              io.grpc.MethodDescriptor.<net.grpc.chord.FindSuccessorIterativelyRequest, net.grpc.chord.FindSuccessorIterativelyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "FindSuccessorIteratively"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.FindSuccessorIterativelyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.grpc.chord.FindSuccessorIterativelyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("FindSuccessorIteratively"))
                  .build();
          }
        }
     }
     return getFindSuccessorIterativelyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChordNodeServiceStub newStub(io.grpc.Channel channel) {
    return new ChordNodeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChordNodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChordNodeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChordNodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChordNodeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChordNodeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    function
     * </pre>
     */
    public void notify(net.grpc.chord.NotifyRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.NotifyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    /**
     */
    public void findSuccessor(net.grpc.chord.FindSuccessorRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.FindSuccessorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindSuccessorMethod(), responseObserver);
    }

    /**
     */
    public void inquirePredecessor(net.grpc.chord.InquirePredecessorRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.InquirePredecessorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInquirePredecessorMethod(), responseObserver);
    }

    /**
     */
    public void ping(net.grpc.chord.PingRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void transferData(net.grpc.chord.TransferDataRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.TransferDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferDataMethod(), responseObserver);
    }

    /**
     */
    public void put(net.grpc.chord.PutRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(net.grpc.chord.GetRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void inquireSuccessorsList(net.grpc.chord.InquireSuccessorsListRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.InquireSuccessorsListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInquireSuccessorsListMethod(), responseObserver);
    }

    /**
     */
    public void acceptMyData(net.grpc.chord.AcceptMyDataRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.AcceptMyDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAcceptMyDataMethod(), responseObserver);
    }

    /**
     */
    public void removeReplica(net.grpc.chord.RemoveReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.RemoveReplicaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveReplicaMethod(), responseObserver);
    }

    /**
     */
    public void addReplica(net.grpc.chord.AddReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.AddReplicaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddReplicaMethod(), responseObserver);
    }

    /**
     */
    public void addScatteredReplica(net.grpc.chord.AddScatteredReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.AddScatteredReplicaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddScatteredReplicaMethod(), responseObserver);
    }

    /**
     */
    public void addMultipleScatteredReplica(net.grpc.chord.AddMultipleScatteredReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.AddMultipleScatteredReplicaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMultipleScatteredReplicaMethod(), responseObserver);
    }

    /**
     */
    public void removeMultipleScatteredReplica(net.grpc.chord.RemoveMultipleScatteredReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.RemoveMultipleScatteredReplicaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMultipleScatteredReplicaMethod(), responseObserver);
    }

    /**
     */
    public void measureDistance(net.grpc.chord.MeasureDistanceRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.MeasureDistanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMeasureDistanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *    for evalution
     * </pre>
     */
    public void tellmeKeyNumber(net.grpc.chord.TellmeKeyNumberRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.TellmeKeyNumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTellmeKeyNumberMethod(), responseObserver);
    }

    /**
     */
    public void tellmeFingerTable(net.grpc.chord.TellmeFingerTableRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.TellmeFingerTableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTellmeFingerTableMethod(), responseObserver);
    }

    /**
     */
    public void tellmeReplicaKeyNumber(net.grpc.chord.TellmeReplicaKeyNumberRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.TellmeReplicaKeyNumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTellmeReplicaKeyNumberMethod(), responseObserver);
    }

    /**
     */
    public void kill(net.grpc.chord.KillRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.KillResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getKillMethod(), responseObserver);
    }

    /**
     */
    public void findSuccessorIteratively(net.grpc.chord.FindSuccessorIterativelyRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.FindSuccessorIterativelyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindSuccessorIterativelyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.NotifyRequest,
                net.grpc.chord.NotifyResponse>(
                  this, METHODID_NOTIFY)))
          .addMethod(
            getFindSuccessorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.FindSuccessorRequest,
                net.grpc.chord.FindSuccessorResponse>(
                  this, METHODID_FIND_SUCCESSOR)))
          .addMethod(
            getInquirePredecessorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.InquirePredecessorRequest,
                net.grpc.chord.InquirePredecessorResponse>(
                  this, METHODID_INQUIRE_PREDECESSOR)))
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.PingRequest,
                net.grpc.chord.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getTransferDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.TransferDataRequest,
                net.grpc.chord.TransferDataResponse>(
                  this, METHODID_TRANSFER_DATA)))
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.PutRequest,
                net.grpc.chord.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.GetRequest,
                net.grpc.chord.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getInquireSuccessorsListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.InquireSuccessorsListRequest,
                net.grpc.chord.InquireSuccessorsListResponse>(
                  this, METHODID_INQUIRE_SUCCESSORS_LIST)))
          .addMethod(
            getAcceptMyDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.AcceptMyDataRequest,
                net.grpc.chord.AcceptMyDataResponse>(
                  this, METHODID_ACCEPT_MY_DATA)))
          .addMethod(
            getRemoveReplicaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.RemoveReplicaRequest,
                net.grpc.chord.RemoveReplicaResponse>(
                  this, METHODID_REMOVE_REPLICA)))
          .addMethod(
            getAddReplicaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.AddReplicaRequest,
                net.grpc.chord.AddReplicaResponse>(
                  this, METHODID_ADD_REPLICA)))
          .addMethod(
            getAddScatteredReplicaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.AddScatteredReplicaRequest,
                net.grpc.chord.AddScatteredReplicaResponse>(
                  this, METHODID_ADD_SCATTERED_REPLICA)))
          .addMethod(
            getAddMultipleScatteredReplicaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.AddMultipleScatteredReplicaRequest,
                net.grpc.chord.AddMultipleScatteredReplicaResponse>(
                  this, METHODID_ADD_MULTIPLE_SCATTERED_REPLICA)))
          .addMethod(
            getRemoveMultipleScatteredReplicaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.RemoveMultipleScatteredReplicaRequest,
                net.grpc.chord.RemoveMultipleScatteredReplicaResponse>(
                  this, METHODID_REMOVE_MULTIPLE_SCATTERED_REPLICA)))
          .addMethod(
            getMeasureDistanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.MeasureDistanceRequest,
                net.grpc.chord.MeasureDistanceResponse>(
                  this, METHODID_MEASURE_DISTANCE)))
          .addMethod(
            getTellmeKeyNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.TellmeKeyNumberRequest,
                net.grpc.chord.TellmeKeyNumberResponse>(
                  this, METHODID_TELLME_KEY_NUMBER)))
          .addMethod(
            getTellmeFingerTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.TellmeFingerTableRequest,
                net.grpc.chord.TellmeFingerTableResponse>(
                  this, METHODID_TELLME_FINGER_TABLE)))
          .addMethod(
            getTellmeReplicaKeyNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.TellmeReplicaKeyNumberRequest,
                net.grpc.chord.TellmeReplicaKeyNumberResponse>(
                  this, METHODID_TELLME_REPLICA_KEY_NUMBER)))
          .addMethod(
            getKillMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.KillRequest,
                net.grpc.chord.KillResponse>(
                  this, METHODID_KILL)))
          .addMethod(
            getFindSuccessorIterativelyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.grpc.chord.FindSuccessorIterativelyRequest,
                net.grpc.chord.FindSuccessorIterativelyResponse>(
                  this, METHODID_FIND_SUCCESSOR_ITERATIVELY)))
          .build();
    }
  }

  /**
   */
  public static final class ChordNodeServiceStub extends io.grpc.stub.AbstractStub<ChordNodeServiceStub> {
    private ChordNodeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordNodeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChordNodeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordNodeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *    function
     * </pre>
     */
    public void notify(net.grpc.chord.NotifyRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.NotifyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findSuccessor(net.grpc.chord.FindSuccessorRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.FindSuccessorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindSuccessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inquirePredecessor(net.grpc.chord.InquirePredecessorRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.InquirePredecessorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInquirePredecessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ping(net.grpc.chord.PingRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferData(net.grpc.chord.TransferDataRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.TransferDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void put(net.grpc.chord.PutRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(net.grpc.chord.GetRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inquireSuccessorsList(net.grpc.chord.InquireSuccessorsListRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.InquireSuccessorsListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInquireSuccessorsListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void acceptMyData(net.grpc.chord.AcceptMyDataRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.AcceptMyDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcceptMyDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeReplica(net.grpc.chord.RemoveReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.RemoveReplicaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveReplicaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addReplica(net.grpc.chord.AddReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.AddReplicaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddReplicaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addScatteredReplica(net.grpc.chord.AddScatteredReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.AddScatteredReplicaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddScatteredReplicaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMultipleScatteredReplica(net.grpc.chord.AddMultipleScatteredReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.AddMultipleScatteredReplicaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMultipleScatteredReplicaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMultipleScatteredReplica(net.grpc.chord.RemoveMultipleScatteredReplicaRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.RemoveMultipleScatteredReplicaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMultipleScatteredReplicaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void measureDistance(net.grpc.chord.MeasureDistanceRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.MeasureDistanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMeasureDistanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    for evalution
     * </pre>
     */
    public void tellmeKeyNumber(net.grpc.chord.TellmeKeyNumberRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.TellmeKeyNumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTellmeKeyNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tellmeFingerTable(net.grpc.chord.TellmeFingerTableRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.TellmeFingerTableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTellmeFingerTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tellmeReplicaKeyNumber(net.grpc.chord.TellmeReplicaKeyNumberRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.TellmeReplicaKeyNumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTellmeReplicaKeyNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kill(net.grpc.chord.KillRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.KillResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findSuccessorIteratively(net.grpc.chord.FindSuccessorIterativelyRequest request,
        io.grpc.stub.StreamObserver<net.grpc.chord.FindSuccessorIterativelyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindSuccessorIterativelyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChordNodeServiceBlockingStub extends io.grpc.stub.AbstractStub<ChordNodeServiceBlockingStub> {
    private ChordNodeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordNodeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChordNodeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordNodeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    function
     * </pre>
     */
    public net.grpc.chord.NotifyResponse notify(net.grpc.chord.NotifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.FindSuccessorResponse findSuccessor(net.grpc.chord.FindSuccessorRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindSuccessorMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.InquirePredecessorResponse inquirePredecessor(net.grpc.chord.InquirePredecessorRequest request) {
      return blockingUnaryCall(
          getChannel(), getInquirePredecessorMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.PingResponse ping(net.grpc.chord.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.TransferDataResponse transferData(net.grpc.chord.TransferDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getTransferDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.PutResponse put(net.grpc.chord.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.GetResponse get(net.grpc.chord.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.InquireSuccessorsListResponse inquireSuccessorsList(net.grpc.chord.InquireSuccessorsListRequest request) {
      return blockingUnaryCall(
          getChannel(), getInquireSuccessorsListMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.AcceptMyDataResponse acceptMyData(net.grpc.chord.AcceptMyDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getAcceptMyDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.RemoveReplicaResponse removeReplica(net.grpc.chord.RemoveReplicaRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveReplicaMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.AddReplicaResponse addReplica(net.grpc.chord.AddReplicaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddReplicaMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.AddScatteredReplicaResponse addScatteredReplica(net.grpc.chord.AddScatteredReplicaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddScatteredReplicaMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.AddMultipleScatteredReplicaResponse addMultipleScatteredReplica(net.grpc.chord.AddMultipleScatteredReplicaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMultipleScatteredReplicaMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.RemoveMultipleScatteredReplicaResponse removeMultipleScatteredReplica(net.grpc.chord.RemoveMultipleScatteredReplicaRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMultipleScatteredReplicaMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.MeasureDistanceResponse measureDistance(net.grpc.chord.MeasureDistanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getMeasureDistanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *    for evalution
     * </pre>
     */
    public net.grpc.chord.TellmeKeyNumberResponse tellmeKeyNumber(net.grpc.chord.TellmeKeyNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getTellmeKeyNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.TellmeFingerTableResponse tellmeFingerTable(net.grpc.chord.TellmeFingerTableRequest request) {
      return blockingUnaryCall(
          getChannel(), getTellmeFingerTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.TellmeReplicaKeyNumberResponse tellmeReplicaKeyNumber(net.grpc.chord.TellmeReplicaKeyNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getTellmeReplicaKeyNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.KillResponse kill(net.grpc.chord.KillRequest request) {
      return blockingUnaryCall(
          getChannel(), getKillMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.grpc.chord.FindSuccessorIterativelyResponse findSuccessorIteratively(net.grpc.chord.FindSuccessorIterativelyRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindSuccessorIterativelyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChordNodeServiceFutureStub extends io.grpc.stub.AbstractStub<ChordNodeServiceFutureStub> {
    private ChordNodeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordNodeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChordNodeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordNodeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    function
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.NotifyResponse> notify(
        net.grpc.chord.NotifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.FindSuccessorResponse> findSuccessor(
        net.grpc.chord.FindSuccessorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindSuccessorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.InquirePredecessorResponse> inquirePredecessor(
        net.grpc.chord.InquirePredecessorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInquirePredecessorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.PingResponse> ping(
        net.grpc.chord.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.TransferDataResponse> transferData(
        net.grpc.chord.TransferDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.PutResponse> put(
        net.grpc.chord.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.GetResponse> get(
        net.grpc.chord.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.InquireSuccessorsListResponse> inquireSuccessorsList(
        net.grpc.chord.InquireSuccessorsListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInquireSuccessorsListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.AcceptMyDataResponse> acceptMyData(
        net.grpc.chord.AcceptMyDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAcceptMyDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.RemoveReplicaResponse> removeReplica(
        net.grpc.chord.RemoveReplicaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveReplicaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.AddReplicaResponse> addReplica(
        net.grpc.chord.AddReplicaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddReplicaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.AddScatteredReplicaResponse> addScatteredReplica(
        net.grpc.chord.AddScatteredReplicaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddScatteredReplicaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.AddMultipleScatteredReplicaResponse> addMultipleScatteredReplica(
        net.grpc.chord.AddMultipleScatteredReplicaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMultipleScatteredReplicaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.RemoveMultipleScatteredReplicaResponse> removeMultipleScatteredReplica(
        net.grpc.chord.RemoveMultipleScatteredReplicaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMultipleScatteredReplicaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.MeasureDistanceResponse> measureDistance(
        net.grpc.chord.MeasureDistanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMeasureDistanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *    for evalution
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.TellmeKeyNumberResponse> tellmeKeyNumber(
        net.grpc.chord.TellmeKeyNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTellmeKeyNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.TellmeFingerTableResponse> tellmeFingerTable(
        net.grpc.chord.TellmeFingerTableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTellmeFingerTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.TellmeReplicaKeyNumberResponse> tellmeReplicaKeyNumber(
        net.grpc.chord.TellmeReplicaKeyNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTellmeReplicaKeyNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.KillResponse> kill(
        net.grpc.chord.KillRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKillMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.grpc.chord.FindSuccessorIterativelyResponse> findSuccessorIteratively(
        net.grpc.chord.FindSuccessorIterativelyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindSuccessorIterativelyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY = 0;
  private static final int METHODID_FIND_SUCCESSOR = 1;
  private static final int METHODID_INQUIRE_PREDECESSOR = 2;
  private static final int METHODID_PING = 3;
  private static final int METHODID_TRANSFER_DATA = 4;
  private static final int METHODID_PUT = 5;
  private static final int METHODID_GET = 6;
  private static final int METHODID_INQUIRE_SUCCESSORS_LIST = 7;
  private static final int METHODID_ACCEPT_MY_DATA = 8;
  private static final int METHODID_REMOVE_REPLICA = 9;
  private static final int METHODID_ADD_REPLICA = 10;
  private static final int METHODID_ADD_SCATTERED_REPLICA = 11;
  private static final int METHODID_ADD_MULTIPLE_SCATTERED_REPLICA = 12;
  private static final int METHODID_REMOVE_MULTIPLE_SCATTERED_REPLICA = 13;
  private static final int METHODID_MEASURE_DISTANCE = 14;
  private static final int METHODID_TELLME_KEY_NUMBER = 15;
  private static final int METHODID_TELLME_FINGER_TABLE = 16;
  private static final int METHODID_TELLME_REPLICA_KEY_NUMBER = 17;
  private static final int METHODID_KILL = 18;
  private static final int METHODID_FIND_SUCCESSOR_ITERATIVELY = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChordNodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChordNodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY:
          serviceImpl.notify((net.grpc.chord.NotifyRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.NotifyResponse>) responseObserver);
          break;
        case METHODID_FIND_SUCCESSOR:
          serviceImpl.findSuccessor((net.grpc.chord.FindSuccessorRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.FindSuccessorResponse>) responseObserver);
          break;
        case METHODID_INQUIRE_PREDECESSOR:
          serviceImpl.inquirePredecessor((net.grpc.chord.InquirePredecessorRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.InquirePredecessorResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((net.grpc.chord.PingRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.PingResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_DATA:
          serviceImpl.transferData((net.grpc.chord.TransferDataRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.TransferDataResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((net.grpc.chord.PutRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((net.grpc.chord.GetRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.GetResponse>) responseObserver);
          break;
        case METHODID_INQUIRE_SUCCESSORS_LIST:
          serviceImpl.inquireSuccessorsList((net.grpc.chord.InquireSuccessorsListRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.InquireSuccessorsListResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_MY_DATA:
          serviceImpl.acceptMyData((net.grpc.chord.AcceptMyDataRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.AcceptMyDataResponse>) responseObserver);
          break;
        case METHODID_REMOVE_REPLICA:
          serviceImpl.removeReplica((net.grpc.chord.RemoveReplicaRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.RemoveReplicaResponse>) responseObserver);
          break;
        case METHODID_ADD_REPLICA:
          serviceImpl.addReplica((net.grpc.chord.AddReplicaRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.AddReplicaResponse>) responseObserver);
          break;
        case METHODID_ADD_SCATTERED_REPLICA:
          serviceImpl.addScatteredReplica((net.grpc.chord.AddScatteredReplicaRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.AddScatteredReplicaResponse>) responseObserver);
          break;
        case METHODID_ADD_MULTIPLE_SCATTERED_REPLICA:
          serviceImpl.addMultipleScatteredReplica((net.grpc.chord.AddMultipleScatteredReplicaRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.AddMultipleScatteredReplicaResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MULTIPLE_SCATTERED_REPLICA:
          serviceImpl.removeMultipleScatteredReplica((net.grpc.chord.RemoveMultipleScatteredReplicaRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.RemoveMultipleScatteredReplicaResponse>) responseObserver);
          break;
        case METHODID_MEASURE_DISTANCE:
          serviceImpl.measureDistance((net.grpc.chord.MeasureDistanceRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.MeasureDistanceResponse>) responseObserver);
          break;
        case METHODID_TELLME_KEY_NUMBER:
          serviceImpl.tellmeKeyNumber((net.grpc.chord.TellmeKeyNumberRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.TellmeKeyNumberResponse>) responseObserver);
          break;
        case METHODID_TELLME_FINGER_TABLE:
          serviceImpl.tellmeFingerTable((net.grpc.chord.TellmeFingerTableRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.TellmeFingerTableResponse>) responseObserver);
          break;
        case METHODID_TELLME_REPLICA_KEY_NUMBER:
          serviceImpl.tellmeReplicaKeyNumber((net.grpc.chord.TellmeReplicaKeyNumberRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.TellmeReplicaKeyNumberResponse>) responseObserver);
          break;
        case METHODID_KILL:
          serviceImpl.kill((net.grpc.chord.KillRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.KillResponse>) responseObserver);
          break;
        case METHODID_FIND_SUCCESSOR_ITERATIVELY:
          serviceImpl.findSuccessorIteratively((net.grpc.chord.FindSuccessorIterativelyRequest) request,
              (io.grpc.stub.StreamObserver<net.grpc.chord.FindSuccessorIterativelyResponse>) responseObserver);
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

  private static abstract class ChordNodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChordNodeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.grpc.chord.ChordNodeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChordNodeService");
    }
  }

  private static final class ChordNodeServiceFileDescriptorSupplier
      extends ChordNodeServiceBaseDescriptorSupplier {
    ChordNodeServiceFileDescriptorSupplier() {}
  }

  private static final class ChordNodeServiceMethodDescriptorSupplier
      extends ChordNodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChordNodeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChordNodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChordNodeServiceFileDescriptorSupplier())
              .addMethod(getNotifyMethod())
              .addMethod(getFindSuccessorMethod())
              .addMethod(getInquirePredecessorMethod())
              .addMethod(getPingMethod())
              .addMethod(getTransferDataMethod())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getInquireSuccessorsListMethod())
              .addMethod(getAcceptMyDataMethod())
              .addMethod(getRemoveReplicaMethod())
              .addMethod(getAddReplicaMethod())
              .addMethod(getAddScatteredReplicaMethod())
              .addMethod(getAddMultipleScatteredReplicaMethod())
              .addMethod(getRemoveMultipleScatteredReplicaMethod())
              .addMethod(getMeasureDistanceMethod())
              .addMethod(getTellmeKeyNumberMethod())
              .addMethod(getTellmeFingerTableMethod())
              .addMethod(getTellmeReplicaKeyNumberMethod())
              .addMethod(getKillMethod())
              .addMethod(getFindSuccessorIterativelyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
