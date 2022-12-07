package com.hospital.security.domain.entity;

import com.hospital.security.domain.dto.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;


    public static ResponseDto of(User user) {
        return new ResponseDto(user.getId(), user.getUsername());
    }
    public static ResponseDto of(User user, String message) {
        return new ResponseDto(user.getId(), user.getUsername(), message);
    }
}
