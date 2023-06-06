package com.tencent.wxcloudrun.openai;

import org.springframework.http.HttpHeaders;


public class ApiBaseRequest<T> {


    protected HttpHeaders headers;


    private Integer requestCode;


    private T paramData;


    public T getParamData() {
        return paramData;
    }

    public void setParamData(T paramData) {
        this.paramData = paramData;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }

    public Integer getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(Integer requestCode) {
        this.requestCode = requestCode;
    }
}
