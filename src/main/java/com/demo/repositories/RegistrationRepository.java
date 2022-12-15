package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.entities.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

}
