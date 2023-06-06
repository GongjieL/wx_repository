package com.tencent.wxcloudrun.openai.request;

import com.tencent.wxcloudrun.openai.ApiBaseRequest;
import com.tencent.wxcloudrun.openai.bo.OpenAIReplayParam;
import org.springframework.http.HttpHeaders;

public class OpenAIReplayRequest extends ApiBaseRequest<OpenAIReplayParam> {





    {
        headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        setRequestCode(002);
    }


}
