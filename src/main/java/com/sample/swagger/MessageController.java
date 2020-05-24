package com.sample.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MessageController {
    private List<Message> messages;

    public MessageController() {
        this.messages = List.of(new Message(new Date(), "some message"), new Message(new Date(), "second message"));
    }

    @GetMapping("/")
    public List<Message> list() {
        return messages;
    }
}
