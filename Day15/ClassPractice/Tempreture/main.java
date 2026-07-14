package Day15.ClassPractice.Tempreture;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         Scanner cs =new Scanner(System.in);

        System.out.print("Enter Celcias -> ");
        double c= cs.nextDouble();        
    
        p1 p=new p1();
        p.celsiusToFahrenheit(c);
    }   
}
