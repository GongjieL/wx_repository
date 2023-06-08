package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.service.request.BaseRequest;
import com.tencent.wxcloudrun.service.request.ChatAiInfo;
import com.tencent.wxcloudrun.service.request.UserInfo;
import com.tencent.wxcloudrun.service.response.BaseResponse;

import java.util.List;

public interface OpenAiService {


    public abstract BaseResponse<Boolean> auth();

    public abstract BaseResponse<String> getReplay(BaseRequest<String> request);


    public abstract BaseResponse<Boolean> authWithProxy();

    public abstract BaseResponse<UserInfo> loginWithProxy(BaseRequest<UserInfo> userInfo);

    public abstract BaseResponse<String> getReplayWithProxy(BaseRequest<String> request);

    public abstract BaseResponse<List<String>> generateImageWithProxy(BaseRequest<String> request);

    BaseResponse<List<ChatAiInfo>> listLatestChatAiResponsesWithProxy(Integer size);
}
