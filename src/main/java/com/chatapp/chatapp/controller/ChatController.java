package com.chatapp.chatapp.controller;

import com.chatapp.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {


    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        // This will broadcast the chat message to all subscribers of /topic/messages
        return chatMessage;
    }

    // This method maps the /chat URL to the chat page
    @GetMapping()
    public String chat() {
        return "chat"; // This corresponds to the chat.html view
    }
}
