// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

/**
 * Protobuf type {@code chord.RemoveReplicaRequest}
 */
public  final class RemoveReplicaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chord.RemoveReplicaRequest)
    RemoveReplicaRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveReplicaRequest.newBuilder() to construct.
  private RemoveReplicaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveReplicaRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveReplicaRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            net.grpc.chord.Identifier.Builder subBuilder = null;
            if (identifier_ != null) {
              subBuilder = identifier_.toBuilder();
            }
            identifier_ = input.readMessage(net.grpc.chord.Identifier.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(identifier_);
              identifier_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.grpc.chord.ChordNodeProto.internal_static_chord_RemoveReplicaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.grpc.chord.ChordNodeProto.internal_static_chord_RemoveReplicaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.grpc.chord.RemoveReplicaRequest.class, net.grpc.chord.RemoveReplicaRequest.Builder.class);
  }

  public static final int IDENTIFIER_FIELD_NUMBER = 1;
  private net.grpc.chord.Identifier identifier_;
  /**
   * <code>.chord.Identifier identifier = 1;</code>
   */
  public boolean hasIdentifier() {
    return identifier_ != null;
  }
  /**
   * <code>.chord.Identifier identifier = 1;</code>
   */
  public net.grpc.chord.Identifier getIdentifier() {
    return identifier_ == null ? net.grpc.chord.Identifier.getDefaultInstance() : identifier_;
  }
  /**
   * <code>.chord.Identifier identifier = 1;</code>
   */
  public net.grpc.chord.IdentifierOrBuilder getIdentifierOrBuilder() {
    return getIdentifier();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (identifier_ != null) {
      output.writeMessage(1, getIdentifier());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identifier_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIdentifier());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.grpc.chord.RemoveReplicaRequest)) {
      return super.equals(obj);
    }
    net.grpc.chord.RemoveReplicaRequest other = (net.grpc.chord.RemoveReplicaRequest) obj;

    if (hasIdentifier() != other.hasIdentifier()) return false;
    if (hasIdentifier()) {
      if (!getIdentifier()
          .equals(other.getIdentifier())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasIdentifier()) {
      hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getIdentifier().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.grpc.chord.RemoveReplicaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.grpc.chord.RemoveReplicaRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.grpc.chord.RemoveReplicaRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code chord.RemoveReplicaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chord.RemoveReplicaRequest)
      net.grpc.chord.RemoveReplicaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.grpc.chord.ChordNodeProto.internal_static_chord_RemoveReplicaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.grpc.chord.ChordNodeProto.internal_static_chord_RemoveReplicaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.grpc.chord.RemoveReplicaRequest.class, net.grpc.chord.RemoveReplicaRequest.Builder.class);
    }

    // Construct using net.grpc.chord.RemoveReplicaRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (identifierBuilder_ == null) {
        identifier_ = null;
      } else {
        identifier_ = null;
        identifierBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.grpc.chord.ChordNodeProto.internal_static_chord_RemoveReplicaRequest_descriptor;
    }

    @java.lang.Override
    public net.grpc.chord.RemoveReplicaRequest getDefaultInstanceForType() {
      return net.grpc.chord.RemoveReplicaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.grpc.chord.RemoveReplicaRequest build() {
      net.grpc.chord.RemoveReplicaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.grpc.chord.RemoveReplicaRequest buildPartial() {
      net.grpc.chord.RemoveReplicaRequest result = new net.grpc.chord.RemoveReplicaRequest(this);
      if (identifierBuilder_ == null) {
        result.identifier_ = identifier_;
      } else {
        result.identifier_ = identifierBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.grpc.chord.RemoveReplicaRequest) {
        return mergeFrom((net.grpc.chord.RemoveReplicaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.grpc.chord.RemoveReplicaRequest other) {
      if (other == net.grpc.chord.RemoveReplicaRequest.getDefaultInstance()) return this;
      if (other.hasIdentifier()) {
        mergeIdentifier(other.getIdentifier());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      net.grpc.chord.RemoveReplicaRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.grpc.chord.RemoveReplicaRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private net.grpc.chord.Identifier identifier_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.grpc.chord.Identifier, net.grpc.chord.Identifier.Builder, net.grpc.chord.IdentifierOrBuilder> identifierBuilder_;
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    public boolean hasIdentifier() {
      return identifierBuilder_ != null || identifier_ != null;
    }
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    public net.grpc.chord.Identifier getIdentifier() {
      if (identifierBuilder_ == null) {
        return identifier_ == null ? net.grpc.chord.Identifier.getDefaultInstance() : identifier_;
      } else {
        return identifierBuilder_.getMessage();
      }
    }
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    public Builder setIdentifier(net.grpc.chord.Identifier value) {
      if (identifierBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identifier_ = value;
        onChanged();
      } else {
        identifierBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    public Builder setIdentifier(
        net.grpc.chord.Identifier.Builder builderForValue) {
      if (identifierBuilder_ == null) {
        identifier_ = builderForValue.build();
        onChanged();
      } else {
        identifierBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    public Builder mergeIdentifier(net.grpc.chord.Identifier value) {
      if (identifierBuilder_ == null) {
        if (identifier_ != null) {
          identifier_ =
            net.grpc.chord.Identifier.newBuilder(identifier_).mergeFrom(value).buildPartial();
        } else {
          identifier_ = value;
        }
        onChanged();
      } else {
        identifierBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    public Builder clearIdentifier() {
      if (identifierBuilder_ == null) {
        identifier_ = null;
        onChanged();
      } else {
        identifier_ = null;
        identifierBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    public net.grpc.chord.Identifier.Builder getIdentifierBuilder() {
      
      onChanged();
      return getIdentifierFieldBuilder().getBuilder();
    }
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    public net.grpc.chord.IdentifierOrBuilder getIdentifierOrBuilder() {
      if (identifierBuilder_ != null) {
        return identifierBuilder_.getMessageOrBuilder();
      } else {
        return identifier_ == null ?
            net.grpc.chord.Identifier.getDefaultInstance() : identifier_;
      }
    }
    /**
     * <code>.chord.Identifier identifier = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.grpc.chord.Identifier, net.grpc.chord.Identifier.Builder, net.grpc.chord.IdentifierOrBuilder> 
        getIdentifierFieldBuilder() {
      if (identifierBuilder_ == null) {
        identifierBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.grpc.chord.Identifier, net.grpc.chord.Identifier.Builder, net.grpc.chord.IdentifierOrBuilder>(
                getIdentifier(),
                getParentForChildren(),
                isClean());
        identifier_ = null;
      }
      return identifierBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:chord.RemoveReplicaRequest)
  }

  // @@protoc_insertion_point(class_scope:chord.RemoveReplicaRequest)
  private static final net.grpc.chord.RemoveReplicaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.grpc.chord.RemoveReplicaRequest();
  }

  public static net.grpc.chord.RemoveReplicaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveReplicaRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveReplicaRequest>() {
    @java.lang.Override
    public RemoveReplicaRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveReplicaRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveReplicaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveReplicaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.grpc.chord.RemoveReplicaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

