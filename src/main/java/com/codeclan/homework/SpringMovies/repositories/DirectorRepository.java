package com.codeclan.homework.SpringMovies.repositories;

import com.codeclan.homework.SpringMovies.models.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {
}
