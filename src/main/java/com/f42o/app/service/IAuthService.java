package com.f42o.app.service;

import com.f42o.app.model.auth.AuthRequest;
import com.f42o.app.model.auth.AuthResponse;

public interface IAuthService {
    AuthResponse authenticate(AuthRequest request);
}
