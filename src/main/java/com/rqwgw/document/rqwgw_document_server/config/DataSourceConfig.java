package com.rqwgw.document.rqwgw_document_server.config;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new HikariDataSource(); // HikariCP가 Spring Boot에서 기본 Connection Pool임
    }
}
