package Day22.Staticc;

public class p1 {
    static String college = "PCU";

    String name;

    public  p1(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + " " + college);
    }

    public static void main(String[] args) {

        p1 s1 = new p1("Rameshwar");
        p1 s2 = new p1("Rahul");

        s1.display();
        s2.display();
    }

}
