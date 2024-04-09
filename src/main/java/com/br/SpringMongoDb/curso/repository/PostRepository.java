package com.br.SpringMongoDb.curso.repository;

import com.br.SpringMongoDb.curso.domain.Post;
import com.br.SpringMongoDb.curso.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findBytitleContainingIgnoreCase(String text);
}
