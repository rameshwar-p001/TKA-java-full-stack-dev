package Day17;

// 1. Create a class with private variables

// Question:
// Create a class Person with private variables name and age.
// Add setter and getter methods.
// Create an object and print the name and age.

// public class p2 {
//     private String name;
//     private int age;

//     public void setName(String n){
//         this.name=n;
//     }

//     public String getName(){
//         return name;
//     }

//     public void setAge(int a){
//         this.age=a;
//     }

//     public int getAge(){
//         return age;
//     }


//     public static void main(String[] args) {
        
//         p2 p=new p2();

        
     
//         p.setAge(1029);
//         p.setName("Rameshwar");

//         System.out.println("The age is student of "+p.getName());
//         System.out.println("The age is student of "+p.getAge());
//     }

// }


// 2. Bank Account – deposit & withdraw

// Question:
// Create a BankAccount class with a private balance.
// Add:
// deposit(double amount)
// withdraw(double amount)
// getBalance()


public class p2 {
    private double balance;

    public void setBalance(double ba){
        this.balance=ba;
    }

    public double getBalance(){
        return balance;
    }

     public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }


    public static void main(String[] args) {
        
        p2 p=new p2();

        p.setBalance(10000);
        p.deposit(100);
        p.withdraw(500);
        
        System.out.println(p.getBalance());

    }

}