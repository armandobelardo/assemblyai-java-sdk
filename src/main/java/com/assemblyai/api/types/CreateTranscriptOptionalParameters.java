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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CreateTranscriptOptionalParameters.Builder.class)
public final class CreateTranscriptOptionalParameters implements ICreateTranscriptOptionalParameters {
    private final Optional<TranscriptLanguageCode> languageCode;

    private final Optional<Boolean> punctuate;

    private final Optional<Boolean> formatText;

    private final Optional<Boolean> dualChannel;

    private final Optional<String> webhookUrl;

    private final Optional<String> webhookAuthHeaderName;

    private final Optional<String> webhookAuthHeaderValue;

    private final Optional<Boolean> autoHighlights;

    private final Optional<Integer> audioStartFrom;

    private final Optional<Integer> audioEndAt;

    private final Optional<List<String>> wordBoost;

    private final Optional<TranscriptBoostParam> boostParam;

    private final Optional<Boolean> filterProfanity;

    private final Optional<Boolean> redactPii;

    private final Optional<Boolean> redactPiiAudio;

    private final Optional<String> redactPiiAudioQuality;

    private final Optional<List<PiiPolicy>> redactPiiPolicies;

    private final Optional<SubstitutionPolicy> redactPiiSub;

    private final Optional<Boolean> speakerLabels;

    private final Optional<Integer> speakersExpected;

    private final Optional<Boolean> contentSafety;

    private final Optional<Boolean> iabCategories;

    private final Optional<Boolean> languageDetection;

    private final Optional<List<TranscriptCustomSpelling>> customSpelling;

    private final Optional<Boolean> disfluencies;

    private final Optional<Boolean> sentimentAnalysis;

    private final Optional<Boolean> autoChapters;

    private final Optional<Boolean> entityDetection;

    private final Optional<Double> speechThreshold;

    private final Optional<Boolean> summarization;

    private final Optional<SummaryModel> summaryModel;

    private final Optional<SummaryType> summaryType;

    private final Optional<Boolean> customTopics;

    private final Optional<List<String>> topics;

    private final Map<String, Object> additionalProperties;

