package Day15.ClassPractice.Foodapp;



////Food Ordering App
////Method placeOrder(String item, int quantity) that prints bill.
public class p1 {

    public void placeOrder(String item, int quantity,int price) {
        int bill = price * quantity;

        System.out.println("Item Name : " + item);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Bill: " + bill);
    }
}