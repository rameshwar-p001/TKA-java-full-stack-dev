package Day23.Protected.Packagee.p2;

import Day23.Protected.Packagee.p1.Animal;

public class p2 extends Animal {

    public void show() {
        sound();    
    }

    public static void main(String[] args) {

        p2 obj = new p2();
        obj.show();
    }
}