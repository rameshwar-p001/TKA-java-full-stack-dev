package Day15.ClassPractice.Shoping;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        System.out.print("Enter Price 1: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter Price 2: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter Price 3: ");
        double price3 = sc.nextDouble();

        System.out.println("Total Price = " + p.calculateTotal(price1, price2, price3));
    }
}