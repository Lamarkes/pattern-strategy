package com.spring.strategy.service.strategy;

import com.spring.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(EmailNotificationStrategy.class);

    @Override
    public void SendNotification(String destination, String message) {
        logger.info("Notificacao [{}] enviada para o email [{}]", message, destination);
    }
}
