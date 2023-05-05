public class SaleStudentAnisov {
}

class SaleRep {

    private double startingSalary;
    private double commissionRate;
    private String fullName;
    private double sales;

    public SaleRep(double salary, double commissionRate, String fullName) {

    }

    public double payCheck() {
        return 0;
    }

    public void addSale(double newSale) {

    }

    public void returnItem(double amountReturned) {

    }

    public String toString() {
        String s = " ";
        s = s + "\nFull name: " + fullName + "| ";
        s = s + "Starting salary: " + startingSalary + "| ";
        s = s + "Commission rate: " + commissionRate + " | ";
        s = s + "Sales amount: " + sales + "| ";
        s = s + "pay check: " + payCheck();
        s = s + "\nThe commission you made: " + getCommission();
        s = s + "\nTotal paid this month: " + payCheck();
        return s;
    }

    // setter methods
    public void setSalary(double newSalary) {

        this.startingSalary = newSalary;

    }

    public void setFullName(String newFullName) {

    }

    public void setCommissionRate(double newCommissionRate) {

    }

    // getter methods
    public double getStartingSalary() {

        return startingSalary;
    }

    public void getRaise(double raiseRate) {

    }

    public double getCommissionRate() {
        return 0;
    }

    public double getCommission() {
        return 0;
    }

    public String getFullName() {
        return "";
    }

}

class MyDriver {
    public static void main(String[] args) throws Exception {
    }
}

class YourDriver {

}
