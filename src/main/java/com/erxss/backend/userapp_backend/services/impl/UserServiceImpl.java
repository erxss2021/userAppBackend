package com.erxss.backend.userapp_backend.services.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erxss.backend.userapp_backend.entities.User;
import com.erxss.backend.userapp_backend.repositories.UserRepository;
import com.erxss.backend.userapp_backend.services.UserService;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    //Inyección mediante constructor, y evitamos el @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {

        return (List)this.userRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<User> findById(Long id) {
        return  this.userRepository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        this.userRepository.deleteById(id);   
    }

}
