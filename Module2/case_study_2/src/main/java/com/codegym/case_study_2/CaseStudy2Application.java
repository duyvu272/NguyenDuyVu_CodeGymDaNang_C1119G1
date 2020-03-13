package com.codegym.case_study_2;

import com.codegym.case_study_2.formatter.LocalDateFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class CaseStudy2Application{

    public static void main(String[] args) {
        SpringApplication.run(CaseStudy2Application.class, args);
    }

//    @Configuration
//    static class  MyConfig implements WebMvcConfigurer {
//        @Override
//        public void addFormatters(FormatterRegistry registry) {
//            registry.addFormatter(new LocalDateFormatter());
//        }
//    }


}
