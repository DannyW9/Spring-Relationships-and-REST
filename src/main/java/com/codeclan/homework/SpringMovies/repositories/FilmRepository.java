package com.codeclan.homework.SpringMovies.repositories;

import com.codeclan.homework.SpringMovies.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

    List<Film> findFilmsByDirectorId(Long directorId);

}
