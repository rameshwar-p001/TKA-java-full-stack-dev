package Day24.p2;

class Facebook extends Meta {

    void login(String id, String pass) {

        if (id.equals("fb") && pass.equals("5678")) {
            System.out.println("Facebook Login Successful");
        } else {
            System.out.println("Invalid ID or Password");
        }
    }
}