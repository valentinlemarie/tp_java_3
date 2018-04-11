package com.vehicule;

public class Car {
    float volume;
    float essense;
    float co2;

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    public float getCo2() {
        return co2;
    }

    public float getEssense() {
        return essense;
    }

    public void setEssense(float essense) {
        this.essense = essense;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "voiture : \n volume :"+getVolume()+"\n essence :"+getEssense()+"\nco2 :"+getCo2();
    }
}
