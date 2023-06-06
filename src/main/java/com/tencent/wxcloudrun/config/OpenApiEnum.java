package com.tencent.wxcloudrun.config;

public enum OpenApiEnum {
    OPEN_AI_AUTH(0001, "get", "http://43.135.135.141:8080/openai/auth"),
    OPEN_AI_GET_REPLAY(0002, "get", "http://43.135.135.141:8080/openai/getReplay"),
    ;


    OpenApiEnum(Integer code, String method, String url) {
        this.code = code;
        this.method = method;
        this.url = url;
    }

    private Integer code;
    private String method;
    private String url;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static OpenApiEnum getOpenApiEnumByCode(Integer code){
        for (OpenApiEnum value : OpenApiEnum.values()) {
            if(value.getCode().equals(code)){
                return value;
            }
        }
        return null;
    }
}
