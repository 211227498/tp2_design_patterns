/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.creational.abstractfactory;

import com.hanm.tpg.designpatterns.creational.factorymethod.Animal;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);
}