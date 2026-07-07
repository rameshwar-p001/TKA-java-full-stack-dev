package Day12_Pattern;

// public class p4 {
//     public static void main(String[] args) {
        
//         int num=6;
//         int count=0;
//         for(int i=1;i<=num;i++){
//             if(num % i ==0){
//                 count++;
//             }
//         }
//         if (count==2) {
//             System.out.println("prime number ");
//         }else{
//             System.out.println("not prime");
//         }

//     }
// }




// public class p4 {

//     public static void main(String[] args) {
//         int a=153;

//         int b=a;
//         int sum=0;
//         while (b>0) {
//             int r=b%10;
//             sum = sum +(r*r*r) ;
//             b=b/10;
//         }
//         if (a==sum) {
//             System.out.println("Armstron number ");
//         }else{
//             System.out.println("Not a armstron");
//         }
//     }
// }




//// fibonicic 
/// 

// public class p4 {

//     public static void main(String[] args) {
        
//         int a=0;
//         int b=1;
//         int sum=0;
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=1;i<=10;i++){
            
//             sum=a +b;
//             System.out.println(sum);
//             a=b;
//             b=sum;
//         }
//     }
// }


//// palaindrom
/// 

public class p4 {

    public static void main(String[] args) {
        
        int i=101;
        int a=i;
        int r=0;
        while (a>0) {
           int b= a %10;
            r =r*10+b;
            a=a/10;
             
        }
        if (i==r) {
            System.out.println("paliandrom");
        }else{
            System.out.println("non palaindrom");
        } 
       
    }
}