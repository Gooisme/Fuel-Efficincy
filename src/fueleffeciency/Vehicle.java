/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueleffeciency;

import java.text.DecimalFormat;

/**
 *
 * @author Noah Kidd
 */
public abstract class Vehicle {

    DecimalFormat distanceKilo = new DecimalFormat("##.00 km");

    public abstract String getDistance(double fuelAmount);
}
