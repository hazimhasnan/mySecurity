package github.hazimhasnan.myHelp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .anyRequest()
//                .permitAll();
                .authenticated();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // create userdetailamanager using spring provided inmemoryuserdetailsmanager
        UserDetailsManager userDetailsService = new InMemoryUserDetailsManager();

        // create a userDetail cuz userdetailservice needs it
        UserDetails user = User.withUsername("hazim")
                .password("12345")
                .authorities("read")
                .build();

        //use the method provided by userdetailmanager to create
        // a user
        userDetailsService.createUser(user);

        // return the userdetailservice
        return userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        // return spring provided password encoder
        return new BCryptPasswordEncoder();
//        return NoOpPasswordEncoder.getInstance();
    }



    //// The component way without extending websecurityconfigure
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
//        return http.build();
//    }

//    The DSL Lambda way
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .anyRequest()
//                                .authenticated())
//                .httpBasic();
//        return http.build();
//    }
}
