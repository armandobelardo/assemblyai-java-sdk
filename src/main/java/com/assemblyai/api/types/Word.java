/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.types;

import com.assemblyai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Word.Builder.class)
public final class Word {
    private final int start;

    private final int end;

    private final double confidence;

    private final String text;

    private Word(int start, int end, double confidence, String text) {
        this.start = start;
        this.end = end;
        this.confidence = confidence;
        this.text = text;
    }

    /**
     * @return Start time of the word in milliseconds
     */
    @JsonProperty("start")
    public int getStart() {
        return start;
    }

    /**
     * @return End time of the word in milliseconds
     */
    @JsonProperty("end")
    public int getEnd() {
        return end;
    }

    /**
     * @return Confidence score of the word
     */
    @JsonProperty("confidence")
    public double getConfidence() {
        return confidence;
    }

    /**
     * @return The word itself
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Word && equalTo((Word) other);
    }

    private boolean equalTo(Word other) {
        return start == other.start && end == other.end && confidence == other.confidence && text.equals(other.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.start, this.end, this.confidence, this.text);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StartStage builder() {
        return new Builder();
    }

    public interface StartStage {
        EndStage start(int start);

        Builder from(Word other);
    }

    public interface EndStage {
        ConfidenceStage end(int end);
    }

    public interface ConfidenceStage {
        TextStage confidence(double confidence);
    }

    public interface TextStage {
        _FinalStage text(String text);
    }

    public interface _FinalStage {
        Word build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StartStage, EndStage, ConfidenceStage, TextStage, _FinalStage {
        private int start;

        private int end;

        private double confidence;

        private String text;

        private Builder() {}

        @Override
        public Builder from(Word other) {
            start(other.getStart());
            end(other.getEnd());
            confidence(other.getConfidence());
            text(other.getText());
            return this;
        }

        /**
         * <p>Start time of the word in milliseconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("start")
        public EndStage start(int start) {
            this.start = start;
            return this;
        }

        /**
         * <p>End time of the word in milliseconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("end")
        public ConfidenceStage end(int end) {
            this.end = end;
            return this;
        }

        /**
         * <p>Confidence score of the word</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("confidence")
        public TextStage confidence(double confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * <p>The word itself</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("text")
        public _FinalStage text(String text) {
            this.text = text;
            return this;
        }

        @Override
        public Word build() {
            return new Word(start, end, confidence, text);
        }
    }
}