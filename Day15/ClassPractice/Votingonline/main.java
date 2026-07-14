package Day15.ClassPractice.Votingonline;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        p.vote(age);
    }
}