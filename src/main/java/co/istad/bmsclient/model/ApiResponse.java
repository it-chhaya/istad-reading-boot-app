package co.istad.bmsclient.model;

import lombok.Data;

@Data
public class ApiResponse<T> {
    
    private Boolean status;
    private Integer code;
    private String message;
    private T data;

}
