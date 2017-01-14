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

public class CalculateTest {
	/**
	*Test add.
	*/
	
	@Test
	public void whenSetStopInEchoThenReturnThreeStops() {
		Calculate calc = new Calculate();
		String result = calc.echo("stop");
		assertThat(result, is("stop stop stop"));
	}

	@Test
	public void whenSetNullInEchoThenReturnTwoSpaces() {
		Calculate calc = new Calculate();
		String result = calc.echo("null");
		assertThat(result, is("null null null"));
	}

	
}