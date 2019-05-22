package com.geb.car.impl;

import com.geb.car.AbstractCar;
import com.geb.car.Command;
import com.geb.car.exption.CarOutBoundaryException;
import com.geb.car.exption.CommandNotFoundException;
import com.geb.park.ParkingLot;
import com.geb.car.Direction;

/**
 * @author Geb
 */
public class DriverLessCar extends AbstractCar {

    public DriverLessCar(int x, int y, String orientation, ParkingLot parkingLot){
        super(x , y, orientation , parkingLot);
    }

    @Override
    public void move(String command) throws Exception{
        int predictX = getPositionX() ;
        int pridictY = getPositionY() ;
        String ori = getOrientation() ;
        ParkingLot parkingLot= getParkingLot() ;
        int offset ;
        switch ( command ) {
            case Command.MOVE_FORWARD : {
                offset = 1 ;
                break;
            }
            case Command.MOVE_BACKWARD : {
                offset = -1 ;
                break;
            }
            default: {
                throw new CommandNotFoundException(String.format( "command: %s", command)) ;
            }
        }
        switch ( ori ) {
            case Direction.NORTH :
            case Direction.SOUTH : {
                pridictY += offset ;
                break;
            }
            case Direction.EAST :
            case Direction.WEST : {
                predictX += offset ;
                break;
            }
            default: {}
        }
        if( parkingLot.checkOutBoundary(predictX , pridictY) ) {
            throw new CarOutBoundaryException( String.format("{carInfo: %s , command: %s}", this.toString(), command)  ) ;
        }
        setPositionX( predictX );
        setPositionY( pridictY );
    }

    @Override
    public void turn(String command) throws Exception{
        String ori = getOrientation() ;

        switch ( command ) {
            case Command.TURN_CLOCKWISE : {
                setOrientation( Direction.getClockWiseOri(ori) );
                break;
            }
            case Command.TURN_ANTICLOCKWISE : {
                setOrientation( Direction.getAntiClockWiseOri(ori) );
                break;
            }
            default: {
                throw new CommandNotFoundException(String.format( "command: %s", command)) ;
            }
        }

    }
}
