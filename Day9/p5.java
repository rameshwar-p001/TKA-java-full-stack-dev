package Day9;

import java.util.Scanner;


//// ATM withdrawal 
// public class p5 {
    
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);

//         System.out.println("Enter Amount that you want to withdraw....");
//         int a=ac.nextInt();
        
//         int balance =100000;

//         if (a<=balance) {
//             if (a % 100 ==0) {  
//                 System.out.println("Transection complete");
//             }
//             else{
//                 System.out.println("Enter valid amount....");
//             }
//         }else{
//             System.out.println("in sufficient Balance ");
//         }
//     }
// }


//// Electricity Bill


// public class p5 {
    
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);

//         System.out.print("Enter Electricity UNITs....");
//         int a=ac.nextInt();
        
//         if (a<=100) {
//             System.out.println("You will pay Rs 5/unit");
//         }else if (a<=200) {
//             System.out.println("You will pay Rs 7/unit");
//         }
//         else{
//             System.out.println(" You will pay Rs 10/unit ");
//         }
//     }

// }


//// Student Grade System


// public class p5 {
    
//     public static void main(String[] args) {
        
//         Scanner ac=new Scanner(System.in);

//         System.out.print("Enter a Marks : ");
//         int a = ac.nextInt();

//         if (a>=40) {
//             if (a>=90) {  
//                 System.out.println("A grade");
//             }else if(a>=75){
//                 System.out.println("B grade");
//             }
//             else{
//                 System.out.println("Grade C ");
//             }
//         }else{
//             System.out.println(" You are fail");
//         }
//     }
// }


//// Online Shopping Discount


// public class p5 {
    
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);

//         System.out.print("Enter Shoping amount...... ");
//         int a=ac.nextInt();
//         System.out.print("Enter that He/She have membership...(y/n)...");
//         char b=ac.next().charAt(0);

//         if (a>=1000) {
//             if (b=='y') {  
//                 System.out.println("You will get 20% Discount");
//             }
//             else{
//                 System.out.println("You will get 10% Discount ");
//             }
//         }else{
//             System.out.println(" You will not get any discount ");
//         }
//     }

// }


//// Age Category + Ticket Price

// public class p5 {
    
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);

//         System.out.print("Enter Your age ...... ");
//         int a=ac.nextInt();

//         if (a>=18) {
//             if (a>=60) {  
//                 System.out.println("You will get senior citizen ticket");
//             }
//             else{
//                 System.out.println("You will get normal ticket  ");
//             }
//         }else{
//             System.out.println(" You will get child ticket  ");
//         }
//     }

// }


// public class p5 {
    
//     public static void main(String[] args) {
        
//         Scanner ac=new Scanner(System.in);

//         System.out.print("Enter a Number : ");
//         int a = ac.nextInt();

//         if (a%3==0 ) {
//             System.out.println("Yes it can Divided by 3");
//         }else if(a%5==0){
//             System.out.println("Yes it can Divided by 5");
//         }
//         else{
//             System.out.println(" No it can not be divided by 3 & 5 ");
//         }
//     }
// }



// Write a program to check login authentication (username and password).

// public class p5 {
    
//     public static void main(String[] args) {
        
//         Scanner ac=new Scanner(System.in);

//         System.out.print("Enter a User-name : ");
//         String a = ac.nextLine();
//         System.out.print("Enter a Password : ");
//         String b = ac.nextLine();

//         if (a.equals("om") ) {
//             if (b.equals("7385614859@Om")) {                  //.equals() --> it is use for compairing the string when we take a user input then it will we use 
//                 System.out.println("Login Sucessfull....");
//             }else{
//                 System.out.println("Invalid password ");
//             }
//         }
//         else{
//             System.out.println("Login faild ");
//         }
//     }
// }


// //Write a program to check whether a person is eligible for a loan.

// public class p5 {
    
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);

//         System.out.print("Enter Your age ...... ");
//         int a=ac.nextInt();
//         System.out.print("Enter Your Salary ...... ");
//         int b=ac.nextInt();

//         if (a>=18 && a<=90) {
//             if (b>=25000) {  
//                 System.out.println("You will get loan ");
//             }
//             else{
//                 System.out.println("You will not get loan  ");
//             }
//         }else{
//             System.out.println(" Enter Valdi age greter than 18 and  less than 90  ");
//         }
//     }

// }


// Write a program to check whether a number is positive and even.

// public class p5 {
    
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);

//         System.out.print("Enter Number  ...... ");
//         int a=ac.nextInt();

//         if (a>0) {
//             if (a%2==0) {  
//                 System.out.println("It is even number and positive number ");
//             }
//             else{
//                 System.out.println("It is positive but not a even number  ");
//             }
//         }else if(a==0){
//             System.out.println("it is 0 not a positive and negative number ");
//         }
//         else{
//             System.out.println(" It is negative number  ");
//         }
//     }

// }


//// Write a program to display day name based on day number (1–7).

// public class p5 {
    
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);

//         System.out.print("Enter Day number for find the day (1-7) ...... ");
//         int a=ac.nextInt();

