package Day15.ClassPractice.Ride;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        System.out.println("Total Fare = " + p.calculateFare(distance));
    }
}