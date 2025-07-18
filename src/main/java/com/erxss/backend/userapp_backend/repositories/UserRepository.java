package com.erxss.backend.userapp_backend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.erxss.backend.userapp_backend.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    Page<User> findAll(Pageable pageable);
}
