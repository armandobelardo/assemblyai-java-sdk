/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.types;

import com.assemblyai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = RealtimeTranscript.Deserializer.class)
public final class RealtimeTranscript {
    private final Object value;

    private final int type;

    private RealtimeTranscript(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((PartialTranscript) this.value);
        } else if (this.type == 1) {
            return visitor.visit((FinalTranscript) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RealtimeTranscript && equalTo((RealtimeTranscript) other);
    }

    private boolean equalTo(RealtimeTranscript other) {
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    public static RealtimeTranscript of(PartialTranscript value) {
        return new RealtimeTranscript(value, 0);
    }

    public static RealtimeTranscript of(FinalTranscript value) {
        return new RealtimeTranscript(value, 1);
    }

    public interface Visitor<T> {
        T visit(PartialTranscript value);

        T visit(FinalTranscript value);
    }

    static final class Deserializer extends StdDeserializer<RealtimeTranscript> {
        Deserializer() {
            super(RealtimeTranscript.class);
        }

        @Override
        public RealtimeTranscript deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, PartialTranscript.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, FinalTranscript.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
