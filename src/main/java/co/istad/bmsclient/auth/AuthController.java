package co.istad.bmsclient.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;

import co.istad.bmsclient.model.ApiResponse;
import co.istad.bmsclient.user.User;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final AuthServiceImpl authServiceImpl;
    
    @GetMapping("/login")
    String requestLoginView(){
        return "auth/login";
    }

}
