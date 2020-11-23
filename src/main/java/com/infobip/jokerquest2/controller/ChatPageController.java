package com.infobip.jokerquest2.controller;

import com.infobip.jokerquest2.service.KeyProvider;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ChatPageController {
    private final KeyProvider keyProvider;

    public ChatPageController(@NonNull KeyProvider keyProvider) {
        this.keyProvider = keyProvider;
    }

    @GetMapping
    public ModelAndView displayChatPage(Map<String, Object> model) {
        model.put("chatKey", keyProvider.getChatKey());
        return new ModelAndView("index", model);
    }
}
