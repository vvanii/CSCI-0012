package travel_assignment;

/*
Name: Vlad Anisov 
Date: 3/2/23
Program Desc: This program compares the time and money it will take between a gas car, and an electric car. Simply write tell the program how many times you want to compare (i.e. 1, 2, or 3) and then fill in the requested information. 
Self-grade: 100%, as I have provided comments throughout the code that I wrote, and the logic of the program is accurate to the output provided. I also believe that I followed proper naming convention and its easy to follow my code with proper indentation. 
*/

//importing java's utils for the scanner class
import java.util.*;
 
public class TravelCalcAnisov
{
   public static void main(String[] args)
   {
	   //This is what loops the program dependent on the users input
      Scanner sc = new Scanner(System.in);
      programDesc();
      System.out.print("\nHow many time do you want to use the app?: ");
      int count = sc.nextInt();
      for(int j = 1; j <= count; j++)
      {   
         gasTravel(sc);
         for(int i = 1; i <= 30; i++)
            System.out.print("&");
         System.out.println();   
         electricTravel(sc);
         for(int i = 1; i <= 30; i++)
            System.out.print("&");
         System.out.println();
      } 
      System.out.println("GOOD BYE");   
   }
   
   /*This method calculates the total cost charging the battery, Stops represents the number of the charges*/
   public static double chargeCost(double distance, int stops, double pricePerCharge)
   {
      return (distance / stops) * pricePerCharge;
   }
   
   /*This method calculates the total money spend on the gas to travel */
   public static double gasCost(double distance, double milesPerGallon, double costPerGallon)
   {
      return (distance / milesPerGallon) * costPerGallon;
   }
   
   /*This method calculates the number of the stops needed to charge the battery.
    milePerCharge represents the number of the miles  driven with a fully charged battery*/ 
   public static double stops(double distance, double milePerCharge)
   {
      return distance / milePerCharge;
   }
   
   /*This method calculates the hours of travel taking your gas car*/
   public static double travelHoursGasCar(double distance , double speed)
   {
      return distance / speed;
   }
   
   /*This method calculates the hours traveling using your electric car
   stops represents the number of the times the car needs to be charged
   hoursPerStop represents the time it takes to fully charge your car
   distance represents the total distance traveled
   speed represents the speed of the car
   */
   public static double travelHoursWithElectricCar(int stops, double hoursPerStop, double distance, double speed)
   {
      return distance / speed + (hoursPerStop * stops);
   }
   
   /*This method calculates the cost and the time to travel with a gas car*/
   public static void gasTravel(Scanner sc)
   {
      System.out.println("\nTraveling with a gas car\n");
      
      //prompt the user to enter the number of the miles to travel 
      System.out.print("Enter the total number of the miles you are traveling: ");
      //declare a variable and read the user's input
      double distance = sc.nextDouble();
      
      //prompts the user to enter the speed
      System.out.print("Enter the speed of your car: ");
      //declares a variable and reads the user's input
      double speed = sc.nextDouble();
      
      //prompts the user to enter the miles per gallon
      System.out.print("Enter the miles per gallon: ");
      //declares a variable and reads the user's input
      double mpg = sc.nextDouble();
      
      //prompts the user to enter the cost per gallon
      System.out.println("Enter the cost per gallon: ");
      //declares a variable and reads the user's input
      double pricePerGallon = sc.nextDouble();
      
      //These methods call the main methods and are assigned to variables which the show the result of the calculations done in the main methods.
      
      //calls the method travelWithGas, passing the proper parameters  
      double hours = travelHoursGasCar(distance, speed);

      //call the method gasCost, passing the proper parameters
      double priceOfGas = gasCost(distance, mpg, pricePerGallon);
      
      
      //displays the hours of travel and the cost of the travel 
      System.out.println("\nTraveling with your gas car: \n");
      //display  the result you got at step 7
      System.out.println("It will take you		" + hours + " hours.\n");
      //display the result you got at step 8
      System.out.println("The price of gas will be		" + priceOfGas + "\n");
   }
   public static void electricTravel(Scanner sc)
   {
   
      System.out.println("\nTraveling with an electric car\n");
      
      //prompt the user to enter the total number of miles that they are traveling
      System.out.print("Enter the total number of the miles you are traveling: ");
      //declares distance variable and reads user's input
      double distance = sc.nextDouble();
      
      //prompts the user to enter the speed
      System.out.print("Enter your speed: ");
      //declares a variable to read the speed
      double speed = sc.nextDouble();
      
      //prompts the user to enter the miles that can be driven with a fully charged battery
      System.out.print("Enter the number of the miles that you can travel with a fully charged battery: ");
      //declares a variable and read the input
      double milesPerCharge = sc.nextDouble();
      
      //1.prompts the user to enter the number of the hours it takes to fully charge the car battery
      System.out.print("Enter the number of hours it takes to FULLY charge your car's battery: ");
      //2.reads the user's input for time it takes to fully charge the car
      double timeForFullCharge = sc.nextDouble();
      
      //3.prompts the user to enter the cost per battery charge
      System.out.print("Enter the cost to fully charge your car battery: ");
      //4.declares a variable and reads the user's input
      double costPerCharge = sc.nextDouble();
      
      //These methods call the main methods and are assigned to variables which the show the result of the calculations done in the main methods.
      
      //calls the method stops with the proper parameters
      double numOfStops = stops(distance, milesPerCharge);
      //calls the method travelHourWithElectric with the proper parameters
      double electricTravelHours = travelHoursWithElectricCar((int) numOfStops, timeForFullCharge, distance, speed);                 
      //calls the method  chargeCost with the proper parameters 
      double totalChargeCost = chargeCost(distance,(int) milesPerCharge, costPerCharge);
      
      System.out.println("\nTraveling with your electric car\n");
      
      //displays the hours of travel 
      System.out.println("It will take you		" + electricTravelHours + " hours.\n");
      //displays total cost of charge  
      System.out.println("And the charge will cost you		" + totalChargeCost + "\n");
   }

   //this method is the description you see in the beginning of the program.
   public static void programDesc()
   {
      for(int i = 1; i <= 80; i++)
         System.out.print("&");
      System.out.println();
      System.out.println("This program calculates the cost and the time to travel to your destination ");
      System.out.println(" given the needed information for both gas car and the electric car.");
      System.out.println("Just answer some simple questions"); 
      for(int i = 1; i <= 80; i++)
         System.out.print("&");
      System.out.println();
   
       
   }
    
}