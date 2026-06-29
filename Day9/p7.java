//// nested if else 

package Day9;

import java.util.Scanner;

public class p7 {
        
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        System.out.print("Enter variable 1 ...... ");
        int a=ac.nextInt();
        System.out.print("Enter variable 2 ...... ");
        int b=ac.nextInt();
        System.out.print("Enter variable 3 ...... ");
        int c=ac.nextInt();

        if (a>b) {
            if (a>c) {  
                System.out.println("A is greater ");
            }
            else{
                System.out.println("C is greater ");
            }
        }else{
            if (b>c) {  
                System.out.println("b is greater ");
            }
            else{
                System.out.println("C is greater ");
            }
        }
    }


}
