/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.creational.builder;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class Meal {

	private String drink;
	private String mainCourse;
	private String side;

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getMainCourse() {
		return mainCourse;
	}

	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String toString() {
		return "drink:" + drink + ", main course:" + mainCourse + ", side:" + side;
	}

}
