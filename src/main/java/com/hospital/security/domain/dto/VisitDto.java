package com.hospital.security.domain.dto;

import com.hospital.security.domain.entity.Disease;
import com.hospital.security.domain.entity.Hospital;
import com.hospital.security.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VisitDto {
    private Long id;
    private String hospitalName;
    private String userName;
    private String diseaseName;
    private int amount;
}
