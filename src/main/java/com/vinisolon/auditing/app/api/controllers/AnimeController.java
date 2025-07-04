package com.vinisolon.auditing.app.api.controllers;

import com.vinisolon.auditing.app.api.requests.AnimeRequest;
import com.vinisolon.auditing.app.api.responses.AnimeResponse;
import com.vinisolon.auditing.app.services.AnimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/animes")
public class AnimeController {

    private final AnimeService service;

    @PostMapping
    public ResponseEntity<AnimeResponse> create(@RequestBody AnimeRequest request) {
        log.info("request body {}", request);
        var response = service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
