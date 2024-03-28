package com.br.SpringMongoDb.curso.dto;

import com.br.SpringMongoDb.curso.domain.User;
import org.springframework.data.annotation.Id;

import java.io.Serial;
import java.io.Serializable;

public class UserDTO implements Serializable {
    @Serial
    private static final  long serialVersionUID = 1l;

    @Id
    private String id;
    private String name;
    private String email;


    public UserDTO() {}
    public UserDTO(User obj ) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
