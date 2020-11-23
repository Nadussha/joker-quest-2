package com.infobip.jokerquest2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class KeyProvider {
    private final String encryptedChatKey;

    public KeyProvider(@Value("${joker-quiz.chat-key}") String chatKey) {
        this.encryptedChatKey = chatKey;
    }

    public String getChatKey() {
        return encryptedChatKey;
    }
}
