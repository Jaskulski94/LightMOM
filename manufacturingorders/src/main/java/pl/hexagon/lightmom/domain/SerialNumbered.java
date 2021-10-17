package pl.hexagon.lightmom.domain;

import java.util.Date;

public interface SerialNumbered {

    default String generateSerialNumber(String id){
        return id + "_" + getHexDate();
    }

    private String getHexDate(){
        Date date = new Date();
        long timeMilli = date.getTime();
        return Long.toHexString(timeMilli);
    }
}
