package com.example.lesson372;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {

    @Value("${custom.datasource.url}")
    private String dsUrl;

    @Value("${custom.datasource.username}")
    private String dsUsername;

    @Value("${custom.datasource.password}")
    private String dsPassword;

    @Bean
    public DataSource dataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(dsUrl);
        dataSource.setUsername(dsUsername);
        dataSource.setPassword(dsPassword);
        dataSource.setConnectionTimeout(1000);

        return dataSource;
    }

}
