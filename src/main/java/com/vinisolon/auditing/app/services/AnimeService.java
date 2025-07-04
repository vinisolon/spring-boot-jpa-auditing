package com.vinisolon.auditing.app.services;

import com.vinisolon.auditing.app.api.requests.AnimeRequest;
import com.vinisolon.auditing.app.api.responses.AnimeResponse;
import com.vinisolon.auditing.app.repositories.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository repository;

    @Transactional
    public AnimeResponse create(AnimeRequest request) {
        return new AnimeResponse();
    }

}
