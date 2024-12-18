package contoller;

import model.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/films")
public class FilmController {

    Map<Integer, Film> films = new HashMap<>();
    @GetMapping
    public Collection<Film> listFilms(){
        return films.values();
    }
}
