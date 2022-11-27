package co.istad.bmsclient.book;

import co.istad.bmsclient.model.ApiResponse;
import co.istad.bmsclient.utils.Pagination;

public interface BookService {
    
    ApiResponse<Pagination<Book>> fetchBooks(Long pageNum);

}
