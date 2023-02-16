/*
Vlad Anisov
date: 02/16/2023
Description://TODO: fill out
self-grade: //TODO: fill out
*/

/*_______________________________________________________________________________________________
Sample output: your code must match this output
2042 pennies is equal to: 
20 dollars
1 quarters
1 dimes
1 nickels
2 pennies
*****************************
3255 ounces is equal to 203.0 and 7.0 ounces
 *****************************
5 cups is equal to 1.2 liters
 *****************************
10.0 kilograms is equal to 22.22222222222222 pounds
 *****************************
120.0 kilometer per hour is equal to 75.0 miles per hour
_________________________________________________________________________________________________________
*/

public class ConversionAnisov {
   public static void main(String[] args) {
      conversion();
   }

   // this method calls all the other methods
   public static void conversion() {
      penniesToDollars();
      System.out.println("*****************************");
      ounceToPound();
      System.out.println("*****************************");
      cupsToLiter();
      System.out.println("*****************************");
      poundsToKilo();
      System.out.println("*****************************");
      kilometerToMile();
      System.out.println("*****************************");
   }

   /*
    * This method finds the number of dollars, quarters dimes, nickels and pennies
    * in 2042 pennies
    * for example 138 pennies is:
    * 138 / 100 = 2 dollars
    * 138 % 100 = 38 pennies left
    * 38/25 = 1 quarter
    * 38 % 25 = 13 pennies left
    * 13/10 = 1 dime
    * 13%10 = 3 pennies left
    * 3/ 5 = 0 nickel
    * 3 % 5 = 3 pennies
    * therefore 138 pennies is equal to 2 dollars, 1 quarter, 1 dime, 0 nickel and
    * 3 pennies
    * Must generate the exact output
    */

   public static void penniesToDollars() {
      int money = 2042;
      int pennies = 2042;
      // your code
      System.out.println(pennies + " pennies is equal to:");
      int dollars = pennies / 100;
      System.out.println(dollars + " dollars");
      pennies = pennies % 100;
      int quarters = pennies / 25;
      System.out.println(quarters + " quarters");
      pennies = pennies % 25;
   }

   /*
    * This method converts ounces to pounds and ounces
    * 1 pound is 16 ounces
    * 
    * For example 35 ounces is 2 pounds and 3 ounces
    * How many pounds and ounces are in 3255 ounces
    */

   public static void ounceToPound() {
      int ounce = 3255;
      // your code
   }

   /*
    * This method converts 5 cups to litter and displays it
    * 1 cup is equals to .24 litter
    */

   public static void cupsToLiter() {
      int cups = 5;
      // your code
   }

   /* this method converts 10 kilogram to pounds. 1 pound is .45 kilogram */

   public static void poundsToKilo() {
      double kilogram = 10;
      // your code
   }

   /*
    * this method converts speed in kilometer per hour to mile per hour
    * 1 mile per hour is equal to 1.6 kilometer per hour
    * convert 120 kilometer per hour to miles pr hour
    */

   public static void kilometerToMile() {
      double kph = 120;
      // your code
   }

}