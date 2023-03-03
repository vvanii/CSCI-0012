package travel_assignment;

/*
Name: Vlad Anisov 
Date: 3/2/23
Program Desc: TODO: Fill out
Self-grade: TODO: Fill out
*/

//importing java's utils for the scanner
import java.util.*;
 
public class TravelCalcAnisov
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      description();
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
   
   public static double chargeCost(int stops, double pricePerCharge)
   {
      return stops / pricePerCharge;
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
      return (speed / distance) + stops + hoursPerStop;
   }
   
   /*This method calculates the cost and the time to travel with a gas car*/
   public static void gasTravel(Scanner sc)
   {
      System.out.println("\nTraveling with a gas car\n");
      
      //prompt the user to enter the number of the miles to travel 
      System.out.print("Enter the total number of the miles you are traveling: ");
      //declare a variable and read the user's input
      double distance = sc.nextDouble();
      //1. prompt the user to enter the speed
      System.out.print("Enter the speed of your car: ");
      //2. declare a variable and read the user's input
      double speed = sc.nextDouble();
      //3. prompt the user to enter the miles per gallon
      System.out.print("Enter the miles per gallon: ");
      //4. declare a variable and read the user's input
      double mpg = sc.nextDouble();
      //5. prompt the user to enter the cost per gallon
      System.out.println("Enter the cost per gallon: ");
      //6. declare a variable and read the user's input
      double pricePerGallon = sc.nextDouble();
      //7. call the method travelWithGas and pass the proper parameters  
      double hours = travelHoursGasCar(distance, speed);

      //8. call the method gasCost and pass the proper parameters
      double priceOfGas = gasCost(distance, mpg, pricePerGallon);
      
      //display the hours of travel and the cost of the travel 
      System.out.println("\nTraveling with your gas car: \n");
      //display  the result you got at step 7
      System.out.println("It will take you " + hours + " hours for total length of travel.\n");
      //display the result you got at step 8
      System.out.println("The price of gas will be " + priceOfGas + "\n");
   }
   public static void electricTravel(Scanner sc)
   {
   
      System.out.println("\nTraveling with an electric car\n");
      
      
      System.out.print("Enter the total number of the miles you are traveling: ");
      double distance = sc.nextDouble();
      //prompt the user to enter the speed
      System.out.print("Enter your speed: ");
      //declare a variable to read the speed
      double speed = sc.nextDouble();
      //prompt the user to enter the miles that can be driven with a fully charged battery
      System.out.print("Enter the number of the miles that you can travel with a fully charged battery: ");
      //declare a variable and read the input
      double milesPerCharge = sc.nextDouble();
      //1.prompt the user to enter the number of the hours it takes to fully charge the car battery
      System.out.print("Enter the number of hours it takes to FULLY charge your car's battery: ");
      //2.declare a variable and read the user's input 
      double timeForFullCharge = sc.nextDouble();
      //3.prompt the user to enter the cost per battery charge
      System.out.print("Enter the cost per battery charge: ");
      //4.declare a variable and read the user's input
      double costPerCharge = sc.nextDouble();
      //5.call the method stops with the proper parameters
      
      //6.call the method travelHourWithElectric with the proper parameters
                       
      //7.call the method  chargeCost with the proper parameters 
       
      
      System.out.println("\nTraveling with your electric car\n");
      
      //display the results that you got in step 6 
      
      //display the result from step 7   
             
   }

/* feel free to change the code in this method*/
   public static void description()
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