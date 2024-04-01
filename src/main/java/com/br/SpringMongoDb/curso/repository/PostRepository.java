package com.br.SpringMongoDb.curso.repository;

import com.br.SpringMongoDb.curso.domain.Post;
import com.br.SpringMongoDb.curso.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {




}
