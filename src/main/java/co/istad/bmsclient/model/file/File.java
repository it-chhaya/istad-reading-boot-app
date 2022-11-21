package co.istad.bmsclient.model.file;

import lombok.Data;

@Data
public class File {
    
    private Long id;
    private String uuid;
    private String name;
    private String uri;
    private String extension;
    private Long size;

}
