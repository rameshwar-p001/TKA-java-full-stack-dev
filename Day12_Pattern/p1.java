package Day12_Pattern;



// ****
// ****
// ****
// ****


// public class p1 {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){   // outer loop // rows
//             for(int j=1;j<=4;j++){   // inner loop // col
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


// public class p1 {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){   
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// ****
// ***
// **
// *

// public class p1 {
//     public static void main(String[] args) {
//         for(int i=4;i>=1;i--){   
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// ****
//  ***
//   **
//    *

// public class p1 {
//     public static void main(String[] args) {
//         for(int i=4;i>=1;i--){   
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//    *
//   **
//  ***
// ****

// public class p1 {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){   
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k <= i ;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//    *
//   ***
//  *****
// *******

// public class p1 {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){   
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k <= i*2-1 ;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// *******
//  *****
//   ***
//    *

// public class p1 {
//     public static void main(String[] args) {
//         for(int i=4;i>=1;i--){   
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k <= i*2-1 ;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// A
// AB
// ABC
// ABCD
// ABCDE

// public class p1 {
//     public static void main(String[] args) {
//         for(char i='A';i<='E';i++){   
//             for(char j='A';j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// ABCDE
// ABCD
// ABC
// AB
// A

// public class p1 {
//     public static void main(String[] args) {
//         for(char i='E';i>='A';i--){   
//             for(char j='A';j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//     *
//    ***
//   *****
//  *******
//   *****
//    ***
//     *


// public class p1 {

//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=i*2-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//          for(int i=3;i>=1;i--){    
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=i*2-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//  ****
//   ****
//    ****
//     ****


// public class p1 {

//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=4;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// public class p1 {

//     public static void main(String[] args) {
//        for(int i=4;i>=1;i--){    
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=i*2-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=2;i<=4;i++){
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=i*2-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
         
//     }
// }


// ****
// *  *
// *  *
// ****


// public class p1 {
//     public static void main(String[] args) {
//        for(int i =1;i<=4;i++){
//             for(int j=1;j<=4;j++){
//                 if (i == 1 || i == 4 || j == 1 || j == 4) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//        }
//     }
// }

//     *
//    * *
//   *   *
//  *******

// public class p1 {

//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=i*2-1;k++){
//                 if (k==1||k==2*i-1||i==4) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//  *******
//   *   *
//    * *
//     *

// public class p1 {

//     public static void main(String[] args) {
//         for(int i=4;i>=1;i--){
            
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=i*2-1;k++){
//                  if (k==1||k==2*i-1||i==4) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//     *
//    * *
//   *   *
//  *     *
//   *   *
//    * *
//     *


// public class p1 {

//     public static void main(String[] args) {
//         for(int i=1;i<=3;i++){
            
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=i*2-1;k++){
//                  if (k==1||k==2*i-1||i==5) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         for(int i=4;i>=1;i--){
            
//             for(int j=4;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k <=i*2-1;k++){
//                  if (k==1||k==2*i-1||i==5) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//  1
//  2 3
//  4 5 6
//  7 8 9 10

// public class p1 {
//     public static void main(String[] args) {
//         int a=1;
//         for(int i=1;i<=4;i++){   
//             for(int j=1;j<=i;j++){
//                 System.out.print(" "+a);
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }



//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 

public class p1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
