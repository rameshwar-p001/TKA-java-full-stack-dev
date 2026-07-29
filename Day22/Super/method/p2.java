package Day22.Super.method;

public class p2 extends p1 {
    

    void sound() {
        System.out.println("Dog Bark");
    }

    void show() {

        super.sound();
        super.sound();                    //here we can do this also insted of super
    }




    public static void main(String[] args) {

        p2 p = new p2();
        p.show();
    }

}