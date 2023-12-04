package com.pluralsight.demologin1.service;

import com.pluralsight.demologin1.controller.dto.UserRegistrationDto;
import com.pluralsight.demologin1.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
