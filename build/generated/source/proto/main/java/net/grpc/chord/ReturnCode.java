// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

/**
 * Protobuf enum {@code chord.ReturnCode}
 */
public enum ReturnCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUCCESS = 0;</code>
   */
  SUCCESS(0),
  /**
   * <code>FAILURE = 1;</code>
   */
  FAILURE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUCCESS = 0;</code>
   */
  public static final int SUCCESS_VALUE = 0;
  /**
   * <code>FAILURE = 1;</code>
   */
  public static final int FAILURE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ReturnCode valueOf(int value) {
    return forNumber(value);
  }

  public static ReturnCode forNumber(int value) {
    switch (value) {
      case 0: return SUCCESS;
      case 1: return FAILURE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReturnCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReturnCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReturnCode>() {
          public ReturnCode findValueByNumber(int number) {
            return ReturnCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return net.grpc.chord.ChordNodeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ReturnCode[] VALUES = values();

  public static ReturnCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ReturnCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chord.ReturnCode)
}

