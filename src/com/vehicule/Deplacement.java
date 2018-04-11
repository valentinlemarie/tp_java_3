package com.vehicule;

public class Deplacement {

    float nord;
    float sud;
    float oueust;
    float est;

    float speed;

    Deplacement(){
        this.nord =1;
        this.sud =0;
        this.oueust=0;
        this.est=0;
        this.speed=0;
    }
    Deplacement(float n,float s, float o, float e , float speed){
        this.nord =n;
        this.sud =s;
        this.oueust=o;
        this.est=e;
        this.speed=speed;
    }


    @Override
    public String toString() {
        return "deplacement n,s,o,e : "+String.valueOf(getNord())+","+String.valueOf(getSud())+","+String.valueOf(getOueust())+","+String.valueOf(getEst()+"\nvitesse "+String.valueOf(getSpeed()));
    }

    public float getEst() {
        return est;
    }

    public float getNord() {
        return nord;
    }

    public float getOueust() {
        return oueust;
    }

    public float getSpeed() {
        return speed;
    }

    public float getSud() {
        return sud;
    }

    public void setEst(float est) {
        this.est = est;
    }

    public void setNord(float nord) {
        this.nord = nord;
    }

    public void setOueust(float oueust) {
        this.oueust = oueust;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setSud(float sud) {
        this.sud = sud;
    }


}
