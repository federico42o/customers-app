package com.f42o.app.controller;

import com.f42o.app.model.RegisterRequest;
import com.f42o.app.model.auth.AuthRequest;
import com.f42o.app.model.auth.AuthResponse;
import com.f42o.app.service.IAuthService;
import com.f42o.app.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class UserController {

    private final IAuthService authService;
    private final IUserService userService;


    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody RegisterRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(request));
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> registerUser(@RequestBody AuthRequest request){
        return ResponseEntity.status(HttpStatus.OK).body(authService.authenticate(request));
    }

}
