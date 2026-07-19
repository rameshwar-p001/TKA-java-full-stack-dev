package PracticeSession.July18;

import java.util.Scanner;

// 1. Student Details

// Create a Student class:

// Constructor initializes name, marks
// Method to display result (Pass/Fail)

// public class p1 {
//     String name="Rameshwar D Patil";
//     int marks=66;
//     public p1(){
//         System.out.println("Student name is --> "+name);
//     }

//     public void marks(){
//         if(marks>50){
//             System.out.println("you are Pass beacuse your marks is "+marks);
//         }else{
//             System.out.println("You are Fail because your marks is "+marks);
//         }
//     }

//     public static void main(String[] args) {
//         p1 p = new p1();
//         p.marks();
//     }
// }

//// 2. Rectangle Area
// //Create a Rectangle class:
// //Constructor takes length & breadth
// ///Method to calculate and print area

// public class p1 {
//     int le;
//     int we;

//     public p1(){
//         Scanner s =new Scanner(System.in);

//         System.out.print("Enter Length ");
//         le=s.nextInt();
//         System.out.print("Enter width ");
//         we=s.nextInt();

//     }

//     public void cal(){
//        int calsu=this.le*this.we;
//        System.out.println("The area of rectangel is = "+calsu);
//     }

//     public static void main(String[] args) {
//         p1 p = new p1();
//         p.cal();
//     }
// }

//// 3. Employee Salary
//// Create Employee:
//// Constructor  name, basicSalary
// //Method calculate total salary (add 20% bonus)

// public class p1 {
//     String name;
//     int bs;

//     public p1(String name, int bs) {
//         this.name = name;
//         this.bs = bs;
//     }

//     public void cal() {
//         int b = bs * 20 / 100;
//         int ts = b + bs;
//         System.out.println("Employee name is = " + name);
//         System.out.println("The salary is  = " + bs);
//         System.out.println("The bonus is 20% then  = " + b);
//         System.out.println("The Total salary is  = " + ts);
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter Name: ");
//         String name = s.nextLine();

//         System.out.print("Enter Salary: ");
//         int salary = s.nextInt();

//         p1 p = new p1(name, salary);
//         p.cal();
//     }
// }

// 4. Circle Operations
// Create Circle:
// Constructor radius
// Methods area & circumference

// public class p1 {
//     double radius;

//     public p1(double radius) {
//         this.radius = radius;
//     }

//     public void area() {
//         double c =3.14*radius*radius;
//         System.out.println("Area of circumference = " + c);
//     }

//       public void circumference() {
//         double circumference = 2 * 3.14 * radius;
//         System.out.println("Circumference of Circle = " + circumference);
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter Radius : ");
//         double radiu = s.nextDouble();

//         p1 p = new p1(radiu);
//         p.area();
//         p.circumference();
//     }
// }

// 5. Simple Interest
// Create Interest class:
// Constructor principal, rate, time
// Method calculate SI

// public class p1 {
//    int principal;
//    int rate;
//    int time;

//     public p1(int principal,int rate,int time) {
//         this.time=time;
//         this.principal=principal;
//         this.rate=rate;
//     }

//     public void s() {
//         int si= (principal*rate*time)/100;
//         System.out.println("The SI is  = " + si);
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter principle : ");
//         int pr = s.nextInt();

//          System.out.print("Enter rate : ");
//         int r = s.nextInt();
//          System.out.print("Enter time : ");
//         int t = s.nextInt();

//         p1 p = new p1(pr,r,t);
//         p.s();
//     }
// }

// 6. Even or Odd
// Create class:
// Constructor â†’ number
// Method â†’ check even/odd

// public class p1 {
//    int no;

//     public p1(int no) {
//         this.no=no;
//     }

//     public void s() {
//        if (no%2==0) {
//             System.out.println("The number is given is even");
//        }else{
//         System.out.println("The number is given is odd");
//        }
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter number : ");
//         int n = s.nextInt();

//         p1 p = new p1(n);
//         p.s();
//     }
// }

// 7. Temperature Converter
// Create class:
// Constructor â†’ Celsius
// Method â†’ convert to Fahrenheit

// public class p1 {
//    int cel;

//     public p1(int cel) {
//         this.cel=cel;
//     }

//     public void s() {
//         double f= (cel * 9 / 5) + 32;
//         System.out.println("The Fahrenheit is "+f);
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter Celsius : ");
//         int n = s.nextInt();

//         p1 p = new p1(n);
//         p.s();
//     }
// }

