//// ladder if else 

package Day9;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);

        System.out.print("Enter a Marks : ");
        int n = a.nextInt();

        if(n >= 90 && n <= 100){
            System.out.println("You get A grade ");
        }else if(n >= 80 && n <= 89){
            System.out.println("You get B grade ");
        }else if(n >= 70 && n <= 79){
            System.out.println("You get C grade ");
        }else if(n >= 60 && n <= 69){
            System.out.println("You get D grade ");
        }else if(n >= 50 && n <= 59){
            System.out.println("You get E grade ");
        }else{
            System.out.println("You Are Fail....... ");
        }
    }
}
