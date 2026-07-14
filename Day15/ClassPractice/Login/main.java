package Day15.ClassPractice.Login;

import java.util.Scanner;

public class main {
     public static void main(String[] args) {
         Scanner cs =new Scanner(System.in);

        System.out.print("Enter User name  -> ");
        String username= cs.nextLine();       
        
        System.out.print("Enter User Password  -> ");
        String password= cs.nextLine();        
    
        p1 p=new p1();
        System.out.println(p.lo(username, password));
    }  
}
