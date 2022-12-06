package com.hospital.security.controller;

import com.hospital.security.domain.dto.UserLoginRequest;
import com.hospital.security.domain.dto.UserRoginResponse;
import com.hospital.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok().body(userService.login("", ""));
    }
}
