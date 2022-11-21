package co.istad.bmsclient.utils;

import co.istad.bmsclient.model.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class WebClientUtils {

    private final WebClient webClient;

    public <T> ApiResponse<T> fetch(String endPoint) {
        return webClient.get()
                .uri(endPoint)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<ApiResponse<T>>() {
                }).block();
    }

}
