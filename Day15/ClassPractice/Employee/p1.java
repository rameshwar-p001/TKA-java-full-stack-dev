package Day15.ClassPractice.Employee;

public class p1 {
    public void csal(double sal){
        double HRA = (sal * 20) / 100;
       double DA = (sal * 10) / 100;
        double ts = sal+DA+HRA;

        System.out.println("The Total salary was of the employee is --> "+ts);
    }
}
