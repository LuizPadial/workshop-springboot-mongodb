package com.br.SpringMongoDb.curso.resources;

import com.br.SpringMongoDb.curso.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1", "Maria Silva", "Maria@gmail.com");
        User joao = new User("1", "joao jr", "jj@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, joao));
        return ResponseEntity.ok().body(list);
    }



}
