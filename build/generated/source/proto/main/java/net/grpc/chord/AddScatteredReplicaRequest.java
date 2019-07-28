// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

/**
 * Protobuf type {@code chord.AddScatteredReplicaRequest}
 */
public  final class AddScatteredReplicaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chord.AddScatteredReplicaRequest)
    AddScatteredReplicaRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddScatteredReplicaRequest.newBuilder() to construct.
  private AddScatteredReplicaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddScatteredReplicaRequest() {
    key_ = "";
    value_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddScatteredReplicaRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            value_ = s;
            break;
          }
          case 26: {
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
    return net.grpc.chord.ChordNodeProto.internal_static_chord_AddScatteredReplicaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.grpc.chord.ChordNodeProto.internal_static_chord_AddScatteredReplicaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.grpc.chord.AddScatteredReplicaRequest.class, net.grpc.chord.AddScatteredReplicaRequest.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object key_;
  /**
   * <code>string key = 1;</code>
   */
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object value_;
  /**
   * <code>string value = 2;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDENTIFIER_FIELD_NUMBER = 3;
  private net.grpc.chord.Identifier identifier_;
  /**
   * <code>.chord.Identifier identifier = 3;</code>
   */
  public boolean hasIdentifier() {
    return identifier_ != null;
  }
  /**
   * <code>.chord.Identifier identifier = 3;</code>
   */
  public net.grpc.chord.Identifier getIdentifier() {
    return identifier_ == null ? net.grpc.chord.Identifier.getDefaultInstance() : identifier_;
  }
  /**
   * <code>.chord.Identifier identifier = 3;</code>
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
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (!getValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    if (identifier_ != null) {
      output.writeMessage(3, getIdentifier());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (!getValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
    }
    if (identifier_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getIdentifier());
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
    if (!(obj instanceof net.grpc.chord.AddScatteredReplicaRequest)) {
      return super.equals(obj);
    }
    net.grpc.chord.AddScatteredReplicaRequest other = (net.grpc.chord.AddScatteredReplicaRequest) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    if (hasIdentifier()) {
      hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getIdentifier().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.grpc.chord.AddScatteredReplicaRequest parseFrom(
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
  public static Builder newBuilder(net.grpc.chord.AddScatteredReplicaRequest prototype) {
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
   * Protobuf type {@code chord.AddScatteredReplicaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chord.AddScatteredReplicaRequest)
      net.grpc.chord.AddScatteredReplicaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.grpc.chord.ChordNodeProto.internal_static_chord_AddScatteredReplicaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.grpc.chord.ChordNodeProto.internal_static_chord_AddScatteredReplicaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.grpc.chord.AddScatteredReplicaRequest.class, net.grpc.chord.AddScatteredReplicaRequest.Builder.class);
    }

    // Construct using net.grpc.chord.AddScatteredReplicaRequest.newBuilder()
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
      key_ = "";

      value_ = "";

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
      return net.grpc.chord.ChordNodeProto.internal_static_chord_AddScatteredReplicaRequest_descriptor;
    }

    @java.lang.Override
    public net.grpc.chord.AddScatteredReplicaRequest getDefaultInstanceForType() {
      return net.grpc.chord.AddScatteredReplicaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.grpc.chord.AddScatteredReplicaRequest build() {
      net.grpc.chord.AddScatteredReplicaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.grpc.chord.AddScatteredReplicaRequest buildPartial() {
      net.grpc.chord.AddScatteredReplicaRequest result = new net.grpc.chord.AddScatteredReplicaRequest(this);
      result.key_ = key_;
      result.value_ = value_;
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
      if (other instanceof net.grpc.chord.AddScatteredReplicaRequest) {
        return mergeFrom((net.grpc.chord.AddScatteredReplicaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.grpc.chord.AddScatteredReplicaRequest other) {
      if (other == net.grpc.chord.AddScatteredReplicaRequest.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
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
      net.grpc.chord.AddScatteredReplicaRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.grpc.chord.AddScatteredReplicaRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <code>string key = 1;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 2;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>string value = 2;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
      onChanged();
      return this;
    }

    private net.grpc.chord.Identifier identifier_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.grpc.chord.Identifier, net.grpc.chord.Identifier.Builder, net.grpc.chord.IdentifierOrBuilder> identifierBuilder_;
    /**
     * <code>.chord.Identifier identifier = 3;</code>
     */
    public boolean hasIdentifier() {
      return identifierBuilder_ != null || identifier_ != null;
    }
    /**
     * <code>.chord.Identifier identifier = 3;</code>
     */
    public net.grpc.chord.Identifier getIdentifier() {
      if (identifierBuilder_ == null) {
        return identifier_ == null ? net.grpc.chord.Identifier.getDefaultInstance() : identifier_;
      } else {
        return identifierBuilder_.getMessage();
      }
    }
    /**
     * <code>.chord.Identifier identifier = 3;</code>
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
     * <code>.chord.Identifier identifier = 3;</code>
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
     * <code>.chord.Identifier identifier = 3;</code>
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
     * <code>.chord.Identifier identifier = 3;</code>
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
     * <code>.chord.Identifier identifier = 3;</code>
     */
    public net.grpc.chord.Identifier.Builder getIdentifierBuilder() {
      
      onChanged();
      return getIdentifierFieldBuilder().getBuilder();
    }
    /**
     * <code>.chord.Identifier identifier = 3;</code>
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
     * <code>.chord.Identifier identifier = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:chord.AddScatteredReplicaRequest)
  }

  // @@protoc_insertion_point(class_scope:chord.AddScatteredReplicaRequest)
  private static final net.grpc.chord.AddScatteredReplicaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.grpc.chord.AddScatteredReplicaRequest();
  }

  public static net.grpc.chord.AddScatteredReplicaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddScatteredReplicaRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddScatteredReplicaRequest>() {
    @java.lang.Override
    public AddScatteredReplicaRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddScatteredReplicaRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddScatteredReplicaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddScatteredReplicaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.grpc.chord.AddScatteredReplicaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
