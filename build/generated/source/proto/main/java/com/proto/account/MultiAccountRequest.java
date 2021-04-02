// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account/account.proto

package com.proto.account;

/**
 * <pre>
 *account request contains account information
 * </pre>
 *
 * Protobuf type {@code MultiAccountRequest}
 */
public final class MultiAccountRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MultiAccountRequest)
    MultiAccountRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiAccountRequest.newBuilder() to construct.
  private MultiAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiAccountRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiAccountRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiAccountRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.proto.account.AccountInfo.Builder subBuilder = null;
            if (accountInfo_ != null) {
              subBuilder = accountInfo_.toBuilder();
            }
            accountInfo_ = input.readMessage(com.proto.account.AccountInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(accountInfo_);
              accountInfo_ = subBuilder.buildPartial();
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
    return com.proto.account.Account.internal_static_MultiAccountRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.account.Account.internal_static_MultiAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.account.MultiAccountRequest.class, com.proto.account.MultiAccountRequest.Builder.class);
  }

  public static final int ACCOUNTINFO_FIELD_NUMBER = 1;
  private com.proto.account.AccountInfo accountInfo_;
  /**
   * <code>.AccountInfo accountInfo = 1;</code>
   * @return Whether the accountInfo field is set.
   */
  @java.lang.Override
  public boolean hasAccountInfo() {
    return accountInfo_ != null;
  }
  /**
   * <code>.AccountInfo accountInfo = 1;</code>
   * @return The accountInfo.
   */
  @java.lang.Override
  public com.proto.account.AccountInfo getAccountInfo() {
    return accountInfo_ == null ? com.proto.account.AccountInfo.getDefaultInstance() : accountInfo_;
  }
  /**
   * <code>.AccountInfo accountInfo = 1;</code>
   */
  @java.lang.Override
  public com.proto.account.AccountInfoOrBuilder getAccountInfoOrBuilder() {
    return getAccountInfo();
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
    if (accountInfo_ != null) {
      output.writeMessage(1, getAccountInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccountInfo());
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
    if (!(obj instanceof com.proto.account.MultiAccountRequest)) {
      return super.equals(obj);
    }
    com.proto.account.MultiAccountRequest other = (com.proto.account.MultiAccountRequest) obj;

    if (hasAccountInfo() != other.hasAccountInfo()) return false;
    if (hasAccountInfo()) {
      if (!getAccountInfo()
          .equals(other.getAccountInfo())) return false;
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
    if (hasAccountInfo()) {
      hash = (37 * hash) + ACCOUNTINFO_FIELD_NUMBER;
      hash = (53 * hash) + getAccountInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.account.MultiAccountRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.account.MultiAccountRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.account.MultiAccountRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.account.MultiAccountRequest parseFrom(
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
  public static Builder newBuilder(com.proto.account.MultiAccountRequest prototype) {
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
   * <pre>
   *account request contains account information
   * </pre>
   *
   * Protobuf type {@code MultiAccountRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MultiAccountRequest)
      com.proto.account.MultiAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.account.Account.internal_static_MultiAccountRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.account.Account.internal_static_MultiAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.account.MultiAccountRequest.class, com.proto.account.MultiAccountRequest.Builder.class);
    }

    // Construct using com.proto.account.MultiAccountRequest.newBuilder()
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
      if (accountInfoBuilder_ == null) {
        accountInfo_ = null;
      } else {
        accountInfo_ = null;
        accountInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.account.Account.internal_static_MultiAccountRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.account.MultiAccountRequest getDefaultInstanceForType() {
      return com.proto.account.MultiAccountRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.account.MultiAccountRequest build() {
      com.proto.account.MultiAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.account.MultiAccountRequest buildPartial() {
      com.proto.account.MultiAccountRequest result = new com.proto.account.MultiAccountRequest(this);
      if (accountInfoBuilder_ == null) {
        result.accountInfo_ = accountInfo_;
      } else {
        result.accountInfo_ = accountInfoBuilder_.build();
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
      if (other instanceof com.proto.account.MultiAccountRequest) {
        return mergeFrom((com.proto.account.MultiAccountRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.account.MultiAccountRequest other) {
      if (other == com.proto.account.MultiAccountRequest.getDefaultInstance()) return this;
      if (other.hasAccountInfo()) {
        mergeAccountInfo(other.getAccountInfo());
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
      com.proto.account.MultiAccountRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.account.MultiAccountRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.account.AccountInfo accountInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.account.AccountInfo, com.proto.account.AccountInfo.Builder, com.proto.account.AccountInfoOrBuilder> accountInfoBuilder_;
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     * @return Whether the accountInfo field is set.
     */
    public boolean hasAccountInfo() {
      return accountInfoBuilder_ != null || accountInfo_ != null;
    }
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     * @return The accountInfo.
     */
    public com.proto.account.AccountInfo getAccountInfo() {
      if (accountInfoBuilder_ == null) {
        return accountInfo_ == null ? com.proto.account.AccountInfo.getDefaultInstance() : accountInfo_;
      } else {
        return accountInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     */
    public Builder setAccountInfo(com.proto.account.AccountInfo value) {
      if (accountInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accountInfo_ = value;
        onChanged();
      } else {
        accountInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     */
    public Builder setAccountInfo(
        com.proto.account.AccountInfo.Builder builderForValue) {
      if (accountInfoBuilder_ == null) {
        accountInfo_ = builderForValue.build();
        onChanged();
      } else {
        accountInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     */
    public Builder mergeAccountInfo(com.proto.account.AccountInfo value) {
      if (accountInfoBuilder_ == null) {
        if (accountInfo_ != null) {
          accountInfo_ =
            com.proto.account.AccountInfo.newBuilder(accountInfo_).mergeFrom(value).buildPartial();
        } else {
          accountInfo_ = value;
        }
        onChanged();
      } else {
        accountInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     */
    public Builder clearAccountInfo() {
      if (accountInfoBuilder_ == null) {
        accountInfo_ = null;
        onChanged();
      } else {
        accountInfo_ = null;
        accountInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     */
    public com.proto.account.AccountInfo.Builder getAccountInfoBuilder() {
      
      onChanged();
      return getAccountInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     */
    public com.proto.account.AccountInfoOrBuilder getAccountInfoOrBuilder() {
      if (accountInfoBuilder_ != null) {
        return accountInfoBuilder_.getMessageOrBuilder();
      } else {
        return accountInfo_ == null ?
            com.proto.account.AccountInfo.getDefaultInstance() : accountInfo_;
      }
    }
    /**
     * <code>.AccountInfo accountInfo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.account.AccountInfo, com.proto.account.AccountInfo.Builder, com.proto.account.AccountInfoOrBuilder> 
        getAccountInfoFieldBuilder() {
      if (accountInfoBuilder_ == null) {
        accountInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.account.AccountInfo, com.proto.account.AccountInfo.Builder, com.proto.account.AccountInfoOrBuilder>(
                getAccountInfo(),
                getParentForChildren(),
                isClean());
        accountInfo_ = null;
      }
      return accountInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:MultiAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:MultiAccountRequest)
  private static final com.proto.account.MultiAccountRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.account.MultiAccountRequest();
  }

  public static com.proto.account.MultiAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiAccountRequest>
      PARSER = new com.google.protobuf.AbstractParser<MultiAccountRequest>() {
    @java.lang.Override
    public MultiAccountRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiAccountRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiAccountRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.account.MultiAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

