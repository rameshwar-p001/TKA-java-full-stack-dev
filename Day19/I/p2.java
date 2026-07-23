package Day19.I;

public class p2 extends p1 {
    
    public void drive(){
        System.out.println("car drive ");
    }

    public static void main(String[] args) {
        
        p2 p= new p2();
        p.start();
        p.drive();
    }
}
