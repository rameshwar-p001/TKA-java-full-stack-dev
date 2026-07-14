package Day15.ClassPractice.ATM;

import java.util.Scanner;

import Day14.practiceque.atmm.ATM;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        p.checkBalance();

        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        p.withdrawAmount(amount);

        p.checkBalance();
    }
}