// 8. Bank Account
// Create BankAccount:
// Constructor accountNumber, balance
// Methods:
// deposit()
// withdraw()
// displayBalance()

// public class p1 {
//     int accNo;
//     int balance = 10000;

//     public p1(int ano) {
//         this.accNo = ano;
//     }

//     int d;

//     public void deposit(int d) {
//         balance = d + balance;
//         System.out.println("Deposited Amount = " + d);
//         System.out.println("The balance is  = " + balance);
//     }

//     int w;

//     public void withdraw(int w) {
//         balance = w - balance;
//         System.out.println("witdraw Amount = " + w);
//         System.out.println("The balance is  = " + balance);
//     }

//     public void displayBalance() {
//         System.out.println("The total balance is  = " + balance);
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter Account number : ");
//         int n = s.nextInt();

//         p1 p = new p1(n);
//         p.deposit(200);
//         p.withdraw(100);
//         p.displayBalance();
//     }
// }

// 9. Product Discount
// Create Product:
// Constructor price
// Method apply 10% discount if price > 1000

// public class p1 {
//     int price;

//     public p1(int p) {
//         this.price = p;
//     }

//     public void displayBalance() {
//         if (price>1000) {
//             int discount=price * 10 / 100;
//             System.out.println("You get the discount of 10% "+discount);
//         }else{
//             System.out.println("No discount you was there");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter price of the prodeuct : ");
//         int n = s.nextInt();

//         p1 p = new p1(n);
//         p.displayBalance();
//     }
// }

// 10. Student Grade
// Create Student:
// Constructor marks
// Method return grade (A/B/C/Fail)

// public class p1 {

//     int marks;
//     public p1(int m){
//         this.marks=m;
//     }

//     public void cal(){
//         if (marks>100) {
//             System.out.println("Enter valid marks ");
//         }
//         else if (marks>80 ) {
//             System.out.println("You have grade A");
//         }else if (marks>60) {
//             System.out.println("You have grade b");
//         }else if (marks>40) {
//             System.out.println("You have grade c");
//         }else if (marks>40) {
//             System.out.println("You Are fail");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.print("Enter yours marks ");
//         int g=sc.nextInt();
//         p1 p =new p1(g);
//         p.cal();
//     }
// }



// 11. Number Reverse
// Create class:
// Constructor â†’ number
// Method â†’ reverse number


// public class p1 {

//     int num;

//     public p1(int m) {
//         this.num = m;
//     }

//     int rev;

//     public void cal() {
//         while (num != 0) {
//             int rem = num % 10;
//             rev = rev * 10 + rem;
//             num = num / 10;
//         }
//         System.out.println(rev);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number ");
//         int g = sc.nextInt();
//         p1 p = new p1(g);
//         p.cal();
//     }
// }


// 12. Palindrome Check
// Create class:
// Constructor â†’ number
// Method â†’ check palindrome

// public class p1 {

//     int num;

//     public p1(int m) {
//         this.num = m;
//     }

//     int rev;

//     public void cal() {
//         while (num != 0) {
//             int rem = num % 10;
//             rev = rev * 10 + rem;
//             num = num / 10;
//         }
//        if (num==rev) {
//          System.out.println("Yes it is palindrom");
//        }else{
//         System.out.println("It is not a palindrom");
//        }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter yours marks ");
//         int g = sc.nextInt();
//         p1 p = new p1(g);
//         p.cal();
//     }
// }



// 13. Power Calculation
// Create class:
// Constructor base, exponent
// Method calculate power without using Math.pow()

// public class p1 {

//      int base;
//     int exponent;

//     // Parameterized Constructor
//     public p1(int base, int exponent) {
//         this.base = base;
//         this.exponent = exponent;
//     }

//     // Method to calculate power
//     public void cal() {

//         int result = 1;

//         for (int i = 1; i <= exponent; i++) {
//             result = result * base;
//         }

//         System.out.println(base + " ^ " + exponent + " = " + result);
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter base ");
//         int g = sc.nextInt();
        
//         System.out.print("Enter exponencial ");
//         int r = sc.nextInt();

//         p1 p = new p1(g,r);
//         p.cal();
//     }
// }



// 14. Max of Three Numbers
// Create class:
// Constructor â†’ 3 numbers
// Method â†’ find largest

// public class p1 {

//     int a;
//     int b;
//     int c;

//     public p1(int a, int b, int c) {
//         this.a = a;
//         this.b = b;
//         this.c = c;
//     }

