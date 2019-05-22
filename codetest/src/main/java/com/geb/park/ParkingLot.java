package com.geb.park;

import com.sun.javafx.binding.StringFormatter;

public class ParkingLot {
    int xBoundary ;

    int yBoundary ;

    public ParkingLot(int x, int y ) {
        xBoundary = x ;
        yBoundary = y ;
    }

    /**
     * check the given position whether out of boundary
     * return true if position is out of boundary
     */
    public boolean checkOutBoundary(int x, int y){
        return x <= 0 || x > xBoundary || y<=0 || y>yBoundary ;
    }

    public int getxBoundary() {
        return xBoundary;
    }

    public void setxBoundary(int xBoundary) {
        this.xBoundary = xBoundary;
    }

    public int getyBoundary() {
        return yBoundary;
    }

    public void setyBoundary(int yBoundary) {
        this.yBoundary = yBoundary;
    }

    @Override
    public String toString() {
        return String.format("{ parkinglot : { xBoundary: %d , yBoundary: %d } }" , xBoundary ,yBoundary) ;
    }

}
