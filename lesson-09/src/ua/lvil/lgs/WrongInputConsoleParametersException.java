package ua.lvil.lgs;

/**
 * Throws an exception if a parameter is entered through the console that does not meet the requirements.
 * @since java 1.8
 * @author Eugene
 * @version 1.1 
 * */
public class WrongInputConsoleParametersException extends Exception{

	/**
	 * A constructor whose input parameter is the text that will be printed to the console when an exception occurs.
	 * 
	 * @param wrongText
	 * 		  Text to be displayed when an exception occurs
	 * 
	 * */
	public WrongInputConsoleParametersException(String wrongText) {
		super(wrongText);
	}
	
}
