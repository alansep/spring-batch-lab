package com.alansep.spring_batch_lab.model.repository;

import com.alansep.spring_batch_lab.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByFirstNameAndLastName(String firstName, String lastName);
}
