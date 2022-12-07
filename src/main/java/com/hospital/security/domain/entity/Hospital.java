package com.hospital.security.domain.entity;

import com.hospital.security.domain.dto.HospitalResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "nation_wide_hospitals")
public class Hospital {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "road_name_address")
    private String roadNameAddress;

    @Column(name = "hospital_name")
    private String hospitalName;

//    public static HospitalResponse of(Hospital hospital) {
//        return new HospitalResponse(hospital.getId(), hospital.getRoadNameAddress(), hospital.getHospitalName()
//                , hospital.getPatientRoomCount(), hospital.getTotalNumberOfBeds(), hospital.getBusinessTypeName(), hospital.getTotalAreaSize());
//    }
}
