/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.types;

import com.assemblyai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = FinalTranscript.Builder.class)
public final class FinalTranscript implements IRealtimeBaseTranscript {
    private final int audioStart;

    private final int audioEnd;

    private final double confidence;

    private final String text;

    private final List<Word> words;

    private final String created;

    private final boolean punctuated;

    private final boolean textFormatted;

    private final Map<String, Object> additionalProperties;

    private FinalTranscript(
            int audioStart,
            int audioEnd,
            double confidence,
            String text,
            List<Word> words,
            String created,
            boolean punctuated,
            boolean textFormatted,
            Map<String, Object> additionalProperties) {
        this.audioStart = audioStart;
        this.audioEnd = audioEnd;
        this.confidence = confidence;
        this.text = text;
        this.words = words;
        this.created = created;
        this.punctuated = punctuated;
        this.textFormatted = textFormatted;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Start time of audio sample relative to session start, in milliseconds.
     */
    @JsonProperty("audio_start")
    @Override
    public int getAudioStart() {
        return audioStart;
    }

    /**
     * @return End time of audio sample relative to session start, in milliseconds.
     */
    @JsonProperty("audio_end")
    @Override
    public int getAudioEnd() {
        return audioEnd;
    }

    /**
     * @return The confidence score of the entire transcription, between 0 and 1.
     */
    @JsonProperty("confidence")
    @Override
    public double getConfidence() {
        return confidence;
    }

    /**
     * @return The partial transcript for your audio.
     */
    @JsonProperty("text")
    @Override
    public String getText() {
        return text;
    }

    /**
     * @return An array of objects, with the information for each word in the transcription text. Includes the start/end time (in milliseconds) of the word, the confidence score of the word, and the text (i.e. the word itself).
     */
    @JsonProperty("words")
    @Override
    public List<Word> getWords() {
        return words;
    }

    /**
     * @return The timestamp for the partial transcript.
     */
    @JsonProperty("created")
    @Override
    public String getCreated() {
        return created;
    }

    @JsonProperty("message_type")
    public String getMessageType() {
        return "FinalTranscript";
    }

    /**
     * @return Whether the text has been punctuated and cased.
     */
    @JsonProperty("punctuated")
    public boolean getPunctuated() {
        return punctuated;
    }

    /**
     * @return Whether the text has been formatted (e.g. Dollar -&gt; $)
     */
    @JsonProperty("text_formatted")
    public boolean getTextFormatted() {
        return textFormatted;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FinalTranscript && equalTo((FinalTranscript) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FinalTranscript other) {
        return audioStart == other.audioStart
                && audioEnd == other.audioEnd
                && confidence == other.confidence
                && text.equals(other.text)
                && words.equals(other.words)
                && created.equals(other.created)
                && punctuated == other.punctuated
                && textFormatted == other.textFormatted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.audioStart,
                this.audioEnd,
                this.confidence,
                this.text,
                this.words,
                this.created,
                this.punctuated,
                this.textFormatted);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AudioStartStage builder() {
        return new Builder();
    }

    public interface AudioStartStage {
        AudioEndStage audioStart(int audioStart);

        Builder from(FinalTranscript other);
    }

    public interface AudioEndStage {
        ConfidenceStage audioEnd(int audioEnd);
    }

    public interface ConfidenceStage {
        TextStage confidence(double confidence);
    }

    public interface TextStage {
        CreatedStage text(String text);
    }

    public interface CreatedStage {
        PunctuatedStage created(String created);
    }

    public interface PunctuatedStage {
        TextFormattedStage punctuated(boolean punctuated);
    }

    public interface TextFormattedStage {
        _FinalStage textFormatted(boolean textFormatted);
    }

    public interface _FinalStage {
        FinalTranscript build();

        _FinalStage words(List<Word> words);

        _FinalStage addWords(Word words);

        _FinalStage addAllWords(List<Word> words);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AudioStartStage,
                    AudioEndStage,
                    ConfidenceStage,
                    TextStage,
                    CreatedStage,
                    PunctuatedStage,
                    TextFormattedStage,
                    _FinalStage {
        private int audioStart;

        private int audioEnd;

        private double confidence;

        private String text;

        private String created;

        private boolean punctuated;

        private boolean textFormatted;

        private List<Word> words = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(FinalTranscript other) {
            audioStart(other.getAudioStart());
            audioEnd(other.getAudioEnd());
            confidence(other.getConfidence());
            text(other.getText());
            words(other.getWords());
            created(other.getCreated());
            punctuated(other.getPunctuated());
            textFormatted(other.getTextFormatted());
            return this;
        }

        /**
         * <p>Start time of audio sample relative to session start, in milliseconds.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("audio_start")
        public AudioEndStage audioStart(int audioStart) {
            this.audioStart = audioStart;
            return this;
        }

        /**
         * <p>End time of audio sample relative to session start, in milliseconds.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("audio_end")
        public ConfidenceStage audioEnd(int audioEnd) {
            this.audioEnd = audioEnd;
            return this;
        }

        /**
         * <p>The confidence score of the entire transcription, between 0 and 1.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("confidence")
        public TextStage confidence(double confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * <p>The partial transcript for your audio.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("text")
        public CreatedStage text(String text) {
            this.text = text;
            return this;
        }

        /**
         * <p>The timestamp for the partial transcript.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("created")
        public PunctuatedStage created(String created) {
            this.created = created;
            return this;
        }

        /**
         * <p>Whether the text has been punctuated and cased.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("punctuated")
        public TextFormattedStage punctuated(boolean punctuated) {
            this.punctuated = punctuated;
            return this;
        }

        /**
         * <p>Whether the text has been formatted (e.g. Dollar -&gt; $)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("text_formatted")
        public _FinalStage textFormatted(boolean textFormatted) {
            this.textFormatted = textFormatted;
            return this;
        }

        /**
         * <p>An array of objects, with the information for each word in the transcription text. Includes the start/end time (in milliseconds) of the word, the confidence score of the word, and the text (i.e. the word itself).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage addAllWords(List<Word> words) {
            this.words.addAll(words);
            return this;
        }

        /**
         * <p>An array of objects, with the information for each word in the transcription text. Includes the start/end time (in milliseconds) of the word, the confidence score of the word, and the text (i.e. the word itself).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage addWords(Word words) {
            this.words.add(words);
            return this;
        }

        @Override
        @JsonSetter(value = "words", nulls = Nulls.SKIP)
        public _FinalStage words(List<Word> words) {
            this.words.clear();
            this.words.addAll(words);
            return this;
        }

        @Override
        public FinalTranscript build() {
            return new FinalTranscript(
                    audioStart,
                    audioEnd,
                    confidence,
                    text,
                    words,
                    created,
                    punctuated,
                    textFormatted,
                    additionalProperties);
        }
    }
}
