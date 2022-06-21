package com.example.springsematec.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Notfound extends Exception{
    // دو تا متد سازنده براش می سازیم
    public Notfound(String message){super(message);}
    public Notfound(String message,Throwable t){super(message,t);}
}
