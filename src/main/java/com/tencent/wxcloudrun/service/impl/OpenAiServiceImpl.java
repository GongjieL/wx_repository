package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.openai.OpenApiHttp;
import com.tencent.wxcloudrun.openai.bo.OpenAIReplayMessage;
import com.tencent.wxcloudrun.openai.bo.OpenAIReplayParam;
import com.tencent.wxcloudrun.openai.request.OpenAIAuthRequest;
import com.tencent.wxcloudrun.openai.request.OpenAIReplayRequest;
import com.tencent.wxcloudrun.openai.response.OpenAiAuthResponse;
import com.tencent.wxcloudrun.openai.response.OpenAiReplayResponse;
import com.tencent.wxcloudrun.service.request.BaseRequest;
import com.tencent.wxcloudrun.service.response.BaseResponse;
import com.tencent.wxcloudrun.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpenAiServiceImpl implements OpenAiService {

    @Value("${open-ai-model}")
    private String openAiModel;

    @Value("${open-ai-temperature}")
    private Double openAiTemperature;



    @Value("${open-ai-replay-message-role}")
    private String openAiReplayMessageRole;


    @Autowired
    private OpenApiHttp openApiHttp;

    public BaseResponse<Boolean> auth() {
        OpenAIAuthRequest aiAuthRequest = new OpenAIAuthRequest();
        OpenAiAuthResponse openAiAuthResult = openApiHttp.getOpenAiAuthResult(aiAuthRequest);
        BaseResponse<Boolean> response = new BaseResponse<>();
        response.setCode(openAiAuthResult.getCode());
        response.setSuccess(openAiAuthResult.getSuccess());
        response.setMsg(openAiAuthResult.getMessage());
        response.setData(openAiAuthResult.getData());
        return response;
    }

    public BaseResponse<String> getReplay(BaseRequest<String> request) {
        OpenAIReplayParam paramData = new OpenAIReplayParam();
        paramData.setModel(openAiModel);
        paramData.setTemperature(openAiTemperature);
        List<OpenAIReplayMessage> openAIReplayMessages = new ArrayList<>();
        paramData.setMessages(openAIReplayMessages);
        OpenAIReplayMessage openAIReplayMessage = new OpenAIReplayMessage();
        openAIReplayMessage.setRole(openAiReplayMessageRole);
        openAIReplayMessage.setContent(request.getRequestData());
        openAIReplayMessages.add(openAIReplayMessage);
        OpenAIReplayRequest aiReplayRequest = new OpenAIReplayRequest();
        aiReplayRequest.setParamData(paramData);
        OpenAiReplayResponse openAiReplayResponse = openApiHttp.getOpenAiReplayResult(aiReplayRequest);
        BaseResponse<String> response = new BaseResponse<>();
        response.setCode(openAiReplayResponse.getCode());
        response.setSuccess(openAiReplayResponse.getSuccess());
        response.setMsg(openAiReplayResponse.getMessage());
        response.setData(openAiReplayResponse.getData());
        return response;
    }
}
