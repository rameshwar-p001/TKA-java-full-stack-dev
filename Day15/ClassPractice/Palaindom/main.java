package Day15.ClassPractice.Palaindom;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        boolean a = p.isPalindrome(num);

        if (a) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}