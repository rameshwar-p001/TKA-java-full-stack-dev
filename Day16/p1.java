package Day16;


// //////Create a Student class with a default constructor that prints "Student object created".

// public class p1 {
    
//     public p1(){
//          System.out.println("Student object creation is created.......");
//     }


//     public static void main(String[] args) {
//         p1 p = new p1();
//     }
// }




//////Create an Employee class with a parameterized constructor to initialize id and name, then display the values.

// public class p1 {
    
//     public p1(int id , String name){
//          System.out.println("The student id is "+id + " name is "+name);
//     }


//     public static void main(String[] args) {
//         p1 p = new p1(121,"Rameshwar");
//     }
// }



//////Create a Car class with a default constructor that initializes default values (brand, model, price) and prints them.

// public class p1 {

//     String brand ="iPhone";
//     int model=2025; 
//     int price=400000;
    
//     public p1(){
//          System.out.println("The brand name is = "+brand);
//          System.out.println("The model is "+model);
//          System.out.println("The price "+price);
//     }


//     public static void main(String[] args) {
//         p1 p = new p1();
//     }
// }


//////Create a Book class with multiple objects using a parameterized constructor and display each book's details.


// public class p1 {
    
//     public p1(int id,String author,String bookName){
//          System.out.println("The Book id is = "+id);
//          System.out.println("The Author is "+author);
//          System.out.println("The Bookname "+bookName);
//     }


//     public static void main(String[] args) {
//         System.out.println("--------- Book 1 ------------");
//         p1 p = new p1(21,"jemsgoslin","Java");
//         System.out.println("--------- Book 2 ------------");
//         p1 p1 = new p1(22,"andman","C++");
//         System.out.println("--------- Book 3 ------------");
//         p1 p2 = new p1(212,"jslin","R");
//     }
// }


//////Create a Rectangle class with a constructor that initializes length and width, then write a method to calculate the area.

// public class p1 {
    
//     public p1(int length,int width){

//          System.out.println("The Area of rectangle is = "+(length*width));
//     }


//     public static void main(String[] args) {
//         p1 p = new p1(12,43);
     
//     }
// }


////Create a BankAccount class where the constructor initializes the account number, account holder name, and balance. Add methods for deposit and withdrawal.


// public class p1 {

//     int accno;
//     String accnme;
//     int bal;
    
//     public p1(int accno,String accnme,int bal){

//          System.out.println("The Account number = "+accno);
//          System.out.println("The Account Name = "+accnme);
//          System.out.println("The Account balance = "+bal);
    
//     }

// public void deposit(int amount){
//     bal += amount;
//     System.out.println("Balance = " + bal);
// }

// public void withdrawal(int amount){
//     bal -= amount;
//     System.out.println("Balance = " + bal);
// }



//     public static void main(String[] args) {
//         p1 p = new p1(12345,"rameshwar",20000);
//         p.deposit(102);
//         p.withdrawal(102);
     
//     }
// }


//////Create a Laptop class with both a default constructor and a parameterized constructor. Display the object details for both.

public class p1 {


    public p1(){
        String brand="asus";
        String model="a15";
        int price =100000;

        System.out.println("From default constructr");
        System.out.println("Laptop brand is "+brand);
        System.out.println("Laptop Model is "+model);
        System.out.println("Laptop Price is "+price);
    }
    
    public p1( String brand,String model ,int price){
                System.out.println("From parametrise constructr");


         System.out.println("Laptop brand is "+brand);
        System.out.println("Laptop Model is "+model);
        System.out.println("Laptop Price is "+price);
    
    }


    public static void main(String[] args) {
        p1 p2=new p1();
        p1 p = new p1("asus","m15",300000);
     
    }
}