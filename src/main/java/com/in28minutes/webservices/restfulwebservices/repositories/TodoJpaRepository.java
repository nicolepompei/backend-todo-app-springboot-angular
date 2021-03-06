package com.in28minutes.webservices.restfulwebservices.repositories;

import com.in28minutes.webservices.restfulwebservices.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {

 List<Todo> findByUsername(String username);
}
