/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueleffeciency;

/**
 *
 * @author Noah Kidd
 */
public class FuelEffeciency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Truck bigOne = new Truck();
        System.out.println(bigOne.getDistance(50));
        Car kachow = new Car();
        System.out.println(kachow.getDistance(50));
        HybridCar zoinks = new HybridCar();
        System.out.println(zoinks.getDistance(50));
        Motorcycle skullGang = new Motorcycle();
        System.out.println(skullGang.getDistance(50));
    }
    
}
