package com.infoshareacademy.patterns.factory;

public class Configuration {

    private int port;

    private String remoteServiceUrl;
    private int remoteServicePort;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getRemoteServiceUrl() {
        return remoteServiceUrl;
    }

    public void setRemoteServiceUrl(String remoteServiceUrl) {
        this.remoteServiceUrl = remoteServiceUrl;
    }

    public int getRemoteServicePort() {
        return remoteServicePort;
    }

    public void setRemoteServicePort(int remoteServicePort) {
        this.remoteServicePort = remoteServicePort;
    }

    @Override public String toString() {
        return "Configuration{" +
            "port=" + port +
            ", remoteServiceUrl='" + remoteServiceUrl + '\'' +
            ", remoteServicePort=" + remoteServicePort +
            '}';
    }
}
