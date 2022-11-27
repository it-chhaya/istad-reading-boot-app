package co.istad.bmsclient.book;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.istad.bmsclient.model.ApiResponse;
import co.istad.bmsclient.utils.Pagination;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("books/tmpl")
@RequiredArgsConstructor
public class BookTmplController {

    private final BookServiceImpl bookServiceImpl;
    
    @GetMapping("/data")
    String renderBooks(@RequestParam("pageNum") Long pageNum, ModelMap modelMap) {
        
        ApiResponse<Pagination<Book>> response = bookServiceImpl.fetchBooks(pageNum);
        
        modelMap.addAttribute("data", response.getData());

        return "book/book-data";
    }

}
