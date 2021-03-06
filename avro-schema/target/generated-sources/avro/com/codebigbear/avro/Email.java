/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.codebigbear.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Email extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7750424327864157519L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Email\",\"namespace\":\"com.codebigbear.avro\",\"fields\":[{\"name\":\"template_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":0},{\"name\":\"email_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Email> ENCODER =
      new BinaryMessageEncoder<Email>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Email> DECODER =
      new BinaryMessageDecoder<Email>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Email> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Email> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Email>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Email to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Email from a ByteBuffer. */
  public static Email fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String template_id;
   private java.lang.String email_id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Email() {}

  /**
   * All-args constructor.
   * @param template_id The new value for template_id
   * @param email_id The new value for email_id
   */
  public Email(java.lang.String template_id, java.lang.String email_id) {
    this.template_id = template_id;
    this.email_id = email_id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return template_id;
    case 1: return email_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: template_id = (java.lang.String)value$; break;
    case 1: email_id = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'template_id' field.
   * @return The value of the 'template_id' field.
   */
  public java.lang.String getTemplateId() {
    return template_id;
  }

  /**
   * Sets the value of the 'template_id' field.
   * @param value the value to set.
   */
  public void setTemplateId(java.lang.String value) {
    this.template_id = value;
  }

  /**
   * Gets the value of the 'email_id' field.
   * @return The value of the 'email_id' field.
   */
  public java.lang.String getEmailId() {
    return email_id;
  }

  /**
   * Sets the value of the 'email_id' field.
   * @param value the value to set.
   */
  public void setEmailId(java.lang.String value) {
    this.email_id = value;
  }

  /**
   * Creates a new Email RecordBuilder.
   * @return A new Email RecordBuilder
   */
  public static com.codebigbear.avro.Email.Builder newBuilder() {
    return new com.codebigbear.avro.Email.Builder();
  }

  /**
   * Creates a new Email RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Email RecordBuilder
   */
  public static com.codebigbear.avro.Email.Builder newBuilder(com.codebigbear.avro.Email.Builder other) {
    return new com.codebigbear.avro.Email.Builder(other);
  }

  /**
   * Creates a new Email RecordBuilder by copying an existing Email instance.
   * @param other The existing instance to copy.
   * @return A new Email RecordBuilder
   */
  public static com.codebigbear.avro.Email.Builder newBuilder(com.codebigbear.avro.Email other) {
    return new com.codebigbear.avro.Email.Builder(other);
  }

  /**
   * RecordBuilder for Email instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Email>
    implements org.apache.avro.data.RecordBuilder<Email> {

    private java.lang.String template_id;
    private java.lang.String email_id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.codebigbear.avro.Email.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.template_id)) {
        this.template_id = data().deepCopy(fields()[0].schema(), other.template_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email_id)) {
        this.email_id = data().deepCopy(fields()[1].schema(), other.email_id);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Email instance
     * @param other The existing instance to copy.
     */
    private Builder(com.codebigbear.avro.Email other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.template_id)) {
        this.template_id = data().deepCopy(fields()[0].schema(), other.template_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email_id)) {
        this.email_id = data().deepCopy(fields()[1].schema(), other.email_id);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'template_id' field.
      * @return The value.
      */
    public java.lang.String getTemplateId() {
      return template_id;
    }

    /**
      * Sets the value of the 'template_id' field.
      * @param value The value of 'template_id'.
      * @return This builder.
      */
    public com.codebigbear.avro.Email.Builder setTemplateId(java.lang.String value) {
      validate(fields()[0], value);
      this.template_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'template_id' field has been set.
      * @return True if the 'template_id' field has been set, false otherwise.
      */
    public boolean hasTemplateId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'template_id' field.
      * @return This builder.
      */
    public com.codebigbear.avro.Email.Builder clearTemplateId() {
      template_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'email_id' field.
      * @return The value.
      */
    public java.lang.String getEmailId() {
      return email_id;
    }

    /**
      * Sets the value of the 'email_id' field.
      * @param value The value of 'email_id'.
      * @return This builder.
      */
    public com.codebigbear.avro.Email.Builder setEmailId(java.lang.String value) {
      validate(fields()[1], value);
      this.email_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'email_id' field has been set.
      * @return True if the 'email_id' field has been set, false otherwise.
      */
    public boolean hasEmailId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'email_id' field.
      * @return This builder.
      */
    public com.codebigbear.avro.Email.Builder clearEmailId() {
      email_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Email build() {
      try {
        Email record = new Email();
        record.template_id = fieldSetFlags()[0] ? this.template_id : (java.lang.String) defaultValue(fields()[0]);
        record.email_id = fieldSetFlags()[1] ? this.email_id : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Email>
    WRITER$ = (org.apache.avro.io.DatumWriter<Email>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Email>
    READER$ = (org.apache.avro.io.DatumReader<Email>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
