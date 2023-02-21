package com.f42o.app.service;

import com.f42o.app.model.RegisterRequest;
import com.f42o.app.model.Role;
import com.f42o.app.model.User;
import com.f42o.app.model.auth.AuthResponse;
import com.f42o.app.repository.IUserDao;
import com.f42o.app.utils.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{

    private final IUserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtService;

    @Override
    public AuthResponse create(RegisterRequest request) {
        User user = User.builder()
                .firstName(request.getFirstName())
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        userDao.save(user);
        var token = jwtService.generateToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();
    }

    @Override
    public Optional<User> getUserByEmail(String email) {

        return userDao.findByEmail(email);
    }


}
