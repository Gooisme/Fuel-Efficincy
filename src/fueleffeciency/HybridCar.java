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
public class HybridCar extends Vehicle{
     public String getDistance(double fuelAmount) {
        double distance = fuelAmount / 3.8 * 100;
        String output = "Hybrid Car:\t" + distanceKilo.format(distance);
        return output;
    }
}
