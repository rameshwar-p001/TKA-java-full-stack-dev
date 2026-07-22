package Day18;

// 1.Create a class Calculator and overload add() to add:
// two integers
// three integers

// public class p1 {

//     public void p1(int a, int b) {
//         System.out.println(a + b);
//     }

//     public void p1(int a, int b, int c) {
//         System.out.println(a + b + c);
//     }


//     public static void main(String[] args) {
//         p1 p=new p1();
//         p.p1(1,2,3);
//         p.p1(1, 2);
//     }

// }



// 2.Overload a method multiply() to multiply:
// two int values
// two double values


// public class p1 {

//     public void p1(int a, int b) {
//         System.out.println(a * b);
//     }

//     public void p1(double a,double b) {
//         System.out.println(a * b);
//     }


//     public static void main(String[] args) {
//         p1 p=new p1();
//         p.p1(1,2);
//         p.p1(1.2, 2);
//     }

// }


// 3.Create a method area() to calculate:
// area of circle
// area of rectangle


// public class p1 {

//     public p1(double a) {
//         System.out.println(3.17*a*a);
//     }

//     public void p1(int l , int b) {
//         System.out.println(l * b);
//     }


//     public static void main(String[] args) {
//         p1 p=new p1(12);
//         p.p1(1, 2);
//     }

// }



// 4.Overload a method display() to print:
// integer value
// string value


// public class p1 {

//     public p1(int a) {
//         System.out.println(a);
//     }

//     public void p1(String a) {
//         System.out.println(a);
//     }


//     public static void main(String[] args) {
//         p1 p=new p1(12);
//         p.p1("Rameshwar");
//     }

// }



// 5.Overload sum() using different data types:
// sum(int, int)
// sum(float, float)


// public class p1 {

//     public p1(int a, int b) {
//         System.out.println(a+b);
//     }

//     public void p1(float a, float b) {
//         System.out.println(a+b);
//     }


//     public static void main(String[] args) {
//         p1 p=new p1(12,13);
//         p.p1(2.3f,2.4f);
//     }

// }


// 6.Create a class Demo and overload show() using:
// (int, String)
// (String, int)


// public class p1 {

//     public p1(int a, String b) {
//         System.out.println(a);
//         System.out.println(b);
//     }

//     public void p1(String b,int a) {
//         System.out.println(a);
//         System.out.println(b);
//     }


//     public static void main(String[] args) {
//         p1 p=new p1(2,"Ram");
//         p.p1("Ram",3);
//     }
// }



// 7. Overload a constructor in a Student class to initialize:
// default values
// only id
// id and name


// public class p1 {

//     public static void print(int a) {
//         System.out.println("Value = " + a);
//     }

//     public static void print(int a, int b) {
//         System.out.println("First Value = " + a);
//         System.out.println("Second Value = " + b);
//     }


//     public static void main(String[] args) {
        
//         p1.print(34);
//         p1.print(34, 23);
//     }

// }



// 9. Can you overload the main() method? Write a program to prove it.

// public class p1 {

//     public static void print(int a) {
//         System.out.println("Value = " + a);
//     }

//     public static void print(int a, int b) {
//         System.out.println("First Value = " + a);
//         System.out.println("Second Value = " + b);
//     }


//     public static void main(String[] args) {
        
//         p1.print(34);
//         p1.print(34, 23);
//     }

// }



// 10.Overload a method calculate() to find:
// square of a number
// cube of a number


public class p1 {

    public p1(int a) {
        System.out.println(a*a);
    }

    public void p1(int b) {
        System.out.println(b*b*b);
    }


    public static void main(String[] args) {
        p1 p=new p1(2);
        p.p1(3);
    }
}
