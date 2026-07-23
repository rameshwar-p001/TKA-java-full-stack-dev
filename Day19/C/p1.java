package Day19.C;



//// Single level final keyword

public final class p1 {
    private p1() {
        System.out.println("Google Sensitive info");
    }

    public void m1() {
        System.err.println("This is google related code ");
    }
}
