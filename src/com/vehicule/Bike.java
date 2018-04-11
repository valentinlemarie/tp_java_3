package com.vehicule;

public class Bike extends AbstractVehicule {


    Bike(Position position , Deplacement deplacement){
        super();// ->l'heritage -> contructeur abstractVehicule
    }

     String toString_information_bike(){
        return super.toString();
    }
}
