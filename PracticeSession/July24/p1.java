package PracticeSession.July24;

import java.util.Scanner;

// Q1. Create a method calculateElectricityBill(int units):
// First 100 units → ₹5/unit
// Next 100 → ₹7/unit
// Above 200 → ₹10/unit
// Return total bill.

// public class p1 {
//     int amount=0;
//     public void bill(int unit){
//         if (unit<=100 && unit>1) {
//                 amount = unit*5;
//             System.out.println("you want to pay 5Rs per unit "+amount);
//         }else if (unit > 100 && unit<200 ) {
//             amount = unit*7;
//             System.out.println("You want to pay the bill 7Rs per unit "+amount);
//         }else if (unit > 200 ) {
//             amount = unit*10;
//             System.out.println("You want to pay the bill 10Rs per unit "+amount);
//         }
//     }

//     public static void main(String[] args) {
//         p1 p=new p1();
//         p.bill(300);
//     }
// }

// Q2 Create a method isArmstrong(int num):
// Check if number is Armstrong (e.g., 153)
// Return true/false
// Call method from main() and print resultlic 

// class p1 {
//     public boolean isArmstrong(int num) {

//     int original = num;
//     int temp = num;
//     int digits = 0;
//     int sum = 0;

//     while (temp > 0) {
//         digits++;
//         temp = temp / 10;
//     }

//     temp = num;

//     while (temp > 0) {
//         int digit = temp % 10;
//         sum += Math.pow(digit, digits);
//         temp = temp / 10;
//     }

//     if (sum == original) {
//         return true;
//     } else {
//         return false;
//     }
// }

//     public static void main(String[] args) {
//         p1 p=new p1();
//         System.out.println(p.isArmstrong(153));
//     }
// }

// class p1 {
//     public char calculateGrade(int m1, int m2, int m3) {

//         int total = m1 + m2 + m3;
//         double average = total / 3.0;

//         if (average > 75) {
//             return 'A';
//         } else if (average >= 60) {
//             return 'B';
//         } else if (average >= 40) {
//             return 'C';
//         } else {
//             return 'F';
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Student Name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter Marks 1: ");
//         int m1 = sc.nextInt();

//         System.out.print("Enter Marks 2: ");
//         int m2 = sc.nextInt();

//         System.out.print("Enter Marks 3: ");
//         int m3 = sc.nextInt();

//         p1 p = new p1();

//         char grade = p.calculateGrade(m1, m2, m3);

//         System.out.println("Student Name : " + name);
//         System.out.println("Grade : " + grade);
//     }
// }


// Take input:

// Product name, quantity, price
// Calculate total bill
// If bill > 5000 → apply 10% discount
// Print final amount


// class p1 {

//     public double calculateBill(int quantity, double price) {

//         double total = quantity * price;

//         if (total > 5000) {
//             total = total - (total * 10 / 100);
//         }

//         return total;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Product Name: ");
//         String product = sc.nextLine();

//         System.out.print("Enter Quantity: ");
//         int quantity = sc.nextInt();

//         System.out.print("Enter Price: ");
//         double price = sc.nextDouble();

//         p1 p = new p1();

//         double bill = p.calculateBill(quantity, price);

//         System.out.println("Product Name : " + product);
//         System.out.println("Final Bill : ₹" + bill);

//         sc.close();
//     }
// }


// Q5. Create a calculator using switch:
// Input: two numbers + operator (+, -, *, /)
// Perform operation using switch


// class p1 {

//     public double calculator(double a, double b, char op) {

//         double result = 0;

//         switch (op) {

//             case '+':
//                 result = a + b;
//                 break;

//             case '-':
//                 result = a - b;
//                 break;

//             case '*':
//                 result = a * b;
//                 break;

//             case '/':
//                 if (b != 0) {
//                     result = a / b;
//                 } else {
//                     System.out.println("Division by zero is not allowed.");
//                 }
//                 break;

//             default:
//                 System.out.println("Invalid Operator");
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First Number: ");
//         double num1 = sc.nextDouble();

//         System.out.print("Enter Second Number: ");
//         double num2 = sc.nextDouble();

//         System.out.print("Enter Operator (+, -, *, /): ");
//         char op = sc.next().charAt(0);

