/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;

public final class SubstitutionPolicy {
    public static final SubstitutionPolicy ENTITY_TYPE = new SubstitutionPolicy(Value.ENTITY_TYPE, "entity_type");

    public static final SubstitutionPolicy HASH = new SubstitutionPolicy(Value.HASH, "hash");

    private final Value value;

    private final String string;

    SubstitutionPolicy(Value value, String string) {
        this.value = value;
        this.string = string;
    }

    public Value getEnumValue() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return this.string;
    }

    @Override
    public boolean equals(Object other) {
        return (this == other)
                || (other instanceof SubstitutionPolicy && this.string.equals(((SubstitutionPolicy) other).string));
    }

    @Override
    public int hashCode() {
        return this.string.hashCode();
    }

    public <T> T visit(Visitor<T> visitor) {
        switch (value) {
            case ENTITY_TYPE:
                return visitor.visitEntityType();
            case HASH:
                return visitor.visitHash();
            case UNKNOWN:
            default:
                return visitor.visitUnknown(string);
        }
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static SubstitutionPolicy valueOf(String value) {
        String upperCasedValue = value.toUpperCase(Locale.ROOT);
        switch (upperCasedValue) {
            case "entity_type":
                return ENTITY_TYPE;
            case "hash":
                return HASH;
            default:
                return new SubstitutionPolicy(Value.UNKNOWN, upperCasedValue);
        }
    }

    public enum Value {
        ENTITY_TYPE,

        HASH,

        UNKNOWN
    }

    public interface Visitor<T> {
        T visitEntityType();

        T visitHash();

        T visitUnknown(String unknownType);
    }
}
