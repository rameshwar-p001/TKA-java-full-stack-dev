package Day24.p2;

class Instagram extends Meta {

    void login(String id, String pass) {

        if (id.equals("insta") && pass.equals("1234")) {
            System.out.println("Instagram Login Successful");
        } else {
            System.out.println("Invalid ID or Password");
        }
    }
}