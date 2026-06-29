package Day11;


//// Print numbers from 1 to 50 but stop when number becomes 25.
// public class p5 {
//     public static void main(String[] args) {
//         for (int i = 1; i < 50; i++) {
//             if (i == 25) {
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }


///// Print even numbers from 1 to 100 but stop when you get first odd number.

// public class p5  {
//     public static void main(String[] args) {
//         for(int i = 1; i<=100;i++){
//             if (i%2 == 0) {
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
    
// }



/////// Print table of 9 but stop when product becomes more than 50.

// public class p5  {
//     public static void main(String[] args) {
//         for(int i = 9; i<=100;i=i+9){
//             if (i>=50) {
//                 break;
//             }
//             System.out.println(i);
//         }
//     } 
// }


///// Print numbers from 1 to 50 but skip numbers divisible by 7.

// public class p5 {

//     public static void main(String[] args) {
//         for(int i =1;i<=50;i++){
//             if (i%7==0) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }



///// Print numbers from 1 to 100 but skip numbers ending with digit 5.


// public class p5 {

//     public static void main(String[] args) {
//         for(int i = 1 ; i<=100;i++){
//             if (i%10==5) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


///// Print characters from ‘A’ to ‘Z’ but skip vowels.

public class p5 {

    public static void main(String[] args) {
        for(char ch='A'; ch<='Z';ch++){
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                continue;
            }
            System.out.println(ch);
        }
    }
}






