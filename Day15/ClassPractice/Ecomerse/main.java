package Day15.ClassPractice.Ecomerse;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the parchesd price --> ");

        double price=sc.nextDouble();

        p1 p=new p1();

        System.out.println(p.caldis(price));

    }
}



