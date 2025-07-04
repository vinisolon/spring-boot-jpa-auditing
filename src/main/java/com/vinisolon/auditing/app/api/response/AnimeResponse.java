package com.vinisolon.auditing.app.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnimeResponse {
    private Long id;
    private String title;
    private String authorName;
    private String description;
    private Integer releaseYear;
    private Boolean finished;
    private Integer seasons;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
