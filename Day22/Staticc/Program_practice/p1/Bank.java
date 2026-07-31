package Day22.Staticc.Program_practice.p1;



// Create a class Bank:
// static variable: rateOfInterest
// static method to change ROI
// non-static method to display account balance + ROI
// Call methods and observe behavior.


public class Bank {

    static double rateOfInterest = 7.5;

    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    static void changeROI(double roi) {
        rateOfInterest = roi;
    }

    void display() {
        System.out.println("Balance : " + balance);
        System.out.println("ROI : " + rateOfInterest);
    }
}