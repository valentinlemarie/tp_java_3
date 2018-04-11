package com.vehicule;

public class Bike extends AbstractVehicule {

    float poids;
    Couleur couleur;
    String marque;
    String modele;


    Bike(Position position , Deplacement deplacement){
        super();// ->l'heritage -> contructeur abstractVehicule
    }

     String toString_information_bike(){
        return super.toString();
    }

    public void move (){}
}
