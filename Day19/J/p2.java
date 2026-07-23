package Day19.J;

public class p2 extends p1 {

    // 5.Create class A with variable a = 100.
// Class B extends A and doubles the value: b = a * 2.
// Print both values.

     int b=a*2;

    

    public static void main(String[] args) {
        p2 p=new p2();

       System.out.println("Value of a = " + p.a);
        System.out.println("Value of b = " + p.b);
    }
}
