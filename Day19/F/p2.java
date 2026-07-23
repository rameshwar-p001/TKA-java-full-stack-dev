package Day19.F;

public class p2 extends p1 {
    
    public void showB(){
        System.out.println("Hellooo from b ");
    }

    public static void main(String[] args) {
        
        p2 p=new p2();

        p.showA();
        p.showB();

    }
}
