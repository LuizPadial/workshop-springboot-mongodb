package com.br.SpringMongoDb.curso.services;

import com.br.SpringMongoDb.curso.domain.User;
import com.br.SpringMongoDb.curso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();
    }

}
