package co.istad.bmsclient.config.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.istad.bmsclient.user.User;
import co.istad.bmsclient.utils.WebClientUtils;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final WebClientUtils webClientUtils;

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {

        User user = webClientUtils.getUserForAuthentication(usernameOrEmail).getData();

        CustomUserSecurity customUserSecurity = new CustomUserSecurity();
        customUserSecurity.setUser(user);

        return customUserSecurity;
    }
    
}
