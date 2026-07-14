package Day15.ClassPractice.Ebill;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        System.out.print("Enter Electricity Units: ");
        int units = sc.nextInt();

        System.out.println(p.calculateBill(units));
    }
}