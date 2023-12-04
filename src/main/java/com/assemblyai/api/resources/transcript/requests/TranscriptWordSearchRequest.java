/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.resources.transcript.requests;

import com.assemblyai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TranscriptWordSearchRequest.Builder.class)
public final class TranscriptWordSearchRequest {
    private final Optional<String> words;

    private final Map<String, Object> additionalProperties;

    private TranscriptWordSearchRequest(Optional<String> words, Map<String, Object> additionalProperties) {
        this.words = words;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Keywords to search for
     */
    @JsonProperty("words")
    public Optional<String> getWords() {
        return words;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TranscriptWordSearchRequest && equalTo((TranscriptWordSearchRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TranscriptWordSearchRequest other) {
        return words.equals(other.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.words);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> words = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TranscriptWordSearchRequest other) {
            words(other.getWords());
            return this;
        }

        @JsonSetter(value = "words", nulls = Nulls.SKIP)
        public Builder words(Optional<String> words) {
            this.words = words;
            return this;
        }

        public Builder words(String words) {
            this.words = Optional.of(words);
            return this;
        }

        public TranscriptWordSearchRequest build() {
            return new TranscriptWordSearchRequest(words, additionalProperties);
        }
    }
}