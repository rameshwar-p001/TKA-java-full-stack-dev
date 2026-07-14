package Day15.ClassPractice.Student;

import java.util.Scanner;

//////Create a method calculatePercentage(int m1, int m2, int m3) that returns percentage.
public class main {
    
    public static void main(String[] args) {

        Scanner cs =new Scanner(System.in);

        System.out.print("Enter Marks 1 -> ");
        int m1= cs.nextInt();

         System.out.print("Enter Marks 2 -> ");
        int m2= cs.nextInt();

         System.out.print("Enter Marks 3 -> ");
        int m3= cs.nextInt();

        p1 p =new p1();

        p.calculatePercentage(m1, m2, m3);

        System.out.println("The total percentage is "+p.calculatePercentage(m1, m2, m3));
    }

}
