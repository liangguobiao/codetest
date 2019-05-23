package com.geb.car.impl;

import com.geb.car.Command;
import com.geb.car.Direction;
import com.geb.park.ParkingLot;
import junit.framework.TestCase;
import org.junit.Test;

import org.apache.log4j.Logger;

public class DriverLessCarTest extends TestCase {

    Logger logger = Logger.getLogger(DriverLessCar.class) ;

    DriverLessCar init(){
        ParkingLot lot = new ParkingLot(2,2) ;
        DriverLessCar car = new DriverLessCar(1,1, Direction.NORTH, lot) ;
        return car;
    }

    @Test
    public void testMoveForward() {
        DriverLessCar car = init() ;
        try {
            logger.info(car);
            car.move(Command.MOVE_FORWARD);
            logger.info(car);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    @Test
    public void testForwardOutBoundary(){
        DriverLessCar car = init() ;
        try {
            logger.info(car);
            car.move(Command.MOVE_FORWARD);
            car.move(Command.MOVE_FORWARD);
            logger.info(car);
        } catch (Exception e) {
            logger.error(e);
        }
    }



    @Test
    public void testMoveBackward() {
        DriverLessCar car = init() ;
        try {
            logger.info(car);
            car.move(Command.MOVE_FORWARD);
            car.move(Command.MOVE_BACKWARD);
            logger.info(car);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    @Test
    public void testBackwardOutBoundary() {
        DriverLessCar car = init() ;
        try {
            logger.info(car);
            car.move(Command.MOVE_BACKWARD);
            logger.info(car);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    @Test
    public void testTurnClockWise() {
        DriverLessCar car = init() ;
        try {
            logger.info(car);
            car.turn(Command.TURN_CLOCKWISE);
            car.turn(Command.TURN_CLOCKWISE);
            logger.info(car);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    @Test
    public void testTurnAntiClockWise() {
        DriverLessCar car = init() ;
        try {
            logger.info(car);
            car.turn(Command.TURN_ANTICLOCKWISE);
            car.move(Command.TURN_ANTICLOCKWISE);
            logger.info(car);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    @Test
    public void testTurnAndMove1() {
        DriverLessCar car = init() ;
        try {
            logger.info(car);
            car.turn(Command.TURN_CLOCKWISE);
            car.move(Command.MOVE_FORWARD);
            logger.info(car);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    @Test
    public void testTurnAndMove2() {
        DriverLessCar car = init() ;
        try {
            logger.info(car);
            car.turn(Command.TURN_ANTICLOCKWISE);
            car.move(Command.MOVE_BACKWARD);
            logger.info(car);
        } catch (Exception e) {
            logger.error(e);
        }
    }


}
