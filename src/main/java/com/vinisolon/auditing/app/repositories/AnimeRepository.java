package com.vinisolon.auditing.app.repositories;

import com.vinisolon.auditing.app.entities.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
