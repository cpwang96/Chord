// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

public interface GetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chord.GetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chord.ReturnCode ret = 1;</code>
   */
  int getRetValue();
  /**
   * <code>.chord.ReturnCode ret = 1;</code>
   */
  net.grpc.chord.ReturnCode getRet();

  /**
   * <code>string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
