package com.geb.car;

/**
 * @author Geb
 *
 * driverless car function:
 * 1.moving forward into different directions
 * 2.turning clockwise in a car park
 * 3.remenber its position
 * 4.remenber its orientation
 */
public interface ICar {

    /**
     * move forward into different directions
     * @param command
     */
    void move(String command) throws Exception ;


    void turn(String command) throws Exception ;

    int getPositionX();

    int getPositionY();

    String getOrientation();
}