//         p1 p = new p1();

//         double ans = p.calculator(num1, num2, op);

//         System.out.println("Result = " + ans);

//     }
// }

// Q6. Menu-driven program:

// 1. Check Even/Odd
// 2. Check Prime
// 3. Reverse Number
// Take choice using switch
// Perform selected operation


// class p1 {

//     // Even/Odd
//     public void evenOdd(int num) {
//         if (num % 2 == 0) {
//             System.out.println("Even Number");
//         } else {
//             System.out.println("Odd Number");
//         }
//     }

//     // Prime
//     public void prime(int num) {

//         int count = 0;

//         for (int i = 1; i <= num; i++) {
//             if (num % i == 0) {
//                 count++;
//             }
//         }

//         if (count == 2) {
//             System.out.println("Prime Number");
//         } else {
//             System.out.println("Not a Prime Number");
//         }
//     }

//     // Reverse
//     public void reverse(int num) {

//         int rev = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }

//         System.out.println("Reverse Number = " + rev);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         p1 p = new p1();

//         System.out.println("1. Check Even/Odd");
//         System.out.println("2. Check Prime");
//         System.out.println("3. Reverse Number");

//         System.out.print("Enter Choice: ");
//         int choice = sc.nextInt();

//         System.out.print("Enter Number: ");
//         int num = sc.nextInt();

//         switch (choice) {

//             case 1:
//                 p.evenOdd(num);
//                 break;

//             case 2:
//                 p.prime(num);
//                 break;

//             case 3:
//                 p.reverse(num);
//                 break;

//             default:
//                 System.out.println("Invalid Choice");
//         }
//     }
// }




// Q7. Check loan eligibility:

// Salary > 25,000
// Age between 21–60
// If both true → Eligible
// Else → Not Eligible


// class p1 {

//     public boolean checkEligibility(int salary, int age) {

//         if (salary > 25000 && age >= 21 && age <= 60) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Salary: ");
//         int salary = sc.nextInt();

//         System.out.print("Enter Age: ");
//         int age = sc.nextInt();

//         p1 p = new p1();

//         if (p.checkEligibility(salary, age)) {
//             System.out.println("Eligible for Loan");
//         } else {
//             System.out.println("Not Eligible for Loan");
//         }

//         sc.close();
//     }
// }


// Q8. Find highest among 4 numbers using nested if-else (no arrays)


// class p1 {

//     public int findHighest(int a, int b, int c, int d) {

//         if (a > b) {
//             if (a > c) {
//                 if (a > d) {
//                     return a;
//                 } else {
//                     return d;
//                 }
//             } else {
//                 if (c > d) {
//                     return c;
//                 } else {
//                     return d;
//                 }
//             }
//         } else {
//             if (b > c) {
//                 if (b > d) {
//                     return b;
//                 } else {
//                     return d;
//                 }
//             } else {
//                 if (c > d) {
//                     return c;
//                 } else {
//                     return d;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First Number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter Second Number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter Third Number: ");
//         int c = sc.nextInt();

//         System.out.print("Enter Fourth Number: ");
//         int d = sc.nextInt();

//         p1 p = new p1();

//         int highest = p.findHighest(a, b, c, d);

//         System.out.println("Highest Number = " + highest);

//         sc.close();
//     }
// }




// Q9. Create class BankAccount:

// Private variables: balance
// Methods:
// deposit(amount)
// withdraw(amount) (check balance)
// getBalance()
// Perform operations in main()



// class BankAccount {

//     private double balance;

//     // Setter
//     public void setBalance(double balance) {
//         this.balance = balance;
//     }

//     // Getter
//     public double getBalance() {
//         return balance;
//     }

//     // Deposit
//     public void deposit(double amount) {
//         setBalance(getBalance() + amount);
//         System.out.println("Amount Deposited: " + amount);
//     }

//     // Withdraw
//     public void withdraw(double amount) {

//         if (amount <= getBalance()) {
//             setBalance(getBalance() - amount);
//             System.out.println("Amount Withdrawn: " + amount);
//         } else {
//             System.out.println("Insufficient Balance");
//         }
//     }
// }

// public class p1 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         BankAccount b = new BankAccount();

//         System.out.print("Enter Initial Balance: ");
//         b.setBalance(sc.nextDouble());

