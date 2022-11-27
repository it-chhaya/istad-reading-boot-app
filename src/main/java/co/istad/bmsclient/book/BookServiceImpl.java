package co.istad.bmsclient.book;

import org.springframework.stereotype.Service;

import co.istad.bmsclient.model.ApiResponse;
import co.istad.bmsclient.utils.Pagination;
import co.istad.bmsclient.utils.WebClientUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {

    private final WebClientUtils webClientUtils;

    @Override
    public ApiResponse<Pagination<Book>> fetchBooks(Long pageNum) {

        ApiResponse<Pagination<Book>> response = webClientUtils.fetch(pageNum, "/books");

        log.info("Response = {}", response);

        return response;
    }
    
}
