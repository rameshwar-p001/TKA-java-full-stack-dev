package Day15.ClassPractice.Recharge;

import java.util.Scanner;

//////Mobile Recharge
/////Create a method recharge(double amount) that prints success message.
public class main {
    public static void main(String[] args) {
    Scanner cs =new Scanner(System.in);

        System.out.print("Enter ammount rechage -> ");
        double m1= cs.nextDouble();        
    
        p1 p=new p1();
        p.recharge(m1);
    }



}
