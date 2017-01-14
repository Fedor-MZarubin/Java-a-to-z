package ru.zarubin;
/**
 * //TODO add comments.
 *
 *@author zarubin
 *@since 14/01/2017
 *@version 0.1
 *@param value строка для вывода в консоль
 */
public class Calculate {
	/**
	*@param value строка для вывода в консоль
	*/
	public String echo(String value) {
		return String.format("%s %s %s", value, value, value);
	}
	
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println(calc.echo("aah"));
	}

}