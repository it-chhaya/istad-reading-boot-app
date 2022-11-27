package co.istad.bmsclient.auth;

import java.util.List;

import co.istad.bmsclient.user.Role;
import co.istad.bmsclient.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LoginResponse {

    private User user;
    private List<Role> roles;
    private String authHeader;
    
}
