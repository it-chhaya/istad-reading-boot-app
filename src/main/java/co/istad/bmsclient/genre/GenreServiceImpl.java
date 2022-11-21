package co.istad.bmsclient.genre;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final WebClient webClient;

    @Override
    public List<Genre> fetchGenres() {
        return null;
    }

}
