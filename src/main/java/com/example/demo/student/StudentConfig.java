package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            System.out.print("Test");
//            Student ersa = new Student(
//                    "ersa",
//                    23,
//                    LocalDate.of(1997, NOVEMBER,13),
//                    "ersa1997@gmail.com"
//            );
//            Student adinda = new Student(
//                    "adinda",
//                    18,
//                    LocalDate.of(2003, JUNE,6),
//                    "adindahaasa2003@gmail.com"
//            );

//            repository.saveAll(List.of(ersa,adinda));
        };
    }
}
