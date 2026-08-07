package Day25.p3;

class Main {
    public static void main(String[] args) {

        Login i = new Instagram();
        i.login("insta", "1234");

        Login f = new Facebook();
        f.login("fb", "5678");
    }
}