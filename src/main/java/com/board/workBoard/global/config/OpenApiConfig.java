package com.board.workBoard.global.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Configuration
@Component
public class OpenApiConfig {

   /* @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Board API Docs")
                .version("v0.1")
                .description("Board API 명세서");
        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
*/
    @Bean
    public OpenAPI openAPI (
                    /*@Value("${demo.version}") String appVersion,
                            @Value("${demo.url}") String url,
                            @Value("${spring.profile.active}") String active*/
                    ) {
        Info info = new Info()
                .title("Demo API - local")
                .version("v0.1")
                .description("Spring Boot Web Application")
                .termsOfService("http://swagger.io./terms/")
                .contact(new Contact().name("Board").url("http://localhost:9090").email(""));

        List<Server> servers = Arrays.asList(new Server().url("localhost:9090").description("demo (" + "local" + ")"));

        SecurityScheme securityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
                .in(SecurityScheme.In.HEADER).name("Authorization");
        SecurityRequirement securityRequirement = new SecurityRequirement().addList("bearerAuth");

        return new OpenAPI()
                .components(new Components().addSecuritySchemes("bearer", securityScheme))
                .security(Arrays.asList(securityRequirement))
                .info(info)
                .servers(servers);
    }
}
