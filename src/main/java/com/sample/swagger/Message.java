package com.sample.swagger;

import java.util.Date;

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

    private Date date;
    private String body;
}
