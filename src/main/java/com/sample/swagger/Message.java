package com.sample.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;


@ApiModel(description = "some Message modes")
public class Message {
    public Message(Date date, String body) {
        this.date = date;
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public String getBody() {
        return body;
    }

    @ApiModelProperty(notes = "The created date")
    private Date date;
    @ApiModelProperty(notes = "The message's body")
    private String body;
}
