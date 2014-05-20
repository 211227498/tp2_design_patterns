/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.bridge;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public abstract class Vehicle {

    Engine engine;
    int weightInKilos;

    public abstract String drive();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String reportOnSpeed(int horsepower) {
        int ratio = weightInKilos / horsepower;
        if (ratio < 3) {
            return "The vehicle is going at a fast speed.";
        } else if ((ratio >= 3) && (ratio < 8)) {
            return "The vehicle is going an average speed.";
        } else {
            return "The vehicle is going at a slow speed.";
        }
    }
}
