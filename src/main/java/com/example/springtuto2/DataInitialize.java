package com.example.springtuto2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataInitialize {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Bean
    CommandLineRunner initDatabase(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                jdbcTemplate.execute("CREATE TABLE BaseLegale (Ref varchar(255), " +
                        "name varchar(255), " +
                        "desc varchar(255))");
                jdbcTemplate.execute("INSERT INTO BaseLegale (Ref,name,desc) VALUES ('102ZA2','Inès','test')");
                jdbcTemplate.execute("INSERT INTO BaseLegale (Ref,name,desc) VALUES ('451daz','Elodie','tesr')");

            }
        };
    }
}
