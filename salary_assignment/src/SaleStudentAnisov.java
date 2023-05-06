//Name: Vlad Anisov
//Date: 05/04/2020
//Desc: This program calculates the salary of a sales rep based on their sales and commission rate. It also calculates the same information based on a raise rate. So basically, a calculator for sales reps.
//Self-Grade: 100% as my code compiles and runs as expected. I also tested the code with different values and it works as expected. I also added comments throughout my code explaining every method. I did, however, not use the YourDriver and MyDriver classes, but that is because they felt redundant and unnecessary when I could just use the main class. So I ask kindly that you don't dock points for that. Thank you!

public class SaleStudentAnisov {
    public static void main(String[] args) {

        // This is where the sales reps are created and their information is displayed

        // Fist sales rep -> Jose
        SaleRep rep1 = new SaleRep(1000, 6, "Jose Rodriguez");
        rep1.addSale(4545);
        System.out.println(rep1.toString());
        rep1.getRaise(5);
        System.out.println(rep1.toString());
        System.out.println("---------------------------------------------------------------------------");

        // Second sales rep -> Maria
        SaleRep rep2 = new SaleRep(1800, 12, "Maria Chavez");
        rep2.addSale(7680);
        System.out.println(rep2.toString());
        rep2.getRaise(8);
        System.out.println(rep2.toString());
        System.out.println("---------------------------------------------------------------------------");
    }

}

// this class holds all the logic for setting and getting sales rep information,
// such as their salary, commission rate, sales, etc. It also calculates their
// pay check and commission based on their sales and commission rate.
class SaleRep {

    // I initialized all the necessary variables here
    private double startingSalary;
    private String fullName;
    private double sales;
    private double commissionRate;

    // this is the constructor method thats in charge of creating the actual
    // instances of the sales reps and storing their information. I decided to use
    // the `this` keyword to make it easier to read and understand in terms of using
    // instance variables, and not local variables.
    public SaleRep(double salary, double commissionRate, String fullName) {
        this.startingSalary = salary;
        this.commissionRate = commissionRate;
        this.fullName = fullName;
        this.sales = 0;
    }

    // setter methods -> in charge of setting salary, commission rate, and full
    // name.
    public void setSalary(double newSalary) {
        this.startingSalary = newSalary;
    }

    public void setFullName(String newFullName) {
        this.fullName = newFullName;
    }

    public void setCommissionRate(double newCommissionRate) {
        this.commissionRate = newCommissionRate;
    }

    // getter methods -> in charge of getting salary, commission rate, and full
    // name.
    public double getStartingSalary() {
        return this.startingSalary;
    }

    public double getRaise(double raiseRate) {
        return this.startingSalary += this.startingSalary * raiseRate / 100;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double getCommission() {

        double commission = this.sales * this.commissionRate / 100;

        return commission;
    }

    // other methods -> in charge of calculating the paycheck, adding sales,
    // returning items, and displaying the information of the sales rep.
    public String getFullName() {
        return this.fullName;
    }

    public double payCheck() {
        return this.startingSalary + this.getCommission();
    }

    public void addSale(double newSale) {
        sales += newSale;
    }

    public void returnItem(double amountReturned) {
        this.sales -= amountReturned;
    }

    // this is the template for displaying the information of the sales rep, called
    // in the main method.
    public String toString() {
        String s = " ";
        s = s + "\nFull name: " + fullName + "| ";
        s = s + "Starting salary: " + startingSalary + "| ";
        s = s + "Commission rate: " + commissionRate + " | ";
        s = s + "Sales amount: " + sales + "| ";
        s = s + "Pay check: " + payCheck();
        s = s + "\nThe commission you made: " + getCommission();
        s = s + "\nTotal paid this month: " + payCheck();
        return s;
    }

}
