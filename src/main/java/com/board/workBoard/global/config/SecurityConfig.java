package com.board.workBoard.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.DispatcherType;

import static org.springframework.security.config.Customizer.withDefaults;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable()
                .authorizeRequests(request -> request
                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                        .anyRequest().authenticated() // 모든 요청은 인증 필요
                )
                .formLogin(login -> login // form 방식 로그인 사용
                        .defaultSuccessUrl("/",true) // 로그인 성공 시 main 이동
                        .permitAll() // main은 모든 권한 허용
                )
                .logout(withDefaults()); // 기본 로그아웃 => /logout

        return http.build();
    }
}
