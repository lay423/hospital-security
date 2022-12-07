package com.hospital.security.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VisitRequestDto {
    private Integer hospitalId;
    private Long diseaseId;
    private Long userId;
    private int amount;
}
