package Day23.Protected;


/////Same Package
class A {

    protected void display() {
        System.out.println("Hello");
    }
}

public class Demo {

    public static void main(String[] args) {

        A obj = new A();

        obj.display();
    }
}