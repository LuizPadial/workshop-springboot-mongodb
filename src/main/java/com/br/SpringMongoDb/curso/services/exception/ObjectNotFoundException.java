package com.br.SpringMongoDb.curso.services.exception;

import java.io.Serial;

public class ObjectNotFoundException  extends RuntimeException{
    @Serial
    private static final  long serialVersionUID = 1l;

    public ObjectNotFoundException(String msg){
        super(msg);
    }


}
