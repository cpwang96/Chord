// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

public interface RemoveMultipleScatteredReplicaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chord.RemoveMultipleScatteredReplicaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string key = 1;</code>
   */
  java.util.List<java.lang.String>
      getKeyList();
  /**
   * <code>repeated string key = 1;</code>
   */
  int getKeyCount();
  /**
   * <code>repeated string key = 1;</code>
   */
  java.lang.String getKey(int index);
  /**
   * <code>repeated string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes(int index);

  /**
   * <code>.chord.Identifier identifier = 2;</code>
   */
  boolean hasIdentifier();
  /**
   * <code>.chord.Identifier identifier = 2;</code>
   */
  net.grpc.chord.Identifier getIdentifier();
  /**
   * <code>.chord.Identifier identifier = 2;</code>
   */
  net.grpc.chord.IdentifierOrBuilder getIdentifierOrBuilder();
}