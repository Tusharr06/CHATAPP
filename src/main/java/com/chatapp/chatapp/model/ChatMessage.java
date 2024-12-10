package com.chatapp.chatapp.model;

public class ChatMessage {
    private String sender;
    private String message;

    // Default constructor
    public ChatMessage() {}

    // Constructor to initialize values
    public ChatMessage(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    // Getters and setters
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
