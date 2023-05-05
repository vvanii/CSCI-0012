public class SaleStudentYourLastName // <----- change this name to include your last name
{
}

class SaleRep {
  // instance variables
  // constructor
  public SaleRep(double salary, double commissionRate, String fullname) {
  }

  // getter methods
  // setter methods
  // calculate the total monthly pay by calculating the commission that the person
  // received
  public double paycheck() {
    return 0;
  }

  // calculates the commission
  public double getCommission()// changed the name
  {
    return 0;
  }

  // this method is called every time the employee has a new sale
  public void addSale(double newSale) {
    // your code
  }

  // reducing the sale
  public void returnItem(double amountReturned) {
  }

  public void getRaise(double raiseRate) {
  }

  // toString method// changed the format, I removed the new lines
  public String toString() {
    return "";
  }
}

class MyDriver {
  public static void main(String[] args) {
    // String first, String last, double baseSalary,double commission)
    // creating objects of Employee
    // ( double salary, double commissionRate, String fullname)
    SaleRep e1 = new SaleRep(1000, 6, "Jose Rodriguez");
    // sales for employee e1: Jose
    e1.addSale(5000);
    e1.addSale(3000);
    e1.addSale(1200);
    // an item is returned therefore the sale amount must be adjusted
    e1.returnItem(5000);
    // another item is sold by
    e1.addSale(345);
    System.out.println(e1);
    // get a raise
    e1.getRaise(5);
    // displaying the result after the raise
    System.out.println(e1.toString());
    System.out.println("------------------------------------------------------------------------------------------");
    // Sale rep #2
    SaleRep e2 = new SaleRep(1800, 12, "Maria Chavez");
    // adding sale
    e2.addSale(1234);
    e2.addSale(7645);
    e2.addSale(3456);
    // an item is returned therefore the sale amount must be adjusted
    e2.returnItem(5000);
    // another item is sold
    e2.addSale(345);
    System.out.println(e2.toString());
    // got a raise
    e2.getRaise(8);
    // displaying the info after the raise
    System.out.println(e2);
    System.out.println("---------------------------------------------------------------------------");
  }
}

// create 2 Objects of employee of your choice
// create similar code given in the MyDriver class for each of the objects
// This driver has 15 points
// do not copy and paste the provided driver since it does not help you to learn
class yourDriver {
  public static void main(String[] args) {
    // create the first object
    // call the proper methods similar to the given code in the MyDriver class
    // ****************************
    // create the second object and call the proper methods similar to the code
    // given in the driver above
  }
}
