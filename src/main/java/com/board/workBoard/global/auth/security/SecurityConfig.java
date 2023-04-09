package com.board.workBoard.global.auth.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.List;


@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig {

    private static final String[] PERMIT_LIST = {
            /* swagger v2 */
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**",
            /* swagger v3 */
            "/v3/api-docs/**",
            "/api-docs/**",
            "/swagger-ui/**",
            "/swagger-ui.html",
            /* resources & vue */
            "/static/**",
            "/js/**",
            "/css/**",
            "/favicon.ico",
            /* login api */
            "/api/register",
            "/api/login",
            "/login",
    };

    private final JwtProvider jwtProvider;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // 권한 문제 발생 시 아래 핸들러 호출
        http
                .httpBasic().disable() // id, password 문자열을 Base64로 인코딩 후 전달
                .csrf().disable() // 쿠키가 아닌 JWT 기반이므로 disable
                .cors(c -> {
                    CorsConfigurationSource source = request -> { // cors 허용 패턴
                        CorsConfiguration config = new CorsConfiguration();
                        config.setAllowedOrigins(
                                List.of("*")
                        );
                        config.setAllowedMethods(
                                List.of("*")
                        );
                        return config;
                    };
                    c.configurationSource(source);
                })
                // 세션을 생성 및 사용하지 않음
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                // 조건별 요청 허용/제한 설정
                .authorizeRequests()
                .antMatchers(PERMIT_LIST).permitAll() // 권한이 없어도 접근 가능 목록
                .antMatchers("/api/**").hasAnyRole("USER", "ADMIN")
                .antMatchers("/api/admin/**").hasAnyRole( "ADMIN")
                .anyRequest().denyAll() // 위 권한을 제외한 모든 사용자의 접근을 거부
                .and()
                .addFilterBefore(new JwtAuthenticationFilter(jwtProvider), UsernamePasswordAuthenticationFilter.class)
                .exceptionHandling() // 에러 핸들링
                .accessDeniedHandler((request, response, accessDeniedException) -> {
                    response.setStatus(403);
                    response.setCharacterEncoding("utf-8");
                    response.setContentType("text/html; charset=UTF-8");

                    String redirectUrl = request.getHeader("x-forwarded-proto") + "://"+ request.getHeader("x-forwarded-host") + "/logout";
                    // 요청
                    response.getWriter().write("접근 권한이 없습니다.");

                })
                .authenticationEntryPoint((request, response, authException) -> {
                    response.setStatus(401);
                    response.setCharacterEncoding("utf-8");
                    response.setContentType("text/html; charset=UTF-8");

                    // 리다이렉트될 url
                    String redirectUrl = request.getHeader("x-forwarded-proto") + "://"+ request.getHeader("x-forwarded-host") + "/logout";
                    if (request.getRequestURI().equals("/api/login")) { // 계정 정보가 다를 시
                        response.setHeader("errortype", "account");
                        response.getWriter().write(authException.getMessage());
                    }
                    else { // 토큰이 존재하지 않거나 만료되었을 시
                        response.setHeader("errortype", "authority");
                        response.getWriter().write("인증이 만료됐거나 유효하지 않습니다.");
                    }
//                    response.sendRedirect(redirectUrl);
                });

        return http.build();
    }

    @Bean
    public PasswordEncoder encoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    public void confiure(WebSecurity web){
        web.ignoring()
                .antMatchers(PERMIT_LIST);
    }

    /*public void addInterceptor(InterceptorRegistry registry){
        registry.addInterceptor()
                .excludePathPatterns("/swagger/**")
                .excludePathPatterns("/swagger-ui.html")
                .excludePathPatterns("/v2/api-docs");
    }*/




}
