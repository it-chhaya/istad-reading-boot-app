package co.istad.bmsclient.book;

import java.util.List;

import lombok.Data;

@Data
public class BookRequest {
    
    private String title;
    private String description;
    private String author;
    private Long fileId;
    private String pdf;
    private List<Integer> genreIds;
    private Boolean isPublished;

}
