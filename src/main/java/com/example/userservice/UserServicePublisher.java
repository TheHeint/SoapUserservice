package com.example.userservice;

import javax.xml.ws.Endpoint;

public class UserServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/userService", new UserServiceImpl());
        System.out.println("User service is published and running...");
    }
}