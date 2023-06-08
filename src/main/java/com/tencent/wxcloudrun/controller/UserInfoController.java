package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.service.OpenAiService;
import com.tencent.wxcloudrun.service.request.BaseRequest;
import com.tencent.wxcloudrun.service.request.UserInfo;
import com.tencent.wxcloudrun.service.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/operate")
public class UserInfoController {

    @Autowired
    private OpenAiService openAiService;


    @PostMapping("/login")
    public BaseResponse<UserInfo> auth(@RequestBody BaseRequest<UserInfo> request) {
        return openAiService.loginWithProxy(request);
    }
}
