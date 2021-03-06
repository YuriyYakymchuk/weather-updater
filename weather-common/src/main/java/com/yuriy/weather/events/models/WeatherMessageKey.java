/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.yuriy.weather.events.models;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WeatherMessageKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1733284996073756701L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WeatherMessageKey\",\"namespace\":\"com.yuriy.weather.events.models\",\"fields\":[{\"name\":\"country\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<WeatherMessageKey> ENCODER =
      new BinaryMessageEncoder<WeatherMessageKey>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<WeatherMessageKey> DECODER =
      new BinaryMessageDecoder<WeatherMessageKey>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<WeatherMessageKey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<WeatherMessageKey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<WeatherMessageKey>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this WeatherMessageKey to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a WeatherMessageKey from a ByteBuffer. */
  public static WeatherMessageKey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence country;
  @Deprecated public java.lang.CharSequence city;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WeatherMessageKey() {}

  /**
   * All-args constructor.
   * @param country The new value for country
   * @param city The new value for city
   */
  public WeatherMessageKey(java.lang.CharSequence country, java.lang.CharSequence city) {
    this.country = country;
    this.city = city;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return country;
    case 1: return city;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: country = (java.lang.CharSequence)value$; break;
    case 1: city = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'country' field.
   * @return The value of the 'country' field.
   */
  public java.lang.CharSequence getCountry() {
    return country;
  }

  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(java.lang.CharSequence value) {
    this.country = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }

  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Creates a new WeatherMessageKey RecordBuilder.
   * @return A new WeatherMessageKey RecordBuilder
   */
  public static com.yuriy.weather.events.models.WeatherMessageKey.Builder newBuilder() {
    return new com.yuriy.weather.events.models.WeatherMessageKey.Builder();
  }

  /**
   * Creates a new WeatherMessageKey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WeatherMessageKey RecordBuilder
   */
  public static com.yuriy.weather.events.models.WeatherMessageKey.Builder newBuilder(com.yuriy.weather.events.models.WeatherMessageKey.Builder other) {
    return new com.yuriy.weather.events.models.WeatherMessageKey.Builder(other);
  }

  /**
   * Creates a new WeatherMessageKey RecordBuilder by copying an existing WeatherMessageKey instance.
   * @param other The existing instance to copy.
   * @return A new WeatherMessageKey RecordBuilder
   */
  public static com.yuriy.weather.events.models.WeatherMessageKey.Builder newBuilder(com.yuriy.weather.events.models.WeatherMessageKey other) {
    return new com.yuriy.weather.events.models.WeatherMessageKey.Builder(other);
  }

  /**
   * RecordBuilder for WeatherMessageKey instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WeatherMessageKey>
    implements org.apache.avro.data.RecordBuilder<WeatherMessageKey> {

    private java.lang.CharSequence country;
    private java.lang.CharSequence city;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.yuriy.weather.events.models.WeatherMessageKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.country)) {
        this.country = data().deepCopy(fields()[0].schema(), other.country);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.city)) {
        this.city = data().deepCopy(fields()[1].schema(), other.city);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing WeatherMessageKey instance
     * @param other The existing instance to copy.
     */
    private Builder(com.yuriy.weather.events.models.WeatherMessageKey other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.country)) {
        this.country = data().deepCopy(fields()[0].schema(), other.country);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.city)) {
        this.city = data().deepCopy(fields()[1].schema(), other.city);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'country' field.
      * @return The value.
      */
    public java.lang.CharSequence getCountry() {
      return country;
    }

    /**
      * Sets the value of the 'country' field.
      * @param value The value of 'country'.
      * @return This builder.
      */
    public com.yuriy.weather.events.models.WeatherMessageKey.Builder setCountry(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.country = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'country' field.
      * @return This builder.
      */
    public com.yuriy.weather.events.models.WeatherMessageKey.Builder clearCountry() {
      country = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }

    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.yuriy.weather.events.models.WeatherMessageKey.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.city = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.yuriy.weather.events.models.WeatherMessageKey.Builder clearCity() {
      city = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public WeatherMessageKey build() {
      try {
        WeatherMessageKey record = new WeatherMessageKey();
        record.country = fieldSetFlags()[0] ? this.country : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.city = fieldSetFlags()[1] ? this.city : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<WeatherMessageKey>
    WRITER$ = (org.apache.avro.io.DatumWriter<WeatherMessageKey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<WeatherMessageKey>
    READER$ = (org.apache.avro.io.DatumReader<WeatherMessageKey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
