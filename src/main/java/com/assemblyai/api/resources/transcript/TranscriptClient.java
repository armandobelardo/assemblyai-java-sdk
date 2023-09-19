/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.resources.transcript;

import com.assemblyai.api.core.ApiError;
import com.assemblyai.api.core.ClientOptions;
import com.assemblyai.api.core.ObjectMappers;
import com.assemblyai.api.core.RequestOptions;
import com.assemblyai.api.resources.transcript.requests.CreateTranscriptParameters;
import com.assemblyai.api.resources.transcript.requests.TranscriptExportAsSrtRequest;
import com.assemblyai.api.resources.transcript.requests.TranscriptExportAsVttRequest;
import com.assemblyai.api.resources.transcript.requests.TranscriptListRequest;
import com.assemblyai.api.resources.transcript.requests.TranscriptSearchRequest;
import com.assemblyai.api.types.RedactedAudioResult;
import com.assemblyai.api.types.Transcript;
import com.assemblyai.api.types.TranscriptList;
import com.assemblyai.api.types.TranscriptParagraphResource;
import com.assemblyai.api.types.TranscriptSearchResults;
import com.assemblyai.api.types.TranscriptSentenceResource;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TranscriptClient {
    protected final ClientOptions clientOptions;

    public TranscriptClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public TranscriptList list(TranscriptListRequest request) {
        return list(request, null);
    }

    /**
     * Retrieve a list of transcripts you have created.
     */
    public TranscriptList list(TranscriptListRequest request, RequestOptions requestOptions) {
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
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

    public TranscriptList list() {
        return list(TranscriptListRequest.builder().build());
    }

    public Transcript create(CreateTranscriptParameters request) {
        return create(request, null);
    }

    /**
     * Create a transcript from an audio or video file that is accessible via a URL.
     */
    public Transcript create(CreateTranscriptParameters request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
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

    public Transcript get(String transcriptId) {
        return get(transcriptId, null);
    }

    /**
     * Get the transcript resource. The transcript is ready when the "status" is "completed".
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
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

    public String exportAsVtt(String transcriptId, TranscriptExportAsVttRequest request) {
        return exportAsVtt(transcriptId, request, null);
    }

    /**
     * Export your transcript in VTT format, to be plugged into a video player for subtitles and closed captions.
     */
    public String exportAsVtt(
            String transcriptId, TranscriptExportAsVttRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .addPathSegments("vtt");
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
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

    public String exportAsVtt(String transcriptId) {
        return exportAsVtt(transcriptId, TranscriptExportAsVttRequest.builder().build());
    }

    public String exportAsSrt(String transcriptId, TranscriptExportAsSrtRequest request) {
        return exportAsSrt(transcriptId, request, null);
    }

    /**
     * Export your transcript in SRT format, to be plugged into a video player for subtitles and closed captions.
     */
    public String exportAsSrt(
            String transcriptId, TranscriptExportAsSrtRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v2/transcript")
                .addPathSegment(transcriptId)
                .addPathSegments("srt");
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
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

    public String exportAsSrt(String transcriptId) {
        return exportAsSrt(transcriptId, TranscriptExportAsSrtRequest.builder().build());
    }

    public TranscriptSentenceResource getSentences(String transcriptId) {
        return getSentences(transcriptId, null);
    }

    /**
     * Get the transcript split by sentences. The API will attempt to semantically segment the transcript into sentences to create more reader-friendly transcripts.
     */
    public TranscriptSentenceResource getSentences(String transcriptId, RequestOptions requestOptions) {
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), TranscriptSentenceResource.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TranscriptParagraphResource getParagraphs(String transcriptId) {
        return getParagraphs(transcriptId, null);
    }

    /**
     * Get the transcript split by paragraphs. The API will attempt to semantically segment your transcript into paragraphs to create more reader-friendly transcripts.
     */
    public TranscriptParagraphResource getParagraphs(String transcriptId, RequestOptions requestOptions) {
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), TranscriptParagraphResource.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TranscriptSearchResults search(String transcriptId, TranscriptSearchRequest request) {
        return search(transcriptId, request, null);
    }

    /**
     * Search through the transcript for a specific set of keywords. You can search for individual words, numbers, or phrases containing up to five words or numbers.
     */
    public TranscriptSearchResults search(
            String transcriptId, TranscriptSearchRequest request, RequestOptions requestOptions) {
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), TranscriptSearchResults.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TranscriptSearchResults search(String transcriptId) {
        return search(transcriptId, TranscriptSearchRequest.builder().build());
    }

    public RedactedAudioResult getRedactedAudio(String transcriptId) {
        return getRedactedAudio(transcriptId, null);
    }

    public RedactedAudioResult getRedactedAudio(String transcriptId, RequestOptions requestOptions) {
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
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), RedactedAudioResult.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
