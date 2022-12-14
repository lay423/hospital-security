package com.hospital.security.domain.dto;

import com.hospital.security.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RequestDto {
    private String username;
    private String password;

    public User toEntity(){
        User user = User.builder()
                .username(this.username)
                .password(this.password)
                .build();
        return user;
    }
}
