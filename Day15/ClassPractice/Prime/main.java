package Day15.ClassPractice.Prime;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        boolean ans = p.isPrime(num);

        if (ans) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}