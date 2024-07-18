package com.deshydan.reactivedemo;

import com.deshydan.reactivedemo.student.Student;
import com.deshydan.reactivedemo.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveProgrammingSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveProgrammingSpringBootApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(
//            StudentService service
//    ) {
//        return args -> {
//            for (int i = 0; i < 100; i++) {
//                service.save(Student.builder()
//                        .firstname("John " + i)
//                        .lastname("Smith " + i)
//                        .age(i)
//                        .build()).
//                        subscribe();
//            }
//        };
//    }

}
