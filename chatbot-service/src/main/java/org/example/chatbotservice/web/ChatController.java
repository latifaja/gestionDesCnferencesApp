package org.example.chatbotservice.web;

import org.example.chatbotservice.agents.AIAgent;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.awt.*;

@RestController

public class ChatController {

    private final AIAgent aiAgent;

    public ChatController(AIAgent aiAgent) {
        this.aiAgent = aiAgent;
    }




    @GetMapping(value = "/chat",produces = MediaType.TEXT_PLAIN_VALUE)
    public Flux<String> chat(@RequestParam String query) {
        return aiAgent.AskAgent(query);
    }
}
