package Day25.p2;

public class Main {
    public static void main(String[] args) {

        Payment p;

		p = new Upi();
		p.pay();
		p = new Card();
		p.pay();
        
    }
}
