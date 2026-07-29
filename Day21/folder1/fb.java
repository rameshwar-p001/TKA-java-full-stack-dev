package Day21.folder1;

public class fb extends meta {

	@Override
    public void loginAuth(String userName, String password) {
		if (userName == "Ram@123" && password == "ram@123") {
			System.out.println("Login Sucessfull");
		}else{
			System.out.println("Login Faild");
		}
	}

	public void fbHome() {
		System.out.println("Home page of FB .... !");
	}
}
