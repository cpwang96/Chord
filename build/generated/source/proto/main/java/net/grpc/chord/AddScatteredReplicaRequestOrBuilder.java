// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

public interface AddScatteredReplicaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chord.AddScatteredReplicaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>.chord.Identifier identifier = 3;</code>
   */
  boolean hasIdentifier();
  /**
   * <code>.chord.Identifier identifier = 3;</code>
   */
  net.grpc.chord.Identifier getIdentifier();
  /**
   * <code>.chord.Identifier identifier = 3;</code>
   */
  net.grpc.chord.IdentifierOrBuilder getIdentifierOrBuilder();
}