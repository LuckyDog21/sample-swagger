package com.sample.swagger;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    private List<Message> messages;

    public MessageController() {
        this.messages = List.of(new Message(new Date(), "some message"), new Message(new Date(), "second message"));
    }

    @GetMapping("/")
    @ApiOperation(value = "get all messages", notes = "follow this link to receive all messages", response = List.class)
    public List<Message> list() {
        return messages;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "get some message by id", notes = "you can get some message by id", response = Message.class)
    public Message one(@ApiParam(value = "ID value for message that you need", required = true) @PathVariable("id") String id) {
        return new Message(new Date(), "message with id: " + id);

    }
}
