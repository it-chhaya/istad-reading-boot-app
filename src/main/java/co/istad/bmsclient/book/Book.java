package co.istad.bmsclient.book;

import java.util.List;

import co.istad.bmsclient.file.File;
import co.istad.bmsclient.genre.Genre;
import lombok.Data;

@Data
public class Book {

    private Long id;
    private String title;
    private String description;
    private String author;
    private Float starRating;
    private String datePublished;
    private File cover;
    private String pdf;
    private List<Genre> genres;

}
