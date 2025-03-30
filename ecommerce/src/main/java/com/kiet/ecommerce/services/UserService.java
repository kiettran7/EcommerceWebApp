package com.kiet.ecommerce.services;

import com.kiet.ecommerce.POJOs.User;
import com.kiet.ecommerce.dto.request.UserCreationRequest;
import com.kiet.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createRequest(UserCreationRequest request) {
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }
 }
