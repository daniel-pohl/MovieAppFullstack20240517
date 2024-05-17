package org.example.movieappfullstack20240517;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.allMovies();
    }
    @GetMapping("/{imdbId}")
    public Optional<Movie> getMovieById(@PathVariable String imdbId) {
        return movieService.findMovieById(imdbId);
    }
}
