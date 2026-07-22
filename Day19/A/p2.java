package Day19.A;

public class p2 extends p1 {

    public void a(){
        System.out.println("helloooo from b class");
    }

    public static void main(String[] args) {
        p2 p=new p2();
        p.p();
        p.a();
    }
    
}
