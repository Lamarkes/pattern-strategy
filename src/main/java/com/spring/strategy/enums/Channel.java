package com.spring.strategy.enums;

public enum Channel {

    DISCORD("discord"),
    INSTAGRAM("instagram"),
    TWITTER("twitter"),
    EMAIL("email"),
    WHATSAPP("whatsapp");

    private String value;

    Channel(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
