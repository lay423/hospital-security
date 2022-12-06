package com.hospital.security.controller;

import com.hospital.security.domain.dto.ReviewCreateRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @PostMapping String write(@RequestBody ReviewCreateRequest dto, Neo4jProperties.Authentication authentication) {
        return "리뷰 등록에 성공했습니다.";
    }
}
