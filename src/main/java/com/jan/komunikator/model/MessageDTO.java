package com.jan.komunikator.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Data
public class MessageDTO {
    private String message;
    private String messageDateTime;
    private String userName;

//    public MessageDTO(String message, LocalDateTime messageDateTime, String userName) {
//        this.message = message;
//        setMessageDateTime(messageDateTime);
//        this.userName = userName;
//    }

    public MessageDTO(String message, String messageDateTime, String userName) {
        this.message = message;
        this.messageDateTime = messageDateTime;
        this.userName = userName;
    }

    public MessageDTO(){}

    public LocalDateTime getMessageDateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(this.messageDateTime, formatter);
    }

    @JsonGetter("messageDateTime")
    public String getMessageDateTimeString(){
        return this.messageDateTime;
    }

    @JsonSetter("messageDateTime")
    public void setMessageDateTime(String messageDateTime){
        this.messageDateTime = messageDateTime;
    }

    public void setMessageDateTime(LocalDateTime messageDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.messageDateTime = messageDateTime.format(formatter);
    }
}
