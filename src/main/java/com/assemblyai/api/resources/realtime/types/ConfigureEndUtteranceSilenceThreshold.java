/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.resources.realtime.types;

import com.assemblyai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConfigureEndUtteranceSilenceThreshold.Builder.class)
public final class ConfigureEndUtteranceSilenceThreshold {
    private final int endUtteranceSilenceThreshold;

    private final Map<String, Object> additionalProperties;

    private ConfigureEndUtteranceSilenceThreshold(
            int endUtteranceSilenceThreshold, Map<String, Object> additionalProperties) {
        this.endUtteranceSilenceThreshold = endUtteranceSilenceThreshold;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The duration threshold in milliseconds
     */
    @JsonProperty("end_utterance_silence_threshold")
    public int getEndUtteranceSilenceThreshold() {
        return endUtteranceSilenceThreshold;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConfigureEndUtteranceSilenceThreshold
                && equalTo((ConfigureEndUtteranceSilenceThreshold) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConfigureEndUtteranceSilenceThreshold other) {
        return endUtteranceSilenceThreshold == other.endUtteranceSilenceThreshold;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.endUtteranceSilenceThreshold);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EndUtteranceSilenceThresholdStage builder() {
        return new Builder();
    }

    public interface EndUtteranceSilenceThresholdStage {
        _FinalStage endUtteranceSilenceThreshold(int endUtteranceSilenceThreshold);

        Builder from(ConfigureEndUtteranceSilenceThreshold other);
    }

    public interface _FinalStage {
        ConfigureEndUtteranceSilenceThreshold build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EndUtteranceSilenceThresholdStage, _FinalStage {
        private int endUtteranceSilenceThreshold;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ConfigureEndUtteranceSilenceThreshold other) {
            endUtteranceSilenceThreshold(other.getEndUtteranceSilenceThreshold());
            return this;
        }

        /**
         * <p>The duration threshold in milliseconds</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("end_utterance_silence_threshold")
        public _FinalStage endUtteranceSilenceThreshold(int endUtteranceSilenceThreshold) {
            this.endUtteranceSilenceThreshold = endUtteranceSilenceThreshold;
            return this;
        }

        @Override
        public ConfigureEndUtteranceSilenceThreshold build() {
            return new ConfigureEndUtteranceSilenceThreshold(endUtteranceSilenceThreshold, additionalProperties);
        }
    }
}