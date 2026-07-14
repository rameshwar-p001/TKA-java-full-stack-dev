package Day15.ClassPractice.Libsys;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Is Book Available? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        p.issueBook(bookName, isAvailable);
    }
}
