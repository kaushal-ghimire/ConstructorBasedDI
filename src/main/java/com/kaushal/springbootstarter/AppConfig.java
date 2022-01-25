package com.kaushal.springbootstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import student.Student;

@Configuration
public class AppConfig {

    @Bean(name = "student")
    public Student student(){
        return new Student();
    }
}
