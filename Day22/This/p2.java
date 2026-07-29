package Day22.This;

public class p2 {


    void display() {
        System.out.println("Display Method");
    }

    void show() {
        this.display();        
    }

    public static void main(String[] args) {

        p2 s = new p2();
        s.show();
    }

}
