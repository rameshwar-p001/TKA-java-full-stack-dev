package Day15.p4;


////// non Parameterised with returntype 

//// Write a method that returns the square of a number.

// public class p1 {
//     public int sq(){
//      int l=10;
//         return l*l;
//     }
// }


///// Write a method that returns the cube of a number.

// public class p1 {
//     public int q(){
//int l =10;
//         return l*l*l;
//     }
// }

///// Write a method that returns the sum of two numbers.

// public class p1 {
//     public int add(){
//int l=10;
// int b=10;
//         return l+b;
//     }
// }


//// Write a method that returns the greatest of three numbers

// public class p1 {
//     public int gr(){
//      int a=10;
//      int b=20;
//       int c=30;
        
//         if (a>b) {
//             if (a>c) {
//                 return a;
//             }else{
//                return b;
//             }
//         }else{
//             if (b>c) {
//                 return b;
//             }else{
//                 return c;
//             }
//         }
//     }
// }


//// Write a method that returns true if a number is even, else false.

// public class p1 {
//     public boolean eo(){    
//          int l=121    
//         if (l%2==0) {
//             return true;
//         }else{
//             return false;
//         }
//     }
// }



/////Write a method that returns the factorial of a number.

// public class p1 {
//     public int fac(){
//           int f=123;
//         int fact=1;
//         for (int i = 1; i <= f; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }
// }


///////Write a method that returns the reverse of a number.

// public class p1 {
//     public int rev(){
//      int no=123345;
//      int a=0;

//         while (no>0) {
//             int digit = no % 10;
//             a = a*10+digit;
//             no=no/10;
//         }
//         return a;
//     }
// }




///// Write a method that returns whether a number is prime or not.

// public class p1 {
//     public boolean pri(){

//         int count=0;
//          int a=56;
//         for (int i = 1; i <= a; i++) {
//             if (56 % i == 0) {
//                 count++;
//             }
//         }

//         if (count == 2) {
//             return true;
//         } else {
//             return false;
//         }
       
//     }
// }


////// Write a method that returns the count of digits in a number.

public class p1 {

    public int no(){
int a=123456;
int count=0;
        while (a>0) {
            
            count++;
            a = a / 10;
        }
        return count;
    }
}

