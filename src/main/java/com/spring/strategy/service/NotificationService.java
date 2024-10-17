package com.spring.strategy.service;


import com.spring.strategy.enums.Channel;
import com.spring.strategy.service.strategy.*;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class NotificationService {


    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
            Channel.DISCORD.getValue(), new DiscordNotificationStrategy(),
            Channel.EMAIL.getValue(), new EmailNotificationStrategy(),
            Channel.INSTAGRAM.getValue(), new InstagramNotificationStrategy(),
            Channel.TWITTER.getValue(), new TwitterNotificationStrategy(),
            Channel.WHATSAPP.getValue(), new WhatsappNotificationStrategy()
    );

    public void notify(String channel, String destination, String message){
       if (mapStrategy.get(channel) == null) throw new RuntimeException("Este canal nao existe!");

       mapStrategy.get(channel).SendNotification(destination,message);

    }
}
