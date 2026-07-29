package Day22.This;

public class p1 {

    String n;

    public void setName(String name) {
        this.n = name;
    }

    public void display() {
        System.out.println("Name = " + this.n);
    }

    public static void main(String[] args) {

        p1 s = new p1();
        s.setName("Rameshwar");
        s.display();
    
}
}