    private CreateTranscriptOptionalParameters(
            Optional<TranscriptLanguageCode> languageCode,
            Optional<Boolean> punctuate,
            Optional<Boolean> formatText,
            Optional<Boolean> dualChannel,
            Optional<String> webhookUrl,
            Optional<String> webhookAuthHeaderName,
            Optional<String> webhookAuthHeaderValue,
            Optional<Boolean> autoHighlights,
            Optional<Integer> audioStartFrom,
            Optional<Integer> audioEndAt,
            Optional<List<String>> wordBoost,
            Optional<TranscriptBoostParam> boostParam,
            Optional<Boolean> filterProfanity,
            Optional<Boolean> redactPii,
            Optional<Boolean> redactPiiAudio,
            Optional<String> redactPiiAudioQuality,
            Optional<List<PiiPolicy>> redactPiiPolicies,
            Optional<SubstitutionPolicy> redactPiiSub,
            Optional<Boolean> speakerLabels,
            Optional<Integer> speakersExpected,
            Optional<Boolean> contentSafety,
            Optional<Boolean> iabCategories,
            Optional<Boolean> languageDetection,
            Optional<List<TranscriptCustomSpelling>> customSpelling,
            Optional<Boolean> disfluencies,
            Optional<Boolean> sentimentAnalysis,
            Optional<Boolean> autoChapters,
            Optional<Boolean> entityDetection,
            Optional<Double> speechThreshold,
            Optional<Boolean> summarization,
            Optional<SummaryModel> summaryModel,
            Optional<SummaryType> summaryType,
            Optional<Boolean> customTopics,
            Optional<List<String>> topics,
            Map<String, Object> additionalProperties) {
        this.languageCode = languageCode;
        this.punctuate = punctuate;
        this.formatText = formatText;
        this.dualChannel = dualChannel;
        this.webhookUrl = webhookUrl;
        this.webhookAuthHeaderName = webhookAuthHeaderName;
        this.webhookAuthHeaderValue = webhookAuthHeaderValue;
        this.autoHighlights = autoHighlights;
        this.audioStartFrom = audioStartFrom;
        this.audioEndAt = audioEndAt;
        this.wordBoost = wordBoost;
        this.boostParam = boostParam;
        this.filterProfanity = filterProfanity;
        this.redactPii = redactPii;
        this.redactPiiAudio = redactPiiAudio;
        this.redactPiiAudioQuality = redactPiiAudioQuality;
        this.redactPiiPolicies = redactPiiPolicies;
        this.redactPiiSub = redactPiiSub;
        this.speakerLabels = speakerLabels;
        this.speakersExpected = speakersExpected;
        this.contentSafety = contentSafety;
        this.iabCategories = iabCategories;
        this.languageDetection = languageDetection;
        this.customSpelling = customSpelling;
        this.disfluencies = disfluencies;
        this.sentimentAnalysis = sentimentAnalysis;
        this.autoChapters = autoChapters;
        this.entityDetection = entityDetection;
        this.speechThreshold = speechThreshold;
        this.summarization = summarization;
        this.summaryModel = summaryModel;
        this.summaryType = summaryType;
        this.customTopics = customTopics;
        this.topics = topics;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("language_code")
    @Override
    public Optional<TranscriptLanguageCode> getLanguageCode() {
        return languageCode;
    }

    /**
     * @return Enable Automatic Punctuation, can be true or false
     */
    @JsonProperty("punctuate")
    @Override
    public Optional<Boolean> getPunctuate() {
        return punctuate;
    }

    /**
     * @return Enable Text Formatting, can be true or false
     */
    @JsonProperty("format_text")
    @Override
    public Optional<Boolean> getFormatText() {
        return formatText;
    }

    /**
     * @return Enable <a href="https://assemblyai.com/docs/Models/speech_recognition#dual-channel-transcription">Dual Channel</a> transcription, can be true or false
     */
    @JsonProperty("dual_channel")
    @Override
    public Optional<Boolean> getDualChannel() {
        return dualChannel;
    }

    /**
     * @return The URL to which AssemblyAI send webhooks upon trancription completion
     */
    @JsonProperty("webhook_url")
    @Override
    public Optional<String> getWebhookUrl() {
        return webhookUrl;
    }

    /**
     * @return The header name which should be sent back with webhook calls
     */
    @JsonProperty("webhook_auth_header_name")
    @Override
    public Optional<String> getWebhookAuthHeaderName() {
        return webhookAuthHeaderName;
    }

    /**
     * @return Specify a header name and value to send back with a webhook call for added security
     */
    @JsonProperty("webhook_auth_header_value")
    @Override
    public Optional<String> getWebhookAuthHeaderValue() {
        return webhookAuthHeaderValue;
    }

    /**
     * @return Whether Key Phrases is enabled, either true or false
     */
    @JsonProperty("auto_highlights")
    @Override
    public Optional<Boolean> getAutoHighlights() {
        return autoHighlights;
    }

    /**
     * @return The point in time, in milliseconds, to begin transcribing in your media file
     */
    @JsonProperty("audio_start_from")
    @Override
    public Optional<Integer> getAudioStartFrom() {
        return audioStartFrom;
    }

    /**
     * @return The point in time, in milliseconds, to stop transcribing in your media file
     */
    @JsonProperty("audio_end_at")
    @Override
    public Optional<Integer> getAudioEndAt() {
        return audioEndAt;
    }

    /**
     * @return The list of custom vocabulary to boost transcription probability for
     */
    @JsonProperty("word_boost")
    @Override
    public Optional<List<String>> getWordBoost() {
        return wordBoost;
    }

    /**
     * @return The word boost parameter value
     */
    @JsonProperty("boost_param")
    @Override
    public Optional<TranscriptBoostParam> getBoostParam() {
        return boostParam;
    }

    /**
     * @return Filter profanity from the transcribed text, can be true or false
     */
    @JsonProperty("filter_profanity")
    @Override
    public Optional<Boolean> getFilterProfanity() {
        return filterProfanity;
    }

    /**
     * @return Redact PII from the transcribed text using the Redact PII model, can be true or false
     */
    @JsonProperty("redact_pii")
    @Override
    public Optional<Boolean> getRedactPii() {
        return redactPii;
    }

    /**
     * @return Generate a copy of the original media file with spoken PII &quot;beeped&quot; out, can be true or false. See <a href="https://www.assemblyai.com/docs/Models/pii_redaction">PII redaction</a> for more details.
     */
    @JsonProperty("redact_pii_audio")
    @Override
    public Optional<Boolean> getRedactPiiAudio() {
        return redactPiiAudio;
    }

    /**
     * @return Controls the filetype of the audio created by redact_pii_audio. Currently supports mp3 (default) and wav. See <a href="https://www.assemblyai.com/docs/Models/pii_redaction">PII redaction</a> for more details.
     */
    @JsonProperty("redact_pii_audio_quality")
    @Override
    public Optional<String> getRedactPiiAudioQuality() {
        return redactPiiAudioQuality;
    }

    /**
     * @return The list of PII Redaction policies to enable. See <a href="https://www.assemblyai.com/docs/Models/pii_redaction">PII redaction</a> for more details.
     */
    @JsonProperty("redact_pii_policies")
    @Override
    public Optional<List<PiiPolicy>> getRedactPiiPolicies() {
        return redactPiiPolicies;
    }

    @JsonProperty("redact_pii_sub")
    @Override
    public Optional<SubstitutionPolicy> getRedactPiiSub() {
        return redactPiiSub;
    }

    /**
     * @return Enable <a href="https://www.assemblyai.com/docs/Models/speaker_diarization">Speaker diarization</a>, can be true or false
     */
    @JsonProperty("speaker_labels")
    @Override
    public Optional<Boolean> getSpeakerLabels() {
        return speakerLabels;
    }

    /**
     * @return Tell the speaker label model how many speakers it should attempt to identify, up to 10. See <a href="https://www.assemblyai.com/docs/Models/speaker_diarization">Speaker diarization</a> for more details.
     */
    @JsonProperty("speakers_expected")
    @Override
    public Optional<Integer> getSpeakersExpected() {
        return speakersExpected;
    }

    /**
     * @return Enable <a href="https://www.assemblyai.com/docs/Models/content_moderation">Content Moderation</a>, can be true or false
     */
    @JsonProperty("content_safety")
    @Override
    public Optional<Boolean> getContentSafety() {
        return contentSafety;
    }

    /**
     * @return Enable <a href="https://www.assemblyai.com/docs/Models/iab_classification">Topic Detection</a>, can be true or false
     */
    @JsonProperty("iab_categories")
    @Override
    public Optional<Boolean> getIabCategories() {
        return iabCategories;
    }

    /**
     * @return Whether <a href="https://www.assemblyai.com/docs/Models/speech_recognition#automatic-language-detection">Automatic language detection</a> is enabled, either true or false
     */
    @JsonProperty("language_detection")
    @Override
    public Optional<Boolean> getLanguageDetection() {
        return languageDetection;
    }

    /**
     * @return Customize how words are spelled and formatted using to and from values
     */
    @JsonProperty("custom_spelling")
    @Override
    public Optional<List<TranscriptCustomSpelling>> getCustomSpelling() {
        return customSpelling;
    }

    /**
     * @return Transcribe Filler Words, like &quot;umm&quot;, in your media file; can be true or false
     */
    @JsonProperty("disfluencies")
    @Override
    public Optional<Boolean> getDisfluencies() {
        return disfluencies;
    }

    /**
     * @return Enable <a href="https://www.assemblyai.com/docs/Models/sentiment_analysis">Sentiment Analysis</a>, can be true or false
     */
    @JsonProperty("sentiment_analysis")
    @Override
    public Optional<Boolean> getSentimentAnalysis() {
        return sentimentAnalysis;
    }

    /**
     * @return Enable <a href="https://www.assemblyai.com/docs/Models/auto_chapters">Auto Chapters</a>, can be true or false
     */
    @JsonProperty("auto_chapters")
    @Override
    public Optional<Boolean> getAutoChapters() {
        return autoChapters;
    }

    /**
     * @return Enable <a href="https://www.assemblyai.com/docs/Models/entity_detection">Entity Detection</a>, can be true or false
     */
    @JsonProperty("entity_detection")
    @Override
    public Optional<Boolean> getEntityDetection() {
        return entityDetection;
    }

    /**
     * @return Reject audio files that contain less than this fraction of speech.
     * Valid values are in the range [0, 1] inclusive.
     */
    @JsonProperty("speech_threshold")
    @Override
    public Optional<Double> getSpeechThreshold() {
        return speechThreshold;
    }

    /**
     * @return Enable <a href="https://www.assemblyai.com/docs/Models/summarization">Summarization</a>, can be true or false
     */
    @JsonProperty("summarization")
    @Override
    public Optional<Boolean> getSummarization() {
        return summarization;
    }

    /**
     * @return The model to summarize the transcript
     */
    @JsonProperty("summary_model")
    @Override
    public Optional<SummaryModel> getSummaryModel() {
        return summaryModel;
    }

    /**
     * @return The type of summary
     */
    @JsonProperty("summary_type")
    @Override
    public Optional<SummaryType> getSummaryType() {
        return summaryType;
    }

    /**
     * @return Whether custom topics is enabled, either true or false
     */
    @JsonProperty("custom_topics")
    @Override
    public Optional<Boolean> getCustomTopics() {
        return customTopics;
    }

    /**
     * @return The list of custom topics provided, if custom topics is enabled
     */
    @JsonProperty("topics")
    @Override
    public Optional<List<String>> getTopics() {
        return topics;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateTranscriptOptionalParameters
                && equalTo((CreateTranscriptOptionalParameters) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateTranscriptOptionalParameters other) {
        return languageCode.equals(other.languageCode)
                && punctuate.equals(other.punctuate)
                && formatText.equals(other.formatText)
                && dualChannel.equals(other.dualChannel)
                && webhookUrl.equals(other.webhookUrl)
                && webhookAuthHeaderName.equals(other.webhookAuthHeaderName)
                && webhookAuthHeaderValue.equals(other.webhookAuthHeaderValue)
                && autoHighlights.equals(other.autoHighlights)
                && audioStartFrom.equals(other.audioStartFrom)
                && audioEndAt.equals(other.audioEndAt)
                && wordBoost.equals(other.wordBoost)
                && boostParam.equals(other.boostParam)
                && filterProfanity.equals(other.filterProfanity)
                && redactPii.equals(other.redactPii)
                && redactPiiAudio.equals(other.redactPiiAudio)
                && redactPiiAudioQuality.equals(other.redactPiiAudioQuality)
                && redactPiiPolicies.equals(other.redactPiiPolicies)
                && redactPiiSub.equals(other.redactPiiSub)
                && speakerLabels.equals(other.speakerLabels)
                && speakersExpected.equals(other.speakersExpected)
                && contentSafety.equals(other.contentSafety)
                && iabCategories.equals(other.iabCategories)
                && languageDetection.equals(other.languageDetection)
                && customSpelling.equals(other.customSpelling)
                && disfluencies.equals(other.disfluencies)
                && sentimentAnalysis.equals(other.sentimentAnalysis)
                && autoChapters.equals(other.autoChapters)
                && entityDetection.equals(other.entityDetection)
                && speechThreshold.equals(other.speechThreshold)
                && summarization.equals(other.summarization)
                && summaryModel.equals(other.summaryModel)
                && summaryType.equals(other.summaryType)
                && customTopics.equals(other.customTopics)
                && topics.equals(other.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.languageCode,
                this.punctuate,
                this.formatText,
                this.dualChannel,
                this.webhookUrl,
                this.webhookAuthHeaderName,
                this.webhookAuthHeaderValue,
                this.autoHighlights,
                this.audioStartFrom,
                this.audioEndAt,
                this.wordBoost,
                this.boostParam,
                this.filterProfanity,
                this.redactPii,
                this.redactPiiAudio,
                this.redactPiiAudioQuality,
                this.redactPiiPolicies,
                this.redactPiiSub,
                this.speakerLabels,
                this.speakersExpected,
                this.contentSafety,
                this.iabCategories,
                this.languageDetection,
                this.customSpelling,
                this.disfluencies,
                this.sentimentAnalysis,
                this.autoChapters,
                this.entityDetection,
                this.speechThreshold,
                this.summarization,
                this.summaryModel,
                this.summaryType,
                this.customTopics,
                this.topics);
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
        private Optional<TranscriptLanguageCode> languageCode = Optional.empty();

        private Optional<Boolean> punctuate = Optional.empty();

        private Optional<Boolean> formatText = Optional.empty();

        private Optional<Boolean> dualChannel = Optional.empty();

        private Optional<String> webhookUrl = Optional.empty();

        private Optional<String> webhookAuthHeaderName = Optional.empty();

        private Optional<String> webhookAuthHeaderValue = Optional.empty();

        private Optional<Boolean> autoHighlights = Optional.empty();

        private Optional<Integer> audioStartFrom = Optional.empty();

        private Optional<Integer> audioEndAt = Optional.empty();

        private Optional<List<String>> wordBoost = Optional.empty();

        private Optional<TranscriptBoostParam> boostParam = Optional.empty();

        private Optional<Boolean> filterProfanity = Optional.empty();

        private Optional<Boolean> redactPii = Optional.empty();

        private Optional<Boolean> redactPiiAudio = Optional.empty();

        private Optional<String> redactPiiAudioQuality = Optional.empty();

        private Optional<List<PiiPolicy>> redactPiiPolicies = Optional.empty();

        private Optional<SubstitutionPolicy> redactPiiSub = Optional.empty();

        private Optional<Boolean> speakerLabels = Optional.empty();

        private Optional<Integer> speakersExpected = Optional.empty();

        private Optional<Boolean> contentSafety = Optional.empty();

        private Optional<Boolean> iabCategories = Optional.empty();

        private Optional<Boolean> languageDetection = Optional.empty();

        private Optional<List<TranscriptCustomSpelling>> customSpelling = Optional.empty();

        private Optional<Boolean> disfluencies = Optional.empty();

        private Optional<Boolean> sentimentAnalysis = Optional.empty();

        private Optional<Boolean> autoChapters = Optional.empty();

        private Optional<Boolean> entityDetection = Optional.empty();

        private Optional<Double> speechThreshold = Optional.empty();

        private Optional<Boolean> summarization = Optional.empty();

        private Optional<SummaryModel> summaryModel = Optional.empty();

        private Optional<SummaryType> summaryType = Optional.empty();

        private Optional<Boolean> customTopics = Optional.empty();

        private Optional<List<String>> topics = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CreateTranscriptOptionalParameters other) {
            languageCode(other.getLanguageCode());
            punctuate(other.getPunctuate());
            formatText(other.getFormatText());
            dualChannel(other.getDualChannel());
            webhookUrl(other.getWebhookUrl());
            webhookAuthHeaderName(other.getWebhookAuthHeaderName());
            webhookAuthHeaderValue(other.getWebhookAuthHeaderValue());
            autoHighlights(other.getAutoHighlights());
            audioStartFrom(other.getAudioStartFrom());
            audioEndAt(other.getAudioEndAt());
            wordBoost(other.getWordBoost());
            boostParam(other.getBoostParam());
            filterProfanity(other.getFilterProfanity());
            redactPii(other.getRedactPii());
            redactPiiAudio(other.getRedactPiiAudio());
            redactPiiAudioQuality(other.getRedactPiiAudioQuality());
            redactPiiPolicies(other.getRedactPiiPolicies());
            redactPiiSub(other.getRedactPiiSub());
            speakerLabels(other.getSpeakerLabels());
            speakersExpected(other.getSpeakersExpected());
            contentSafety(other.getContentSafety());
            iabCategories(other.getIabCategories());
            languageDetection(other.getLanguageDetection());
            customSpelling(other.getCustomSpelling());
            disfluencies(other.getDisfluencies());
            sentimentAnalysis(other.getSentimentAnalysis());
            autoChapters(other.getAutoChapters());
            entityDetection(other.getEntityDetection());
            speechThreshold(other.getSpeechThreshold());
            summarization(other.getSummarization());
            summaryModel(other.getSummaryModel());
            summaryType(other.getSummaryType());
            customTopics(other.getCustomTopics());
            topics(other.getTopics());
            return this;
        }

        @JsonSetter(value = "language_code", nulls = Nulls.SKIP)
        public Builder languageCode(Optional<TranscriptLanguageCode> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(TranscriptLanguageCode languageCode) {
            this.languageCode = Optional.of(languageCode);
            return this;
        }

        @JsonSetter(value = "punctuate", nulls = Nulls.SKIP)
        public Builder punctuate(Optional<Boolean> punctuate) {
            this.punctuate = punctuate;
            return this;
        }

        public Builder punctuate(Boolean punctuate) {
            this.punctuate = Optional.of(punctuate);
            return this;
        }

        @JsonSetter(value = "format_text", nulls = Nulls.SKIP)
        public Builder formatText(Optional<Boolean> formatText) {
            this.formatText = formatText;
            return this;
        }

        public Builder formatText(Boolean formatText) {
            this.formatText = Optional.of(formatText);
            return this;
        }

        @JsonSetter(value = "dual_channel", nulls = Nulls.SKIP)
        public Builder dualChannel(Optional<Boolean> dualChannel) {
            this.dualChannel = dualChannel;
            return this;
        }

        public Builder dualChannel(Boolean dualChannel) {
            this.dualChannel = Optional.of(dualChannel);
            return this;
        }

        @JsonSetter(value = "webhook_url", nulls = Nulls.SKIP)
        public Builder webhookUrl(Optional<String> webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }

        public Builder webhookUrl(String webhookUrl) {
            this.webhookUrl = Optional.of(webhookUrl);
            return this;
        }

        @JsonSetter(value = "webhook_auth_header_name", nulls = Nulls.SKIP)
        public Builder webhookAuthHeaderName(Optional<String> webhookAuthHeaderName) {
            this.webhookAuthHeaderName = webhookAuthHeaderName;
            return this;
        }

        public Builder webhookAuthHeaderName(String webhookAuthHeaderName) {
            this.webhookAuthHeaderName = Optional.of(webhookAuthHeaderName);
            return this;
        }

        @JsonSetter(value = "webhook_auth_header_value", nulls = Nulls.SKIP)
        public Builder webhookAuthHeaderValue(Optional<String> webhookAuthHeaderValue) {
            this.webhookAuthHeaderValue = webhookAuthHeaderValue;
            return this;
        }

        public Builder webhookAuthHeaderValue(String webhookAuthHeaderValue) {
            this.webhookAuthHeaderValue = Optional.of(webhookAuthHeaderValue);
            return this;
        }

        @JsonSetter(value = "auto_highlights", nulls = Nulls.SKIP)
        public Builder autoHighlights(Optional<Boolean> autoHighlights) {
            this.autoHighlights = autoHighlights;
            return this;
        }

        public Builder autoHighlights(Boolean autoHighlights) {
            this.autoHighlights = Optional.of(autoHighlights);
            return this;
        }

        @JsonSetter(value = "audio_start_from", nulls = Nulls.SKIP)
        public Builder audioStartFrom(Optional<Integer> audioStartFrom) {
            this.audioStartFrom = audioStartFrom;
            return this;
        }

        public Builder audioStartFrom(Integer audioStartFrom) {
            this.audioStartFrom = Optional.of(audioStartFrom);
            return this;
        }

        @JsonSetter(value = "audio_end_at", nulls = Nulls.SKIP)
        public Builder audioEndAt(Optional<Integer> audioEndAt) {
            this.audioEndAt = audioEndAt;
            return this;
        }

        public Builder audioEndAt(Integer audioEndAt) {
            this.audioEndAt = Optional.of(audioEndAt);
            return this;
        }

        @JsonSetter(value = "word_boost", nulls = Nulls.SKIP)
        public Builder wordBoost(Optional<List<String>> wordBoost) {
            this.wordBoost = wordBoost;
            return this;
        }

        public Builder wordBoost(List<String> wordBoost) {
            this.wordBoost = Optional.of(wordBoost);
            return this;
        }

        @JsonSetter(value = "boost_param", nulls = Nulls.SKIP)
        public Builder boostParam(Optional<TranscriptBoostParam> boostParam) {
            this.boostParam = boostParam;
            return this;
        }

        public Builder boostParam(TranscriptBoostParam boostParam) {
            this.boostParam = Optional.of(boostParam);
            return this;
        }

        @JsonSetter(value = "filter_profanity", nulls = Nulls.SKIP)
        public Builder filterProfanity(Optional<Boolean> filterProfanity) {
            this.filterProfanity = filterProfanity;
            return this;
        }

        public Builder filterProfanity(Boolean filterProfanity) {
            this.filterProfanity = Optional.of(filterProfanity);
            return this;
        }

        @JsonSetter(value = "redact_pii", nulls = Nulls.SKIP)
        public Builder redactPii(Optional<Boolean> redactPii) {
            this.redactPii = redactPii;
            return this;
        }

        public Builder redactPii(Boolean redactPii) {
            this.redactPii = Optional.of(redactPii);
            return this;
        }

        @JsonSetter(value = "redact_pii_audio", nulls = Nulls.SKIP)
        public Builder redactPiiAudio(Optional<Boolean> redactPiiAudio) {
            this.redactPiiAudio = redactPiiAudio;
            return this;
        }

        public Builder redactPiiAudio(Boolean redactPiiAudio) {
            this.redactPiiAudio = Optional.of(redactPiiAudio);
            return this;
        }

        @JsonSetter(value = "redact_pii_audio_quality", nulls = Nulls.SKIP)
        public Builder redactPiiAudioQuality(Optional<String> redactPiiAudioQuality) {
            this.redactPiiAudioQuality = redactPiiAudioQuality;
            return this;
        }

        public Builder redactPiiAudioQuality(String redactPiiAudioQuality) {
            this.redactPiiAudioQuality = Optional.of(redactPiiAudioQuality);
            return this;
        }

        @JsonSetter(value = "redact_pii_policies", nulls = Nulls.SKIP)
        public Builder redactPiiPolicies(Optional<List<PiiPolicy>> redactPiiPolicies) {
            this.redactPiiPolicies = redactPiiPolicies;
            return this;
        }

        public Builder redactPiiPolicies(List<PiiPolicy> redactPiiPolicies) {
            this.redactPiiPolicies = Optional.of(redactPiiPolicies);
            return this;
        }

        @JsonSetter(value = "redact_pii_sub", nulls = Nulls.SKIP)
        public Builder redactPiiSub(Optional<SubstitutionPolicy> redactPiiSub) {
            this.redactPiiSub = redactPiiSub;
            return this;
        }

        public Builder redactPiiSub(SubstitutionPolicy redactPiiSub) {
            this.redactPiiSub = Optional.of(redactPiiSub);
            return this;
        }

        @JsonSetter(value = "speaker_labels", nulls = Nulls.SKIP)
        public Builder speakerLabels(Optional<Boolean> speakerLabels) {
            this.speakerLabels = speakerLabels;
            return this;
        }

        public Builder speakerLabels(Boolean speakerLabels) {
            this.speakerLabels = Optional.of(speakerLabels);
            return this;
        }

        @JsonSetter(value = "speakers_expected", nulls = Nulls.SKIP)
        public Builder speakersExpected(Optional<Integer> speakersExpected) {
            this.speakersExpected = speakersExpected;
            return this;
        }

        public Builder speakersExpected(Integer speakersExpected) {
            this.speakersExpected = Optional.of(speakersExpected);
            return this;
        }

        @JsonSetter(value = "content_safety", nulls = Nulls.SKIP)
        public Builder contentSafety(Optional<Boolean> contentSafety) {
            this.contentSafety = contentSafety;
            return this;
        }

        public Builder contentSafety(Boolean contentSafety) {
            this.contentSafety = Optional.of(contentSafety);
            return this;
        }

        @JsonSetter(value = "iab_categories", nulls = Nulls.SKIP)
        public Builder iabCategories(Optional<Boolean> iabCategories) {
            this.iabCategories = iabCategories;
            return this;
        }

        public Builder iabCategories(Boolean iabCategories) {
            this.iabCategories = Optional.of(iabCategories);
            return this;
        }

        @JsonSetter(value = "language_detection", nulls = Nulls.SKIP)
        public Builder languageDetection(Optional<Boolean> languageDetection) {
            this.languageDetection = languageDetection;
            return this;
        }

        public Builder languageDetection(Boolean languageDetection) {
            this.languageDetection = Optional.of(languageDetection);
            return this;
        }

        @JsonSetter(value = "custom_spelling", nulls = Nulls.SKIP)
        public Builder customSpelling(Optional<List<TranscriptCustomSpelling>> customSpelling) {
            this.customSpelling = customSpelling;
            return this;
        }

        public Builder customSpelling(List<TranscriptCustomSpelling> customSpelling) {
            this.customSpelling = Optional.of(customSpelling);
            return this;
        }

        @JsonSetter(value = "disfluencies", nulls = Nulls.SKIP)
        public Builder disfluencies(Optional<Boolean> disfluencies) {
            this.disfluencies = disfluencies;
            return this;
        }

        public Builder disfluencies(Boolean disfluencies) {
            this.disfluencies = Optional.of(disfluencies);
            return this;
        }

        @JsonSetter(value = "sentiment_analysis", nulls = Nulls.SKIP)
        public Builder sentimentAnalysis(Optional<Boolean> sentimentAnalysis) {
            this.sentimentAnalysis = sentimentAnalysis;
            return this;
        }

        public Builder sentimentAnalysis(Boolean sentimentAnalysis) {
            this.sentimentAnalysis = Optional.of(sentimentAnalysis);
            return this;
        }

        @JsonSetter(value = "auto_chapters", nulls = Nulls.SKIP)
        public Builder autoChapters(Optional<Boolean> autoChapters) {
            this.autoChapters = autoChapters;
            return this;
        }

        public Builder autoChapters(Boolean autoChapters) {
            this.autoChapters = Optional.of(autoChapters);
            return this;
        }

        @JsonSetter(value = "entity_detection", nulls = Nulls.SKIP)
        public Builder entityDetection(Optional<Boolean> entityDetection) {
            this.entityDetection = entityDetection;
            return this;
        }

        public Builder entityDetection(Boolean entityDetection) {
            this.entityDetection = Optional.of(entityDetection);
            return this;
        }

        @JsonSetter(value = "speech_threshold", nulls = Nulls.SKIP)
        public Builder speechThreshold(Optional<Double> speechThreshold) {
            this.speechThreshold = speechThreshold;
            return this;
        }

        public Builder speechThreshold(Double speechThreshold) {
            this.speechThreshold = Optional.of(speechThreshold);
            return this;
        }

        @JsonSetter(value = "summarization", nulls = Nulls.SKIP)
        public Builder summarization(Optional<Boolean> summarization) {
            this.summarization = summarization;
            return this;
        }

        public Builder summarization(Boolean summarization) {
            this.summarization = Optional.of(summarization);
            return this;
        }

        @JsonSetter(value = "summary_model", nulls = Nulls.SKIP)
        public Builder summaryModel(Optional<SummaryModel> summaryModel) {
            this.summaryModel = summaryModel;
            return this;
        }

        public Builder summaryModel(SummaryModel summaryModel) {
            this.summaryModel = Optional.of(summaryModel);
            return this;
        }

        @JsonSetter(value = "summary_type", nulls = Nulls.SKIP)
        public Builder summaryType(Optional<SummaryType> summaryType) {
            this.summaryType = summaryType;
            return this;
        }

        public Builder summaryType(SummaryType summaryType) {
            this.summaryType = Optional.of(summaryType);
            return this;
        }

        @JsonSetter(value = "custom_topics", nulls = Nulls.SKIP)
        public Builder customTopics(Optional<Boolean> customTopics) {
            this.customTopics = customTopics;
            return this;
        }

        public Builder customTopics(Boolean customTopics) {
            this.customTopics = Optional.of(customTopics);
            return this;
        }

        @JsonSetter(value = "topics", nulls = Nulls.SKIP)
        public Builder topics(Optional<List<String>> topics) {
            this.topics = topics;
            return this;
        }

        public Builder topics(List<String> topics) {
            this.topics = Optional.of(topics);
            return this;
        }

        public CreateTranscriptOptionalParameters build() {
            return new CreateTranscriptOptionalParameters(
                    languageCode,
                    punctuate,
                    formatText,
                    dualChannel,
                    webhookUrl,
                    webhookAuthHeaderName,
                    webhookAuthHeaderValue,
                    autoHighlights,
                    audioStartFrom,
                    audioEndAt,
                    wordBoost,
                    boostParam,
                    filterProfanity,
                    redactPii,
                    redactPiiAudio,
                    redactPiiAudioQuality,
                    redactPiiPolicies,
                    redactPiiSub,
                    speakerLabels,
                    speakersExpected,
                    contentSafety,
                    iabCategories,
                    languageDetection,
                    customSpelling,
                    disfluencies,
                    sentimentAnalysis,
                    autoChapters,
                    entityDetection,
                    speechThreshold,
                    summarization,
                    summaryModel,
                    summaryType,
                    customTopics,
                    topics,
                    additionalProperties);
        }
    }
}