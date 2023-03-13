package com.board.workBoard.global.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DatabaseConfig {

    @Profile("local")
    @Bean(name = "DataSource")
    public DataSource dataSource() {
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.driverClassName("org.mariadb.jdbc.Driver");
        builder.url("jdbc:mariadb://192.168.184.204:3306/findjob");
        builder.username("devfindjob");
        builder.password("Findjob@1234");
        return builder.build();
    }
}
