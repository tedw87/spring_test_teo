package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student marian = new Student(
                    "Marian",
                    "marian@yahoo.com",
                    LocalDate.of(2000, Month.APRIL, 5)
            );
            Student ionel = new Student(
                    "Ionel",
                    "ionel@yahoo.com",
                    LocalDate.of(1956, Month.AUGUST, 11)
            );
            repository.saveAll(
                    List.of(marian,ionel)
            );
        };
    }
}
