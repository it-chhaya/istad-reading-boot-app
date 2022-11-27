package co.istad.bmsclient.utils;

import co.istad.bmsclient.auth.LoginDto;
import co.istad.bmsclient.auth.LoginResponse;
import co.istad.bmsclient.model.ApiResponse;
import co.istad.bmsclient.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@RequiredArgsConstructor
public class WebClientUtils {

    private final WebClient webClient;

    public <T> ApiResponse<Pagination<T>> fetch(Long pageNum, String endPoint) {
        return webClient.get()
                .uri(builder 
                    -> builder.path(endPoint)
                    .queryParam("pageNum", pageNum)
                    .queryParam("pageSize", 5)
                    .build())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<ApiResponse<Pagination<T>>>() {
                }).block();
    }

    public <T> ApiResponse<T> fetchById(String endPoint, Long id) {
        return webClient.get()
            .uri(endPoint + "/" + id)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<T>>() {
            }).block();
    }


    public ApiResponse<User> getUserForAuthentication(String usernameOrEmail) {
        return webClient.get()
            .uri(builder 
                -> builder.path("/users/find-by-usernameOrEmail")
            .queryParam("usernameOrEmail", usernameOrEmail)
            .build())
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<ApiResponse<User>>() {
            }).block();
    }

}
