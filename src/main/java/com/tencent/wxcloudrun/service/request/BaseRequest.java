package com.tencent.wxcloudrun.service.request;

public class BaseRequest<T> {
    private String token;

    private T requestData;



    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public T getRequestData() {
        return requestData;
    }

    public void setRequestData(T requestData) {
        this.requestData = requestData;
    }
}
