package org.example.movieappfullstack20240517;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    private MovieRepo movieRepo;



    public List<Movie> allMovies() {
        return movieRepo.findAll();
    }
}
