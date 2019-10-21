package com.hqj.springboot;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MyConfiguration {
    /*
    @Bean
    DataSource getDataSource(){
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/hqj_db?useUnicode=true&amp;characterEncoding=utf-8")
                .username("root")
                .password("123")
                .driverClassName("com.mysql.jdbc.Driver")
                .build();
    }
    */
}
