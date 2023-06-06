package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.service.OpenAiService;
import com.tencent.wxcloudrun.service.request.BaseRequest;
import com.tencent.wxcloudrun.service.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openai")
public class OpenAiController {

    @Autowired
    private OpenAiService openAiService;


    @RequestMapping("/auth")
    public BaseResponse<Boolean> auth() {
        return openAiService.auth();
    }

    @PostMapping("/getReplay")
    public BaseResponse<String> getReplay(@RequestBody BaseRequest<String> request) {
        return openAiService.getReplay(request);
    }
}
