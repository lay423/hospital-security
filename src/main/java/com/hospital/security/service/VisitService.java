package com.hospital.security.service;

import com.hospital.security.domain.dto.VisitDto;
import com.hospital.security.domain.dto.VisitRequestDto;
import com.hospital.security.domain.entity.Disease;
import com.hospital.security.domain.entity.Hospital;
import com.hospital.security.domain.entity.User;
import com.hospital.security.domain.entity.Visit;
import com.hospital.security.repository.DiseaseRepository;
import com.hospital.security.repository.HospitalRepository;
import com.hospital.security.repository.UserRepository;
import com.hospital.security.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VisitService {

    private final VisitRepository visitRepository;
    private final DiseaseRepository diseaseRepository;
    private final HospitalRepository hospitalRepository;
    private final UserRepository userRepository;


    public List<VisitDto> getAll() {
        List<Visit> visits = visitRepository.findAll();
        List<VisitDto> visitDtos = visits.stream()
                .map(visit ->
                        Visit.toDto(visit)).collect(Collectors.toList());
        return visitDtos;
    }

    public VisitDto create(VisitRequestDto requestDto) {
        Optional<User> user = userRepository.findById(requestDto.getUserId());
        Optional<Hospital> hospital = hospitalRepository.findById(requestDto.getHospitalId());
        Optional<Disease> disease = diseaseRepository.findById(requestDto.getDiseaseId());
        Visit visit = Visit.builder()
                .user(user.get())
                .hospital(hospital.get())
                .disease(disease.get())
                .amount(requestDto.getAmount())
                .build();
        return Visit.toDto(visitRepository.save(visit));
    }
}
