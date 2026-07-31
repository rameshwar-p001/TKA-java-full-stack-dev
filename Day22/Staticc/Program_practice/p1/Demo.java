package Day22.Staticc.Program_practice.p1;

public class Demo {

    public static void main(String[] args) {

        Bank b1 = new Bank(10000);
        Bank b2 = new Bank(20000);

        b1.display();
        b2.display();

        Bank.changeROI(8.5);

        System.out.println();

        b1.display();
        b2.display();
    }
}