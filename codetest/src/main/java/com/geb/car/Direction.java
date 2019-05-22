package com.geb.car;

public class Direction {
    public static final String NORTH = "north";
    public static final String SOUTH = "south";
    public static final String EAST = "east";
    public static final String WEST = "west";

    public static String getClockWiseOri(String dir){
        String colockWiseOri = null ;
        switch ( dir ){
            case NORTH : colockWiseOri = EAST ; break;
            case EAST : colockWiseOri = SOUTH ; break;
            case SOUTH : colockWiseOri = WEST ; break;
            case WEST : colockWiseOri = NORTH ; break;
            default: {}
        }
        return colockWiseOri ;
    }

    public static String getAntiClockWiseOri(String dir){
        String colockWiseOri = null ;
        switch ( dir ){
            case NORTH : colockWiseOri = WEST ; break;
            case WEST : colockWiseOri = SOUTH ; break;
            case EAST : colockWiseOri =  NORTH ; break;
            case SOUTH : colockWiseOri = EAST ; break;
            default: {}
        }
        return colockWiseOri ;
    }
}
