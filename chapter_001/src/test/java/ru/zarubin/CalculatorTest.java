package ru.zarubin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test
 *
 *@author zarubin
 *@since 14/01/2017
 *@version 0.1
 **/

public class CalculatorTest {
	/**
	*Test add.
	*/
	
	@Test
	public void WhenAddCalcReturnSummResult() {
		Calculator calc = new Calculator();
		calc.add(3, 3);
		double result = calc.result();
		assertThat(result, is(6d));
	

}