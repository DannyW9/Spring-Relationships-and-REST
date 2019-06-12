package com.codeclan.homework.SpringMovies.repositories;

import com.codeclan.homework.SpringMovies.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
