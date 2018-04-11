package com.vehicule;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Position position = new Position();
        Deplacement deplacement = new Deplacement();
        Bike bike = new Bike(position,deplacement);
        System.out.println(bike.toString_information_bike());
    }
}
