package ru.otus.java.basic;

public class Request {
    private String rawRequest;
    private String method;
    private String uri;

    public Request(String rawRequest) {
        this.rawRequest = rawRequest;
    }
    private void parse() {
        int startIndex = rawRequest.indexOf(' ');
        int endIndex = rawRequest.indexOf(' ', startIndex + 1);
        this.method = rawRequest.substring(0, startIndex);
        this.uri = rawRequest.substring(startIndex + 1, endIndex);

    }
}
