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
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PageDetails.Builder.class)
public final class PageDetails {
    private final Optional<Integer> limit;

    private final int resultCount;

    private final String currentUrl;

    private final String prevUrl;

    private final Optional<String> nextUrl;

    private PageDetails(
            Optional<Integer> limit, int resultCount, String currentUrl, String prevUrl, Optional<String> nextUrl) {
        this.limit = limit;
        this.resultCount = resultCount;
        this.currentUrl = currentUrl;
        this.prevUrl = prevUrl;
        this.nextUrl = nextUrl;
    }

    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    @JsonProperty("result_count")
    public int getResultCount() {
        return resultCount;
    }

    @JsonProperty("current_url")
    public String getCurrentUrl() {
        return currentUrl;
    }

    @JsonProperty("prev_url")
    public String getPrevUrl() {
        return prevUrl;
    }

    @JsonProperty("next_url")
    public Optional<String> getNextUrl() {
        return nextUrl;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PageDetails && equalTo((PageDetails) other);
    }

    private boolean equalTo(PageDetails other) {
        return limit.equals(other.limit)
                && resultCount == other.resultCount
                && currentUrl.equals(other.currentUrl)
                && prevUrl.equals(other.prevUrl)
                && nextUrl.equals(other.nextUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.limit, this.resultCount, this.currentUrl, this.prevUrl, this.nextUrl);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ResultCountStage builder() {
        return new Builder();
    }

    public interface ResultCountStage {
        CurrentUrlStage resultCount(int resultCount);

        Builder from(PageDetails other);
    }

    public interface CurrentUrlStage {
        PrevUrlStage currentUrl(String currentUrl);
    }

    public interface PrevUrlStage {
        _FinalStage prevUrl(String prevUrl);
    }

    public interface _FinalStage {
        PageDetails build();

        _FinalStage limit(Optional<Integer> limit);

        _FinalStage limit(Integer limit);

        _FinalStage nextUrl(Optional<String> nextUrl);

        _FinalStage nextUrl(String nextUrl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ResultCountStage, CurrentUrlStage, PrevUrlStage, _FinalStage {
        private int resultCount;

        private String currentUrl;

        private String prevUrl;

        private Optional<String> nextUrl = Optional.empty();

        private Optional<Integer> limit = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(PageDetails other) {
            limit(other.getLimit());
            resultCount(other.getResultCount());
            currentUrl(other.getCurrentUrl());
            prevUrl(other.getPrevUrl());
            nextUrl(other.getNextUrl());
            return this;
        }

        @Override
        @JsonSetter("result_count")
        public CurrentUrlStage resultCount(int resultCount) {
            this.resultCount = resultCount;
            return this;
        }

        @Override
        @JsonSetter("current_url")
        public PrevUrlStage currentUrl(String currentUrl) {
            this.currentUrl = currentUrl;
            return this;
        }

        @Override
        @JsonSetter("prev_url")
        public _FinalStage prevUrl(String prevUrl) {
            this.prevUrl = prevUrl;
            return this;
        }

        @Override
        public _FinalStage nextUrl(String nextUrl) {
            this.nextUrl = Optional.of(nextUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "next_url", nulls = Nulls.SKIP)
        public _FinalStage nextUrl(Optional<String> nextUrl) {
            this.nextUrl = nextUrl;
            return this;
        }

        @Override
        public _FinalStage limit(Integer limit) {
            this.limit = Optional.of(limit);
            return this;
        }

        @Override
        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public _FinalStage limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        @Override
        public PageDetails build() {
            return new PageDetails(limit, resultCount, currentUrl, prevUrl, nextUrl);
        }
    }
}
