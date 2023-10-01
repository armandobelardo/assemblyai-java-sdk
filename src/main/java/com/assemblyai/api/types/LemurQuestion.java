/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.types;

import com.assemblyai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LemurQuestion.Builder.class)
public final class LemurQuestion {
    private final String question;

    private final Optional<LemurQuestionContext> context;

    private final Optional<String> answerFormat;

    private final Optional<List<String>> answerOptions;

    private LemurQuestion(
            String question,
            Optional<LemurQuestionContext> context,
            Optional<String> answerFormat,
            Optional<List<String>> answerOptions) {
        this.question = question;
        this.context = context;
        this.answerFormat = answerFormat;
        this.answerOptions = answerOptions;
    }

    /**
     * @return The question you wish to ask. For more complex questions use default model.
     */
    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    /**
     * @return Any context about the transcripts you wish to provide. This can be a string, or free-form JSON.
     */
    @JsonProperty("context")
    public Optional<LemurQuestionContext> getContext() {
        return context;
    }

    /**
     * @return How you want the answer to be returned. This can be any text. Can't be used with answer_options. Examples: &quot;short sentence&quot;, &quot;bullet points&quot;
     */
    @JsonProperty("answer_format")
    public Optional<String> getAnswerFormat() {
        return answerFormat;
    }

    /**
     * @return What discrete options to return. Useful for precise responses. Can't be used with answer_format. Example: [&quot;Yes&quot;, &quot;No&quot;]
     */
    @JsonProperty("answer_options")
    public Optional<List<String>> getAnswerOptions() {
        return answerOptions;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LemurQuestion && equalTo((LemurQuestion) other);
    }

    private boolean equalTo(LemurQuestion other) {
        return question.equals(other.question)
                && context.equals(other.context)
                && answerFormat.equals(other.answerFormat)
                && answerOptions.equals(other.answerOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.question, this.context, this.answerFormat, this.answerOptions);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static QuestionStage builder() {
        return new Builder();
    }

    public interface QuestionStage {
        _FinalStage question(String question);

        Builder from(LemurQuestion other);
    }

    public interface _FinalStage {
        LemurQuestion build();

        _FinalStage context(Optional<LemurQuestionContext> context);

        _FinalStage context(LemurQuestionContext context);

        _FinalStage answerFormat(Optional<String> answerFormat);

        _FinalStage answerFormat(String answerFormat);

        _FinalStage answerOptions(Optional<List<String>> answerOptions);

        _FinalStage answerOptions(List<String> answerOptions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements QuestionStage, _FinalStage {
        private String question;

        private Optional<List<String>> answerOptions = Optional.empty();

        private Optional<String> answerFormat = Optional.empty();

        private Optional<LemurQuestionContext> context = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(LemurQuestion other) {
            question(other.getQuestion());
            context(other.getContext());
            answerFormat(other.getAnswerFormat());
            answerOptions(other.getAnswerOptions());
            return this;
        }

        /**
         * <p>The question you wish to ask. For more complex questions use default model.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("question")
        public _FinalStage question(String question) {
            this.question = question;
            return this;
        }

        /**
         * <p>What discrete options to return. Useful for precise responses. Can't be used with answer_format. Example: [&quot;Yes&quot;, &quot;No&quot;]</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage answerOptions(List<String> answerOptions) {
            this.answerOptions = Optional.of(answerOptions);
            return this;
        }

        @Override
        @JsonSetter(value = "answer_options", nulls = Nulls.SKIP)
        public _FinalStage answerOptions(Optional<List<String>> answerOptions) {
            this.answerOptions = answerOptions;
            return this;
        }

        /**
         * <p>How you want the answer to be returned. This can be any text. Can't be used with answer_options. Examples: &quot;short sentence&quot;, &quot;bullet points&quot;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage answerFormat(String answerFormat) {
            this.answerFormat = Optional.of(answerFormat);
            return this;
        }

        @Override
        @JsonSetter(value = "answer_format", nulls = Nulls.SKIP)
        public _FinalStage answerFormat(Optional<String> answerFormat) {
            this.answerFormat = answerFormat;
            return this;
        }

        /**
         * <p>Any context about the transcripts you wish to provide. This can be a string, or free-form JSON.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage context(LemurQuestionContext context) {
            this.context = Optional.of(context);
            return this;
        }

        @Override
        @JsonSetter(value = "context", nulls = Nulls.SKIP)
        public _FinalStage context(Optional<LemurQuestionContext> context) {
            this.context = context;
            return this;
        }

        @Override
        public LemurQuestion build() {
            return new LemurQuestion(question, context, answerFormat, answerOptions);
        }
    }
}
