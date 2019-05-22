package com.geb.car;

import com.geb.park.ParkingLot;

/**
 * @author Geb
 */
public abstract class AbstractCar implements ICar {

    private int positionX ;

    private int positionY ;

    private String orientation ;

    private ParkingLot parkingLot ;

    public AbstractCar(int x, int y, String orientation, ParkingLot parkingLot){
        positionX = x ;
        positionY = y ;
        this.orientation = orientation ;
        this.parkingLot = parkingLot ;
    }

    @Override
    public int getPositionX() {
        return positionX ;
    }

    @Override
    public int getPositionY() {
        return positionY ;
    }

    @Override
    public String getOrientation() {
        return orientation ;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public String toString() {
        return String.format("{positionX: %d, positionY: %d, orientation: %s, parkingLot :%s}" ,
                positionX, positionY, orientation, parkingLot.toString() ) ;
    }


}
