package Day12_Pattern;

// public class p3 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// op
// *****
// *****
// *****
// *****
// *****




// public class p3 {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// *
// **
// ***
// ****
// *****




// public class p3 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// 12345
// 12345
// 12345
// 12345
// 12345


// Print a pattern where even rows print * and odd rows print #.

// public class p3 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 if (i%2==0) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print("#");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// #####
// *****
// #####
// *****
// #####


// Print a pattern of numbers where:

// 1
// 22
// 333
// 4444

// public class p3 {

//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }


// Print a multiplication table from 1 to 5 using nested loops.

// public class p3 {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=10;j++){
//                 System.out.println( i + "*" + j + "=" + (i*j));
//             }
//             System.out.println();
//         }
//     }
// }


// Print only even numbers between 1 to 50 using nested loops and if-else.

// public class p3 {

//     public static void main(String[] args) {
//         for(int i=1;i<=50;i++){
//             for(int j=i;j<=i;j++){
//                 if (j%2==0) {
//                     System.out.print(j+",");
//                 }
//             }
//         }
//     }
// }

// 2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50


// Print a pattern where:

// 1 0 1
// 0 1 0
// 1 0 1

// (Use if-else to decide 1 or 0)

// public class p3 {

//     public static void main(String[] args) {
//         for(int i=1;i<=3;i++){
//             for(int j =1;j<=3;j++){
//                 if((i + j) % 2 == 0) {
//                     System.out.print( " 1");
//                 }else{
//                     System.out.print(" 0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// Print a pyramid pattern:

//     *
//    ***
//   *****
//  *******


// public class p3 {

//     public static void main(String[] args) {
//         for(int i =1;i<=4;i++){
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i*2-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// Print a pattern where prime numbers are printed in a matrix (e.g., 5x5), and non-prime numbers are replaced with X.

public class p3 {
    public static void main(String[] args) {
        int num =1;
        for(int i=1;i<=5;i++){
            for(int j =1;j<=5;j++){

                int count = 0;
                for (int k = 1; k <= num; k++) {
                    if (num % k == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(num + " ");
                } else {
                    System.out.print("X ");
                }

                num++;
            }
            System.out.println();
        }
    }
}



// X  2   3  X  5 
// X  7   X  X  X 
// 11 X  13  X  X 
// X  17  X  19 X 
// X  X  23  X  X 