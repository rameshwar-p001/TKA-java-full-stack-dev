/////  lader nested if else
package Day9;

import java.util.Scanner;

public class p8 {
        public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        System.out.print("Enter Number  ...... ");
        int a=ac.nextInt();

        if (a>0) {
            if (a%2==0) {  
                System.out.println("It is even number and positive number ");
            }
            else{
                System.out.println("It is positive but not a even number  ");
            }
        }else if(a==0){
            System.out.println("it is 0 not a positive and negative number ");
        }
        else{
            System.out.println(" It is negative number  ");
        }
    }

}
