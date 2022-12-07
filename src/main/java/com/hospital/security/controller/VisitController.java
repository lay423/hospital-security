package com.hospital.security.controller;

import com.hospital.security.domain.dto.VisitDto;
import com.hospital.security.service.VisitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/visits")
@RequiredArgsConstructor
@Slf4j
public class VisitController {
    private final VisitService visitService;

    @GetMapping()
    private ResponseEntity<List<VisitDto>> getAllVisits() {
        List<VisitDto> visitDtos = visitService.getAll();
        log.info("test:{}", visitDtos.get(1));
        return ResponseEntity.ok().body(visitDtos);
    }

}
