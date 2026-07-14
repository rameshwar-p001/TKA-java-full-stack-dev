package Day15.ClassPractice.Bank;


///// Bank Interest
//// Method calculateInterest(double principal, double rate, int time).

public class p1 {

    public double calculateInterest(double principal, double rate, int time){
       double interest = (principal * rate * time) / 100;

       return interest;
    }
    
} 