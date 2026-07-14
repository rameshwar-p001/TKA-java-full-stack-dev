package Day15.ClassPractice.Foodapp;


////Food Ordering App
////Method placeOrder(String item, int quantity) that prints bill.
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p1 p = new p1();

        System.out.print("Enter Item Name : ");
        String item = sc.nextLine();

        System.out.print("Enter Price of the item : ");
        int price = sc.nextInt();

        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();

        p.placeOrder(item, quantity,price);

        sc.close();
    }
}
