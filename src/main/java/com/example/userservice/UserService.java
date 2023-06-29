package com.example.userservice;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface UserService {
    @WebMethod
    boolean addUser(User user);
}