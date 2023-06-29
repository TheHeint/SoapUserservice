package com.example.userservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.userservice.UserService")
public class UserServiceImpl implements UserService {

    @Override
    public boolean addUser(User user) {
        // Here you should implement the logic to store the user object in a database or in a list.
        // For simplicity, the example below considers the addition successful every time.
        return true;
    }
}