package Day22.Staticc.Program_practice.p3;


// Create program:
// Outer class
// static nested class
// method inside nested class prints a message
// Call nested class method from main.

public class Outer {

    static class Inner {

        void show() {
            System.out.println("Hello from Static Nested Class");
        }
    }
}

