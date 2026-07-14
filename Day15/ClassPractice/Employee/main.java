package Day15.ClassPractice.Employee;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        p1 p = new p1();

        System.out.print("Enter the Salary of the employee --> ");
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        p.csal(sal);
    }
    
}
