package co.istad.bmsclient.genre;

import co.istad.bmsclient.utils.WebClientUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class GenreController {

    private final WebClientUtils webClientUtils;

    @GetMapping("/genre")
    String requestGenrePage(Model model) {

        // var response = webClientUtils.fetch("/genres");
        // var response = webClientUtils.fetchById("/genres", 1L);

        // model.addAttribute("data", response.getData());

        return "genre/page";
    }

}
