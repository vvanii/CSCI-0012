package gallon_conversion_assignment;

/*
Name: Vlad Anisov
Date: 02/20/2023
Description: This program shows you gallon to liter conversions starting from 1 gallon to 97 gallons (or every 4 gallons).
Self-Grade: 100% as I provided detailed comments throughout the entire code, I structured my code with proper spacing and indentation, and I satisfied all the assignment requirements.
*/

// this is the main class
public class GallonConversionAnisov
{
	//class constants
	public static final double LITERS = 3.78;
	
	// this is the main method
	public static void main (String[] args)
	{
		//calling the 2 methods that make up the code
		description();
		galToLitConversion();
   	}
	
	////////////////////////////////////////////////////////////////////
	
	/* This method simply displays a description of what this program does. It uses 2 for loops in order to display the top and bottom borders.*/
	public static void description()
	{
		for(int i = 1; i<=81; i++) {
			System.out.print("*");
		};
		System.out.println("\n*           This program shows you conversions from gallons to liters           *");
		System.out.println("*                     1 gallon is equivalent to 3.78 liters                     *");
		System.out.println("*                            Starting from 1 - 100                              *");
		System.out.println("*                                                                               *");
		for(int i = 1; i<=81; i++) {
			System.out.print("*");
		};
		System.out.println(" \n ");
	} 
   
	////////////////////////////////////////////////////////////////////
	
	/*This method does the initial gallon to liter conversion. I used a for loop, iterating through the conversion 100 times, with the conversion being i * 3.78, and i incrementing by 4. */
	public static void galToLitConversion()
	{
		System.out.println("\n" + "              " + "Gallon(s):                  Liter(s):");
		for (int i = 1; i <= 100; i += 4) {
			double newLiterValue = (LITERS * i);
			System.out.println("                 " + i + "                          " + newLiterValue);
		};
	}
   
   
   
} 