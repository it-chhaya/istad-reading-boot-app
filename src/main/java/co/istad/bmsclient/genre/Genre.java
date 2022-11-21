package co.istad.bmsclient.genre;

import co.istad.bmsclient.model.file.File;
import lombok.Data;

@Data
public class Genre {
    
    private Integer id;
    private String title;
    private String description;
    private File icon;
    
}
