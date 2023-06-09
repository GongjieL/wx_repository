package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.service.OpenAiService;
import com.tencent.wxcloudrun.service.request.BaseRequest;
import com.tencent.wxcloudrun.service.request.ChatAiInfo;
import com.tencent.wxcloudrun.service.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/openai")
public class OpenAiController {

    @Autowired
    private OpenAiService openAiService;


    @RequestMapping("/auth")
    public BaseResponse<Boolean> auth() {
        return openAiService.authWithProxy();
    }

    @PostMapping("/getReplay")
    public BaseResponse<String> getReplay(@RequestBody BaseRequest<String> request) {
        return openAiService.getReplayWithProxy(request);
    }


    @PostMapping("/getLocalReplay")
    public BaseResponse<String> getLocalReplay(@RequestBody BaseRequest<String> request) {
        return openAiService.getLocalReplayWithProxy(request);
    }

    @PostMapping("/generateImage")
    public BaseResponse<List<String>> generateImageWithProxy(@RequestBody BaseRequest<String> request) {
        return openAiService.generateImageWithProxy(request);
    }

    @GetMapping("/listLatestChatAiResponse")
    public BaseResponse<List<ChatAiInfo>> listLatestChatAiResponses(@RequestParam Integer size) {
        return openAiService.listLatestChatAiResponsesWithProxy(size);
    }
}
