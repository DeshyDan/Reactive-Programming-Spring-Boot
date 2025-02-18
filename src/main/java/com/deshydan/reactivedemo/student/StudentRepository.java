package com.deshydan.reactivedemo.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

}
