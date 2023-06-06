package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.service.request.BaseRequest;
import com.tencent.wxcloudrun.service.response.BaseResponse;

public interface OpenAiService {


    public abstract BaseResponse<Boolean> auth();

    public abstract BaseResponse<String> getReplay(BaseRequest<String> request);


    public abstract BaseResponse<Boolean> authWithProxy();

    public abstract BaseResponse<String> getReplayWithProxy(BaseRequest<String> request);
}
