package com.br.SpringMongoDb.curso.services;

import com.br.SpringMongoDb.curso.domain.User;
import com.br.SpringMongoDb.curso.dto.UserDTO;
import com.br.SpringMongoDb.curso.repository.UserRepository;
import com.br.SpringMongoDb.curso.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
