package com.f42o.app.service;

import com.f42o.app.model.RegisterRequest;
import com.f42o.app.model.User;
import com.f42o.app.model.auth.AuthResponse;

import java.util.Optional;

public interface IUserService {
    AuthResponse create(RegisterRequest request);

    Optional<User> getUserByEmail(String email);
}
