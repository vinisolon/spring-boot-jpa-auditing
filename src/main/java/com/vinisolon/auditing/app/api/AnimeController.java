package com.vinisolon.auditing.app.api;

import com.vinisolon.auditing.app.api.requests.AnimeRequest;
import com.vinisolon.auditing.app.api.response.AnimeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/animes")
public class AnimeController {

    @PostMapping
    public ResponseEntity<AnimeResponse> create(@RequestBody AnimeRequest request) {
        var mockResponse = AnimeResponse.builder()
                .id(1L)
                .title("Mock anime")
                .authorName("Mock author name")
                .description("Mock anime description")
                .releaseYear(1997)
                .seasons(27)
                .finished(Boolean.TRUE)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(mockResponse);
    }

}
