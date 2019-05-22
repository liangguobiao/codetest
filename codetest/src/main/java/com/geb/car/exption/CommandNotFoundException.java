package com.geb.car.exption;

public class CommandNotFoundException extends Exception {
    public CommandNotFoundException(){
        super();
    }

    public CommandNotFoundException(String msg) {
        super(msg);
    }
}
