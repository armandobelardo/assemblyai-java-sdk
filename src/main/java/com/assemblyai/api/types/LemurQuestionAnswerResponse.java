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
@JsonDeserialize(builder = LemurQuestionAnswerResponse.Builder.class)
public final class LemurQuestionAnswerResponse implements ILemurBaseResponse {
    private final String requestId;

    private final List<LemurQuestionAnswer> response;

    private final Map<String, Object> additionalProperties;

    private LemurQuestionAnswerResponse(
            String requestId, List<LemurQuestionAnswer> response, Map<String, Object> additionalProperties) {
        this.requestId = requestId;
        this.response = response;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the LeMUR request
     */
    @JsonProperty("request_id")
    @Override
    public String getRequestId() {
        return requestId;
    }

    /**
     * @return The answers generated by LeMUR and their questions.
     */
    @JsonProperty("response")
    public List<LemurQuestionAnswer> getResponse() {
        return response;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LemurQuestionAnswerResponse && equalTo((LemurQuestionAnswerResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LemurQuestionAnswerResponse other) {
        return requestId.equals(other.requestId) && response.equals(other.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.requestId, this.response);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RequestIdStage builder() {
        return new Builder();
    }

    public interface RequestIdStage {
        _FinalStage requestId(String requestId);

        Builder from(LemurQuestionAnswerResponse other);
    }

    public interface _FinalStage {
        LemurQuestionAnswerResponse build();

        _FinalStage response(List<LemurQuestionAnswer> response);

        _FinalStage addResponse(LemurQuestionAnswer response);

        _FinalStage addAllResponse(List<LemurQuestionAnswer> response);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RequestIdStage, _FinalStage {
        private String requestId;

        private List<LemurQuestionAnswer> response = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(LemurQuestionAnswerResponse other) {
            requestId(other.getRequestId());
            response(other.getResponse());
            return this;
        }

        /**
         * <p>The ID of the LeMUR request</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("request_id")
        public _FinalStage requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The answers generated by LeMUR and their questions.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage addAllResponse(List<LemurQuestionAnswer> response) {
            this.response.addAll(response);
            return this;
        }

        /**
         * <p>The answers generated by LeMUR and their questions.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage addResponse(LemurQuestionAnswer response) {
            this.response.add(response);
            return this;
        }

        @Override
        @JsonSetter(value = "response", nulls = Nulls.SKIP)
        public _FinalStage response(List<LemurQuestionAnswer> response) {
            this.response.clear();
            this.response.addAll(response);
            return this;
        }

        @Override
        public LemurQuestionAnswerResponse build() {
            return new LemurQuestionAnswerResponse(requestId, response, additionalProperties);
        }
    }
}
