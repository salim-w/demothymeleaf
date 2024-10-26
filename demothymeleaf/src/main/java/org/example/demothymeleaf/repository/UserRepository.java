package org.example.demothymeleaf.repository;

import org.example.demothymeleaf.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UserRepository extends CrudRepository<User, Long> {

    }

