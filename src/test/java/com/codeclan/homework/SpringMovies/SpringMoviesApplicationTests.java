package com.codeclan.homework.SpringMovies;

import com.codeclan.homework.SpringMovies.models.Film;
import com.codeclan.homework.SpringMovies.repositories.ActorRepository;
import com.codeclan.homework.SpringMovies.repositories.DirectorRepository;
import com.codeclan.homework.SpringMovies.repositories.FilmRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMoviesApplicationTests {
	
	@Autowired
	ActorRepository actorRepository;
	
	@Autowired
	DirectorRepository directorRepository;
	
	@Autowired
	FilmRepository filmRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindFilmsByDirectorId() {
		List<Film> found = filmRepository.findFilmsByDirectorId(1L);
	}
}
