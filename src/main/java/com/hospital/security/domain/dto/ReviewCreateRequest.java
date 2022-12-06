package com.hospital.security.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReviewCreateRequest {
    private long hospitalId;
    private String title;
    private String content;
    private String patientName;
}
