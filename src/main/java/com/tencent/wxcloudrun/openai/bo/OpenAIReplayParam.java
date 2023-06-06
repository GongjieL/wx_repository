package com.tencent.wxcloudrun.openai.bo;

import java.util.List;

public class OpenAIReplayParam {
    private String model;

    private List<OpenAIReplayMessage> messages;
    private Double temperature;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<OpenAIReplayMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<OpenAIReplayMessage> messages) {
        this.messages = messages;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
