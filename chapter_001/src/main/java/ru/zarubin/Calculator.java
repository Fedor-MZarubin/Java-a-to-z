package ru.zarubin;
/**
 * Calculator
 *
 *@author zarubin
 *@since 09/02/2017
 *@version 0.1
 */

public class Calculator {
	private double result;

	public double getResult(){
	return this.result;
	}

	public void add(double first, double second) {
	this.result = first + second;
	}
		
	public void raz(double first, double second) {
	this.result = first - second;
	}

	public void umn(double first, double second) {
	this.result = first * second;
	}
	
	public void del(double first, double second) {
	this.result = first / second;
	}
	

}