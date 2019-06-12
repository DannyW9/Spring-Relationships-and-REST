package com.codeclan.homework.SpringMovies.components;

import com.codeclan.homework.SpringMovies.models.Actor;
import com.codeclan.homework.SpringMovies.models.Director;
import com.codeclan.homework.SpringMovies.models.Film;
import com.codeclan.homework.SpringMovies.models.FilmGenre;
import com.codeclan.homework.SpringMovies.repositories.ActorRepository;
import com.codeclan.homework.SpringMovies.repositories.DirectorRepository;
import com.codeclan.homework.SpringMovies.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    DirectorRepository directorRepository;

    @Autowired
    FilmRepository filmRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Director kathryn = new Director("Kathryn Bigelow");
        directorRepository.save(kathryn);

        Director jan = new Director("Jan de Bont");
        directorRepository.save(jan);

        Film pointBreak = new Film("Point Break", FilmGenre.ACTION, kathryn);
        filmRepository.save(pointBreak);

        Film speed = new Film("Speed", FilmGenre.ACTION, jan);
        filmRepository.save(speed);

        Film zero = new Film("Zero Dark Thirty", FilmGenre.THRILLER, kathryn);
        filmRepository.save(zero);

        Actor keanu = new Actor("Keanu Reeves", 100);
        actorRepository.save(keanu);

        Actor chris = new Actor("Chris Pratt", 80);
        actorRepository.save(chris);

        zero.addActor(chris);
        filmRepository.save(zero);

        keanu.addFilm(pointBreak);
        keanu.addFilm(speed);
        actorRepository.save(keanu);



    }
}
