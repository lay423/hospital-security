package com.hospital.security.domain.entity;

import com.hospital.security.domain.dto.VisitDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Visit extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "disease_code")
    private Disease disease;

    private int amount;

    public static VisitDto toDto(Visit visit) {
        return VisitDto.builder()
                .id(visit.getId())
                .hospitalName(visit.hospital.getHospitalName())
                .userName(visit.user.getUsername())
                .diseaseName(visit.disease.getName())
                .build();
    }

}
