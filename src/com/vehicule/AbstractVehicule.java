package com.vehicule;

public abstract class AbstractVehicule implements Vehicule {

    private Position position;
    private Deplacement deplacement;

    public AbstractVehicule(){
        this.position = new Position();
        this.deplacement = new Deplacement();
    }

    @Override
    public String toString() {
        return this.position.toString()+"   \n"+this.deplacement.toString();
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public void setDirection(float n, float s, float o, float e) {
        this.deplacement.setNord(n);
        this.deplacement.setSud(s);
        this.deplacement.setOueust(o);
        this.deplacement.setEst(e);
    }

    @Override
    public void setSpeed(float speed) {
        this.deplacement.setSpeed(speed);
    }
}
