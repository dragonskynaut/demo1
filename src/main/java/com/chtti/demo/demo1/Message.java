package com.chtti.demo.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Message {
    private int id;
    private String detail;
    @Value("WARNING!!")
    private String alert;
    @Value("10")
    private int retry;

    public Message(){}

    public int getRetry() {
        return retry;
    }

    public void setRetry(int retry) {
        this.retry = retry;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public Message(int id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
