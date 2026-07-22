package Day19.B;

public class p2 extends p1 {
    public void home() {
		System.out.println("this is home page of insta");
	}

	public void logout() {
		System.out.println("this is LOGOUT page of insta");
	}

	public static void main(String[] args) {
		p2 i = new p2();
		i.home();
		i.login();
		i.logo();
		i.logout();
	}
}
