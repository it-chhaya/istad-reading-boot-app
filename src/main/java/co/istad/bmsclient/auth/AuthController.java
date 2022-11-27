package co.istad.bmsclient.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    
    @GetMapping("/login")
    String requestLoginView(){
        return "auth/login";
    }

}
