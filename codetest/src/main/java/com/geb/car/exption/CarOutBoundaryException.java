package com.geb.car.exption;

/**
 * @author Geb
 */
public class CarOutBoundaryException extends Exception{

    public CarOutBoundaryException(){
        super();
    }

    public CarOutBoundaryException(String msg) {
        super(msg);
    }
}