//         if (a==1) {
//             System.out.println("sunday ");
//         }else if(a==2){
//             System.out.println("Monday ");
//         }else if(a==3){
//             System.out.println("Tuesday ");
//         }else if(a==4){
//             System.out.println("Wednesday ");
//         }else if(a==5){
//             System.out.println("Thrusday ");
//         }else if(a==6){
//             System.out.println("Friday ");
//         }else if(a==7){
//             System.out.println("saturday ");
//         }
//         else{
//             System.out.println(" Enter valid number use only (1-7)  ");
//         }
//     }
// }

// Write a program to check whether a character is vowel, consonant, digit, or special character.
// public class p5 {
    
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);

//         System.out.print("Enter number  ...... ");
//         char ch=ac.next().charAt(0);

//         if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//             System.out.println("Vowel ");
//         }else if(ch>='0' && ch<='9'){
//             System.out.println("It is number ");
//         }else if(!( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') )){
//             System.out.println("It is special symbol ");
//            }
//         else{
//             System.out.println(" It is consonant  and Alphabet  ");
//         }
//     }
// }

////given number are positive or not 


//public class p5 {

//public static void main(String[] args) {
//    int i= -10;
//    if (i>0) {
//        System.out.println("the given input is positive");
//    }
//    if (i<0) {
//        System.out.println("the given input is negative");
//    }
//    if (i==0) {
//        System.out.println("the ans is same ");
//    }
//}
//}

////voting system

//public class p5 {

//public static void main(String[] args) {
//    int a = 5;
//    if (a >=18) {
//        System.out.println("You can vote now ");
//    }
//    else{
//        System.out.println("You can not vote now ");
//    }
//}
//}


////gretter than 100

//public class p5 {

//public static void main(String[] args) {

//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter a number: ");
//    int i = s.nextInt();
   
//    if (i>=100) {
//        System.out.println("The give input is gretter than 100.......");
//    }
//    else{
//        System.out.println("The given input was small than 100");
//    }
//}
//}


////divisible by 5


//public class p5 {
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter Number - ");
   
//    int a =s.nextInt();
//    if (a % 5 == 0) {
//        System.out.println("This Number is Divided by 5..... ");
//    }
//    else{
//        System.out.println("This number is not divided by 5...");
//    }
//}
//}

////upper case or not 

//public class p5 {
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter Character - ");
   
//    char a = s.next().charAt(0);
//    if (a>='A' && a<='Z') {
//        System.out.println("Is uppercase ");
//    }
//    else{
//        System.out.println("Not A upppercase");
//    }
//}
//}

////Wether the number is even or odd

//public class p5 {
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter Number - ");
   
//    int a = s.nextInt();
//    if (a%2==0) {
//        System.out.println("Is even number  ");
//    }
//    else{
//        System.out.println("Is odd number .. ");
//    }
//}
//}

////gretter of two number 

//public class p5 {
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter Number - ");
//    System.out.print("Enter Number - ");
//    int a = s.nextInt();
//    int b = s.nextInt();
//    if (a>b) {
//        System.out.println("A is gretter ..   ");
//    }
//    else{
//        System.out.println("B is gretter .. ");
//    }
//}
//}


////vovel and constant 

//public class p5 {
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter Character - ");
   
//    char a = s.next().charAt(0);
//    if (a=='A' || a=='E' || a=='I' || a=='O' || a=='U' ||  a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
//        System.out.println("Is Vovel ");
//    }
//    else{
//        System.out.println("Is consonant");
//    }
//}
//}


////Divide by 2

//public class p5 {
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter Character - ");
   
//    int a = s.nextInt();
//    if (a%2==0) {
//        System.out.println("It was Divided by 2 ");
//    }
//    else{
//        System.out.println("It was not Divided by 2 ");
//    }
//}
//}


////grettest of 3 number 

//public class p5 {
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter Number 1 - ");
//    int a = s.nextInt();
   
//    System.out.print("Enter Number 2 - ");
//    int b = s.nextInt();

//    System.out.print("Enter Number 3 - ");
//    int c = s.nextInt();

//    if (a>b) {
//        if (a>c) {
//        System.out.println("A is gretter ..   ");
//    }
//     else{
//        System.out.println("C is gretter .. ");
//    }
//    }
//    else{
//        if (b>c) {
//        System.out.println("B is gretter ..   ");
//    }
//     else{
//        System.out.println("C is gretter .. ");
//    }
//    }
//}
//}


////grade base

//public class p5 {
//public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
   
//    System.out.print("Enter Persent - ");
//    int a = s.nextInt();
  
//    if (a>=75) {
//        System.out.println("You are in distinction  ..   ");
//    }
//    else if (a>=60) {
//        System.out.println("You are in First Class  ..   ");
//    }
//    else if (a>=50) {
//        System.out.println("You are in Second Class  ..   ");
//    }
//    else if (a>=35) {
//        System.out.println("You are in Pass   ..   ");
//    }
//    else{
//        System.out.println("You are fail .. ");
//    }
//}
//}