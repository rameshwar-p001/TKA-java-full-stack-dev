package Day15.ClassPractice.Ecomerse;

/////Method calculateDiscount(double price) returns final price after discount.
public class p1 {
    
    public double caldis(double price){

       double discount = (price * 10) / 100;

       
        double finalPrice = price - discount;

        return finalPrice;

    }

}
