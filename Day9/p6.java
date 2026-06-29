//// nested if 

package Day9;

import java.util.Scanner;

public class p6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The number is Positive and Even");
            }
        }else{
            System.out.println("number is not positive ");
        }

    }
}