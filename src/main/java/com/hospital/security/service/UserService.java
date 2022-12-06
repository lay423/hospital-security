package com.hospital.security.service;

import com.hospital.security.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Value("${jwt.token.secret}")
    private String secretKey;

    private final Long expiredTimeMs = 1000 * 60 * 60l;
    public String login(String userName, String password) {
        return JwtTokenUtil.createToken("jun", secretKey, expiredTimeMs);
    }
}