//     public void max() {
//         if (a >= b && a >= c) {
//             System.out.println("Largest Number = " + a);
//         } else if (b >= a && b >= c) {
//             System.out.println("Largest Number = " + b);
//         } else {
//             System.out.println("Largest Number = " + c);
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

//         p1 p = new p1(a, b, c);
//         p.max();
//     }
// }


// 15. ATM Machine Simulation
// Create ATM:
// Constructor â†’ initial balance
// Methods:
// deposit
// withdraw
// check balance
// Add condition for insufficient balance
////////////////////////////////////

// public class p1 {

//     int balance;

//     public p1(int balance) {
//         this.balance = balance;
//     }

//     public void deposit(int amount) {
//         balance += amount;
//         System.out.println("Deposit Successful.");
//     }

//     public void withdraw(int amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawal Successful.");
//         } else {
//             System.out.println("Insufficient Balance.");
//         }
//     }

//     public void checkBalance() {
//         System.out.println("Current Balance = " + balance);
//     }

//     public static void main(String[] args) {
//         p1 atm = new p1(10000);

//         atm.deposit(2000);
//         atm.withdraw(5000);
//         atm.checkBalance();
//     }
// }


// 16. Shopping Cart
// Create Cart:
// Constructor â†’ item price & quantity
// Method â†’ calculate total bill
// Add discount if total > 5000


// public class p1 {

//     int price, quantity;

//     public p1(int price, int quantity) {
//         this.price = price;
//         this.quantity = quantity;
//     }

//     public void bill() {
//         int total = price * quantity;

//         if (total > 5000) {
//             double discount = total * 10 / 100.0;
//             total -= discount;
//             System.out.println("10% Discount Applied.");
//         }

//         System.out.println("Total Bill = " + total);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Price: ");
//         int p = sc.nextInt();

//         System.out.print("Enter Quantity: ");
//         int q = sc.nextInt();

//         p1 cart = new p1(p, q);

//         cart.bill();
//     }
// }



// 17. Electricity Bill
// Create ElectricityBill:
// Constructor â†’ units
// Method â†’ calculate bill:
// 0â€“100 â†’ â‚¹5/unit
// 101â€“200 â†’ â‚¹7/unit
// 200+ â†’ â‚¹10/unit


// public class p1 {

//     int units;

//     public p1(int units) {
//         this.units = units;
//     }

//     public void bill() {

//         int total;

//         if (units <= 100) {
//             total = units * 5;
//         } else if (units <= 200) {
//             total = units * 7;
//         } else {
//             total = units * 10;
//         }

//         System.out.println("Electricity Bill = " + total);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Units: ");
//         int u = sc.nextInt();

//         p1 e = new p1(u);

//         e.bill();
//     }
// }



// 18. Fibonacci Series
// Create class:
// Constructor â†’ number of terms
// Method â†’ print Fibonacci series


// public class p1 {

//     int terms;
//     public p1(int terms) {
//         this.terms = terms;
//     }

//     public void fib() {

//         int a = 0;
//         int b = 1;

//         for (int i = 1; i <= terms; i++) {
//             System.out.print(a + " ");
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number of Terms: ");
//         int n = sc.nextInt();
//         p1 f = new p1(n);
//         f.fib();
//     }
// }


// 19. Prime Number Check
// Create class:
// Constructor â†’ number
// Method â†’ check prime


// public class p1 {


//     int num;

//     public p1(int num) {
//         this.num = num;
//     }

//     public void prime() {

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

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number: ");
//         int n = sc.nextInt();
//         p1 p = new p1(n);
//         p.prime();
//     }
// }



// 20. Library System
// Create Library:
// Constructor â†’ bookName, isIssued (boolean)
// Methods:
// issueBook()
// returnBook()
// Prevent issuing if already issued


public class p1 {

    String bookName;
    boolean isIssued;

    public p1(String bookName, boolean isIssued) {
        this.bookName = bookName;
        this.isIssued = isIssued;
    }

    public void issueBook() {

        if (isIssued) {
            System.out.println("Book is already issued.");
        } else {
            isIssued = true;
            System.out.println("Book issued successfully.");
        }
    }

    public void returnBook() {

        if (!isIssued) {
            System.out.println("Book is already available.");
        } else {
            isIssued = false;
            System.out.println("Book returned successfully.");
        }
    }

    public static void main(String[] args) {

        p1 library = new p1("Java Programming", false);

        library.issueBook();
        library.issueBook();

        library.returnBook();
        library.returnBook();
    }
}