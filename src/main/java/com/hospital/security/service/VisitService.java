package com.hospital.security.service;

import com.hospital.security.domain.dto.VisitDto;
import com.hospital.security.domain.entity.Visit;
import com.hospital.security.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VisitService {

    private final VisitRepository visitRepository;
    public List<VisitDto> getAll() {
        List<Visit> visits = visitRepository.findAll();
        List<VisitDto> visitDtos = visits.stream()
                .map(visit ->
                        Visit.toDto(visit)).collect(Collectors.toList());
        return visitDtos;
    }
}
