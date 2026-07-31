package Day22.Final.Methood2;


public class SBI extends RBI {

    void loan() {
        System.out.println("Loan Facility");
    }


        public static void main(String[] args) {

        SBI s = new SBI();

        s.rules();

        s.loan();
    }
}

