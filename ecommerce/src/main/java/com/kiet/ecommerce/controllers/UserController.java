package com.kiet.ecommerce.controllers;

import com.kiet.ecommerce.POJOs.User;
import com.kiet.ecommerce.dto.request.UserCreationRequest;
import com.kiet.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createRequest(request);
    }
}
