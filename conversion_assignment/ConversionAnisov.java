/*
Vlad Anisov
date: 02/16/2023
Description: This code simply includes some basic unit conversions like speed, measurements, currency, and so forth.
self-grade: 100% because I did the best to comment throughout the code and I did my best to make good indentation to make the code more readable.
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
      // Total starting pennies
      int pennies = 2042;

      // Starting code
      System.out.println(pennies + " pennies is equal to:");

      // Dollar amount
      int dollars = pennies / 100;
      System.out.println(dollars + " dollars");
      pennies = pennies % 100;

      // Quarter amount
      int quarters = pennies / 25;
      System.out.println(quarters + " quarters");
      pennies = pennies % 25;

      // Dime amount
      int dimes = pennies / 10;
      System.out.println(dimes + " dimes");
      pennies = pennies % 10;

      // Nickel amount
      int nickels = pennies / 5;
      System.out.println(nickels + " nickels");
      pennies = pennies % 5;

      // Print whats left
      System.out.println(pennies + " pennies");
   }

   /*
    * This method converts ounces to pounds and ounces
    * 1 pound is 16 ounces
    * 
    * For example 35 ounces is 2 pounds and 3 ounces
    * How many pounds and ounces are in 3255 ounces
    */

   public static void ounceToPound() {
      double ounce = 3255;
      // Start code

      // Ounce to pound conversion
      double pounds = ounce / 16.0;
      ounce = ounce % 16.0;

      // Print both pound and ounce's left over
      System.out.println("3255 ounces is equal to " + Math.floor(pounds) + " and " + ounce + " ounces");
   }

   /*
    * This method converts 5 cups to litter and displays it
    * 1 cup is equals to .24 litter
    */

   public static void cupsToLiter() {
      // Starting integer for cups
      int cups = 5;

      // Starting code
      // Cup to liters conversion
      double liters = cups / 4.0;
      System.out.println("5 cups is equal to " + liters + " liters");

   }

   /* this method converts 10 kilogram to pounds. 1 pound is .45 kilogram */

   public static void poundsToKilo() {
      // Starting integer for kilograms
      double kilogram = 10.0;

      // Starting code
      // Kilogram to pounds conversion
      double pounds = kilogram / 0.45;
      System.out.println("10.0 kilograms is equal to " + pounds + " pounds");
   }

   /*
    * this method converts speed in kilometer per hour to mile per hour
    * 1 mile per hour is equal to 1.6 kilometer per hour
    * convert 120 kilometer per hour to miles pr hour
    */

   public static void kilometerToMile() {
      // Starting integer for kph
      double kph = 120;

      // Starting code
      // KPH to MPH conversion
      double mph = kph / 1.609344;
      System.out.println("120 kph is equal to " + Math.ceil(mph) + " miles per hour");

   }

}