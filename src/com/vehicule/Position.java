package com.vehicule;

public class Position {
    private float latitude ;
    private float longitude ;

    Position(){
        this.latitude=0;
        this.longitude=0;
    }

    Position(int lat , int lon ){
        this.latitude= lat;
        this.longitude= lon;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Latitude "+getLatitude()+"\nLongitude "+getLongitude();
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
