package com.hospital.security.controller;

import com.hospital.security.domain.dto.VisitDto;
import com.hospital.security.domain.dto.VisitRequestDto;
import com.hospital.security.service.VisitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping()
    private ResponseEntity<VisitDto> createVisit(@RequestBody VisitRequestDto requestDto){
        return ResponseEntity.ok().body(visitService.create(requestDto));
    }

    @GetMapping("/users/{id}")
    private ResponseEntity<List<VisitDto>> getVisitsByUserId(@PathVariable Integer id) {
        log.info("hisdfsdf");
        log.info("id:{}", id);
        return ResponseEntity.ok().body(visitService.findByUserId(id.longValue()));
    }

    @GetMapping("/hospitals/{id}")
    private ResponseEntity<List<VisitDto>> getVisitsByHospitalId(@PathVariable Integer id) {
        return ResponseEntity.ok().body(visitService.findByHospitalId(id));
    }

}
