package Day25.p3;

class Instagram implements Login {

    @Override
    public void login(String id, String pass) {

        if (id.equals("insta") && pass.equals("1234")) {
            System.out.println("Instagram Login Successful");
        } else {
            System.out.println("Invalid ID or Password");
        }
    }
}