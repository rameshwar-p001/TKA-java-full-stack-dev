package Day25.p3;

class Facebook implements Login {


    @Override
    public void login(String id, String pass) {

        if (id.equals("fb") && pass.equals("5678")) {
            System.out.println("Facebook Login Successful");
        } else {
            System.out.println("Invalid ID or Password");
        }
    }
}