package Day15.ClassPractice.ATM;

import java.util.Scanner;

// Create a method checkBalance() that displays account balance.
// Create a method withdrawAmount(double amount) to deduct balance.
public class p1 {

    double current =100000;
    public void checkBalance(){

        System.out.println("Current Balance is -- > "+current);

    }
    public void withdrawAmount(double wi){
        if (current>wi) {
             current=current-wi;
            System.out.println("Here the amount was dedicted --> "+ wi +" and the current ammount is " +current );
        }else{
            System.out.println("In suficent ammount ---> "+wi);
        }
    }
}