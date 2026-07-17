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


public class p1 {
    
    public p1(int id,String author,String bookName){
         System.out.println("The Book id is = "+id);
         System.out.println("The Author is "+author);
         System.out.println("The Bookname "+bookName);
    }


    public static void main(String[] args) {
        p1 p = new p1();
    }
}