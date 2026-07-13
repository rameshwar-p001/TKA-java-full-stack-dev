package Day15.P1;


//// no return type and Non-Parameterised


//// Write a method that returns the square of a number.

// public class p1 {
//     public void sq(){

//         int l =10;

//         System.out.println(l*l);
//     }
// }


///// Write a method that returns the cube of a number.

// public class p1 {
//     public void q(){

//         int l =10;

//         System.out.println(l*l*l);
//     }
// }

///// Write a method that returns the sum of two numbers.

// public class p1 {
//     public void add(){

//         int l =10;
//         int b=20;
//         System.out.println(l+b);
//     }
// }


//// Write a method that returns the greatest of three numbers

// public class p1 {
//     public void gr(){

//         int a =10;
//         int b=20;
//         int c=30;
        
//         if (a>b) {
//             if (a>c) {
//                 System.out.println("A is greter...........");
//             }else{
//                 System.out.println("C is greater..........");
//             }
//         }else{
//             if (b>c) {
//                 System.out.println("B is greter");
//             }else{
//                 System.out.println("C is greater ");
//             }
//         }
//     }
// }


//// Write a method that returns true if a number is even, else false.

// public class p1 {
//     public void eo(){

//         int l =10;
        
//         if (l%2==0) {
//             System.out.println("It was a even number .... ");
//         }else{
//             System.out.println("It is odd number ");
//         }
//     }
// }



/////Write a method that returns the factorial of a number.

// public class p1 {
//     public void fac(){

//         int fact = 1;

//         for (int i = 1; i <= 5; i++) {
//             fact = fact * i;
//         }
//         System.out.println(fact);
//     }
// }

///////Write a method that returns the reverse of a number.

// public class p1 {
//     public void rev(){

//         int no = 1234;
//         String a="";
//         while (no>0) {
//             int digit = no % 10;
//             a += digit;
//             no=no/10;
//         }
//         System.out.println(a);
//     }
// }



///// Write a method that returns whether a number is prime or not.



// public class p1 {
//     public void pri(){

//           int count = 0;

//         for (int i = 1; i <= 56; i++) {

//             if (56 % i == 0) {
//                 count++;
//             }
//         }

//         if (count == 2) {
//             System.out.println("Prime Number");
//         } else {
//             System.out.println("Not Prime Number");
//         }
       
//     }
// }


////// Write a method that returns the count of digits in a number.

public class p1 {

    public void no(){
         int a=1324434334;
        int count=0;
        while (a>0) {
            
            count++;
            a = a / 10;
        }
        System.out.println(count);
    }
}