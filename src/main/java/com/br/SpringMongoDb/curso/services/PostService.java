package com.br.SpringMongoDb.curso.services;

import com.br.SpringMongoDb.curso.domain.Post;
import com.br.SpringMongoDb.curso.repository.PostRepository;
import com.br.SpringMongoDb.curso.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        // Usando findById() em vez de findOne()
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}
