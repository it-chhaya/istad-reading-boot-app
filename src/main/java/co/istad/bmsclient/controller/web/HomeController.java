package co.istad.bmsclient.controller.web;

import java.util.Arrays;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.istad.bmsclient.model.ApiResponse;
import co.istad.bmsclient.model.Paging;
import co.istad.bmsclient.model.book.Book;
import co.istad.bmsclient.model.book.BookRequest;
import co.istad.bmsclient.model.file.File;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final WebClient webClient;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String doUploadFile(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
        
        /*MultipartBodyBuilder filePart = new MultipartBodyBuilder();
        filePart.part("file", file.getResource());

        ApiResponse<File> response = webClient.post()
            .uri("files")
            .contentType(MediaType.MULTIPART_FORM_DATA)
            .body(BodyInserters.fromMultipartData(filePart.build()))
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<File>>() {
                
            }).block();

        modelMap.addAttribute("fileUri", response.getData().getUri());*/

        return "upload";
    }

    @GetMapping("/upload")
    String requestUploadView() {
        return "upload";
    }
    
    @GetMapping("/")
    String requestHomeView(ModelMap modelMap) throws JsonMappingException, JsonProcessingException {

        /* BookRequest bookRequest = new BookRequest();
        bookRequest.setTitle("Hello");
        bookRequest.setDescription("Hello");
        bookRequest.setAuthor("Hello");
        bookRequest.setFileId(32L);
        bookRequest.setPdf("Hello");
        bookRequest.setIsPublished(true);
        bookRequest.setGenreIds(Arrays.asList(1,2));

        String jsonStr = "";

        ObjectMapper om = new ObjectMapper();
        jsonStr = om.writeValueAsString(bookRequest);

        ApiResponse<Book> saveBookResp = webClient.post()
            .uri("books")
            .contentType(MediaType.APPLICATION_JSON)
            .body(BodyInserters.fromValue(jsonStr))
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<Book>>() {
                
            })
            .block();

        System.out.println(saveBookResp.getMessage()); */

        /*ApiResponse<Paging<Book>> response = webClient.get()
            .uri(builder 
                -> builder.path("books")
                    .queryParam("pageNum", 1)
                    .queryParam("pageSize", 1)
                    .build())
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<Paging<Book>>>() {})
            .block();

        modelMap.addAttribute("response", response);*/

        return "home/index";
    }

}
