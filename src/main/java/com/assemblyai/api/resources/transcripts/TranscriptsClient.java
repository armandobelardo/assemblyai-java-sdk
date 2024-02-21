/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.resources.transcripts;

import com.assemblyai.api.core.ApiError;
import com.assemblyai.api.core.ClientOptions;
import com.assemblyai.api.core.MediaTypes;
import com.assemblyai.api.core.ObjectMappers;
import com.assemblyai.api.core.RequestOptions;
import com.assemblyai.api.resources.transcripts.requests.GetSubtitlesParams;
import com.assemblyai.api.resources.transcripts.requests.ListTranscriptParams;
import com.assemblyai.api.resources.transcripts.requests.TranscriptParams;
import com.assemblyai.api.resources.transcripts.requests.WordSearchParams;
import com.assemblyai.api.resources.transcripts.types.ParagraphsResponse;
import com.assemblyai.api.resources.transcripts.types.RedactedAudioResponse;
import com.assemblyai.api.resources.transcripts.types.SentencesResponse;
import com.assemblyai.api.resources.transcripts.types.SubtitleFormat;
import com.assemblyai.api.resources.transcripts.types.Transcript;
import com.assemblyai.api.resources.transcripts.types.TranscriptList;
import com.assemblyai.api.resources.transcripts.types.WordSearchResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TranscriptsClient {
    protected final ClientOptions clientOptions;

    public TranscriptsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Retrieve a list of transcripts you created
     */
    public TranscriptList list() {
        return list(ListTranscriptParams.builder().build());
    }

    /**
     * Retrieve a list of transcripts you created
     */
    public TranscriptList list(ListTranscriptParams request) {
        return list(request, null);
    }

    /**
     * Retrieve a list of transcripts you created
     */
    public TranscriptList list(ListTranscriptParams request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript");
        if (request.getLimit().isPresent()) {
            httpUrl.addQueryParameter("limit", request.getLimit().get().toString());
        }
        if (request.getStatus().isPresent()) {
            httpUrl.addQueryParameter("status", request.getStatus().get().toString());
        }
        if (request.getCreatedOn().isPresent()) {
            httpUrl.addQueryParameter("created_on", request.getCreatedOn().get());
        }
        if (request.getBeforeId().isPresent()) {
            httpUrl.addQueryParameter("before_id", request.getBeforeId().get());
        }
        if (request.getAfterId().isPresent()) {
            httpUrl.addQueryParameter("after_id", request.getAfterId().get());
        }
        if (request.getThrottledOnly().isPresent()) {
            httpUrl.addQueryParameter(
                    "throttled_only", request.getThrottledOnly().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), TranscriptList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create a transcript from an audio or video file that is accessible via a URL.
     */
    public Transcript submit(TranscriptParams request) {
        return submit(request, null);
    }

    /**
     * Create a transcript from an audio or video file that is accessible via a URL.
     */
    public Transcript submit(TranscriptParams request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Transcript.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the transcript resource. The transcript is ready when the &quot;status&quot; is &quot;completed&quot;.
     */
    public Transcript get(String transcriptId) {
        return get(transcriptId, null);
    }

    /**
     * Get the transcript resource. The transcript is ready when the &quot;status&quot; is &quot;completed&quot;.
     */
    public Transcript get(String transcriptId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Transcript.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Delete the transcript
     */
    public Transcript delete(String transcriptId) {
        return delete(transcriptId, null);
    }

    /**
     * Delete the transcript
     */
    public Transcript delete(String transcriptId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Transcript.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Export your transcript in SRT or VTT format, to be plugged into a video player for subtitles and closed captions.
     */
    public String getSubtitles(String transcriptId, SubtitleFormat subtitleFormat) {
        return getSubtitles(
                transcriptId, subtitleFormat, GetSubtitlesParams.builder().build());
    }

    /**
     * Export your transcript in SRT or VTT format, to be plugged into a video player for subtitles and closed captions.
     */
    public String getSubtitles(String transcriptId, SubtitleFormat subtitleFormat, GetSubtitlesParams request) {
        return getSubtitles(transcriptId, subtitleFormat, request, null);
    }

    /**
     * Export your transcript in SRT or VTT format, to be plugged into a video player for subtitles and closed captions.
     */
    public String getSubtitles(
            String transcriptId,
            SubtitleFormat subtitleFormat,
            GetSubtitlesParams request,
            RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .addPathSegment(subtitleFormat.toString());
        if (request.getCharsPerCaption().isPresent()) {
            httpUrl.addQueryParameter(
                    "chars_per_caption", request.getCharsPerCaption().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return response.body().string();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the transcript split by sentences. The API will attempt to semantically segment the transcript into sentences to create more reader-friendly transcripts.
     */
    public SentencesResponse getSentences(String transcriptId) {
        return getSentences(transcriptId, null);
    }

    /**
     * Get the transcript split by sentences. The API will attempt to semantically segment the transcript into sentences to create more reader-friendly transcripts.
     */
    public SentencesResponse getSentences(String transcriptId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .addPathSegments("sentences")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), SentencesResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the transcript split by paragraphs. The API will attempt to semantically segment your transcript into paragraphs to create more reader-friendly transcripts.
     */
    public ParagraphsResponse getParagraphs(String transcriptId) {
        return getParagraphs(transcriptId, null);
    }

    /**
     * Get the transcript split by paragraphs. The API will attempt to semantically segment your transcript into paragraphs to create more reader-friendly transcripts.
     */
    public ParagraphsResponse getParagraphs(String transcriptId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .addPathSegments("paragraphs")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ParagraphsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Search through the transcript for a specific set of keywords. You can search for individual words, numbers, or phrases containing up to five words or numbers.
     */
    public WordSearchResponse wordSearch(String transcriptId) {
        return wordSearch(transcriptId, WordSearchParams.builder().build());
    }

    /**
     * Search through the transcript for a specific set of keywords. You can search for individual words, numbers, or phrases containing up to five words or numbers.
     */
    public WordSearchResponse wordSearch(String transcriptId, WordSearchParams request) {
        return wordSearch(transcriptId, request, null);
    }

    /**
     * Search through the transcript for a specific set of keywords. You can search for individual words, numbers, or phrases containing up to five words or numbers.
     */
    public WordSearchResponse wordSearch(String transcriptId, WordSearchParams request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .addPathSegments("word-search");
        if (request.getWords().isPresent()) {
            httpUrl.addQueryParameter("words", request.getWords().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), WordSearchResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Retrieve the redacted audio object containing the status and URL to the redacted audio.
     */
    public RedactedAudioResponse getRedactedAudio(String transcriptId) {
        return getRedactedAudio(transcriptId, null);
    }

    /**
     * Retrieve the redacted audio object containing the status and URL to the redacted audio.
     */
    public RedactedAudioResponse getRedactedAudio(String transcriptId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .addPathSegments("redacted-audio")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions.getTimeout().isPresent()) {
                client = client.newBuilder()
                        .readTimeout(requestOptions.getTimeout().get(), requestOptions.getTimeoutTimeUnit())
                        .build();
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), RedactedAudioResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
