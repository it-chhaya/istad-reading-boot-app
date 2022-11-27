package co.istad.bmsclient.user;

import java.util.List;

import co.istad.bmsclient.file.File;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    
    private Long id;
    private String username;
    private String email;
    private String password;
    private String familyName;
    private String givenName;
    private String phoneNumber;
    private File profile;
    private String biography;
    private Boolean isEnabled;
    private String verificationCode;

    private List<Role> roles;
    
}
