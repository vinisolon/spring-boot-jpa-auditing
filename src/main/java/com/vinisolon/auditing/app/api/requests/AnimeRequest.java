package com.vinisolon.auditing.app.api.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnimeRequest {
    @NotBlank(message = "Title cannot be blank or null")
    private String title;
    @NotBlank(message = "Author name cannot be blank or null")
    private String authorName;
    @NotBlank(message = "Description cannot be blank or null")
    private String description;
    @NotNull(message = "Release year cannot be null")
    private Integer releaseYear;
    @NotNull(message = "Finished flag cannot be null")
    private Boolean finished;
    @NotNull(message = "seasons cannot be null")
    private Integer seasons;
}
