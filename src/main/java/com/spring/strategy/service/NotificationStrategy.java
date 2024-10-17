package com.spring.strategy.service;

public interface NotificationStrategy {


    void SendNotification(String destination, String message);
}
