package com.br.SpringMongoDb.curso.config;

import com.br.SpringMongoDb.curso.domain.Post;
import com.br.SpringMongoDb.curso.domain.User;
import com.br.SpringMongoDb.curso.dto.AuthorDTO;
import com.br.SpringMongoDb.curso.dto.ComentDTO;
import com.br.SpringMongoDb.curso.repository.PostRepository;
import com.br.SpringMongoDb.curso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instatiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat(("dd/MM/yyyy"));
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viajem", "Vou viajar para Santos", new AuthorDTO(maria));

        ComentDTO c1 = new ComentDTO("Boa viagem mano", sdf.parse("21/03/2018"), new AuthorDTO(alex));

        post1.getComents().addAll(Arrays.asList(c1));

        postRepository.saveAll(Arrays.asList(post1));

        maria.getPosts().addAll(Arrays.asList(post1));
        userRepository.save(maria);
    }
}
