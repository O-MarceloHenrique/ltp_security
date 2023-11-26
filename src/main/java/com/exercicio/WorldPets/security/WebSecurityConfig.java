package com.exercicio.WorldPets.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.exercicio.WorldPets.security.service.MeuUsuarioDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable()
            //.requiresChannel(channel -> channel.anyRequest().requiresSecure())
            .httpBasic(Customizer.withDefaults())
            .authorizeHttpRequests(
                authorize -> authorize.requestMatchers(HttpMethod.POST, "/criar").permitAll()) 
            .authorizeHttpRequests(
                authorize -> authorize.requestMatchers(HttpMethod.POST, "/animal").authenticated()
                                    .requestMatchers(HttpMethod.GET, "/animal").authenticated()
                                    .requestMatchers(HttpMethod.GET, "/animal/{id}").authenticated()
                                    .requestMatchers(HttpMethod.DELETE, "/animal/{id}").authenticated()

                                    .requestMatchers(HttpMethod.POST, "/cadastro").authenticated()
                                    .requestMatchers(HttpMethod.GET, "/cadastro").authenticated()
                                    .requestMatchers(HttpMethod.DELETE, "/cadastro/{id}").authenticated()

                                    .requestMatchers(HttpMethod.POST, "/resgate").authenticated()
                                    .requestMatchers(HttpMethod.GET, "/resgate").authenticated()
                                    .requestMatchers(HttpMethod.DELETE, "/resgate/{id}").authenticated()
                                    );

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        //  UserDetails user = User.withDefaultPasswordEncoder()
        //      .username("worldpets")
        //      .password("worldpets")
        //      .build();

        //  return new InMemoryUserDetailsManager(user);
         return new MeuUsuarioDetailsService();
     }

     @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
