package com.assemblyai.api.core;

public final class Environment {
    public static final Environment DEFAULT = new Environment("https://api.assemblyai.com/v2");

    private final String url;

    private Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public static Environment custom(String url) {
        return new Environment(url);
    }
}
