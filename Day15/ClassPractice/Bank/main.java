package Day15.ClassPractice.Bank;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         p1 p = new p1();

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle --> ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Rate --> ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time --> ");
        int time = sc.nextInt();
        System.out.println("The intrest is --> "+p.calculateInterest(principal,rate,time));


    }
}