//         System.out.print("Enter Deposit Amount: ");
//         b.deposit(sc.nextDouble());

//         System.out.print("Enter Withdraw Amount: ");
//         b.withdraw(sc.nextDouble());

//         System.out.println("Current Balance: " + b.getBalance());

//     }
// }



// Q10. Create class Student:

// Private fields: name, marks
// Validate marks (0–100 only)
// If invalid → print error
// Use getter/setter


// public class p1 {

//     private String name;
//     private int marks;

//     // Setter for Name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // Getter for Name
//     public String getName() {
//         return name;
//     }

//     // Setter for Marks
//     public void setMarks(int marks) {

//         if (marks >= 0 && marks <= 100) {
//             this.marks = marks;
//         } else {
//             System.out.println("Error: Marks should be between 0 and 100.");
//         }
//     }

//     // Getter for Marks
//     public int getMarks() {
//         return marks;
//     }


//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         p1 s = new p1();

//         System.out.print("Enter Student Name: ");
//         s.setName(sc.nextLine());

//         System.out.print("Enter Marks: ");
//         s.setMarks(sc.nextInt());

//         System.out.println("Student Name: " + s.getName());
//         System.out.println("Marks: " + s.getMarks());

//         sc.close();
//     }
// }



// Q11. Create overloaded methods area():

// Circle → area(double radius)
// Rectangle → area(int l, int b)
// Triangle → area(int base, int height)


// public class p1 {

//     // Circle
//     public double area(double radius) {
//         return 3.14 * radius * radius;
//     }

//     // Rectangle
//     public int area(int length, int breadth) {
//         return length * breadth;
//     }

//     // Triangle
//     public double area(int base, int height, boolean triangle) {
//         return 0.5 * base * height;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         p1 p = new p1();

//         System.out.print("Enter Radius: ");
//         double r = sc.nextDouble();
//         System.out.println("Area of Circle = " + p.area(r));

//         System.out.print("Enter Length: ");
//         int l = sc.nextInt();

//         System.out.print("Enter Breadth: ");
//         int b = sc.nextInt();
//         System.out.println("Area of Rectangle = " + p.area(l, b));

//         System.out.print("Enter Base: ");
//         int base = sc.nextInt();

//         System.out.print("Enter Height: ");
//         int h = sc.nextInt();
//         System.out.println("Area of Triangle = " + p.area(base, h, true));
//     }
// }



// Q12. Create method add():

// add(int, int)
// add(int, int, int)
// add(double, double)+
// Print result for all cases

// public class p1 {
//     public int add(int a, int b) {
//         return a + b;
//     }
//     public int add(int a, int b, int c) {
//         return a + b + c;
//     }
//     public double add(double a, double b) {
//         return a + b;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         p1 p = new p1();

//         System.out.print("Enter Two Integers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("Sum = " + p.add(a, b));

//         System.out.print("Enter Three Integers: ");
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int z = sc.nextInt();
//         System.out.println("Sum = " + p.add(x, y, z));

//         System.out.print("Enter Two Double Values: ");
//         double d1 = sc.nextDouble();
//         double d2 = sc.nextDouble();
//         System.out.println("Sum = " + p.add(d1, d2));
//     }
// }



// Q13. Create class Vehicle:
// method: start()
// Create subclass Car:
// method: showSpeed()
// Call both methods using object


// class Vehicle {

//     public void start() {
//         System.out.println("Vehicle Started");
//     }
// }

// class Car extends Vehicle {

//     public void showSpeed() {
//         System.out.println("Speed = 80 km/h");
//     }
// }

// public class p1 {

//     public static void main(String[] args) {

//         Car c = new Car();

//         c.start();
//         c.showSpeed();  
//     }
// }


// Q14. Create class Employee:
// fields: name, salary
// Subclass Manager:
// add bonus
// Calculate total salary


class Employee {     //class1

    String name;
    double salary;

    public void getEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {   //class 2

    double bonus;

    public void getBonus(double bonus) {
        this.bonus = bonus;
    }

    public void totalSalary() {
        double total = salary + bonus;

        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + total);
    }
}

public class p1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        m.getEmployee(name, salary);
        m.getBonus(bonus);

        m.totalSalary();
    }
}