package Day21.folder1;

public class main {
    
    public static void main(String[] args) {
        
        meta m;

        m=new meta();
        m.loginAuth(null, null);
        
        m =new insta();
		m.loginAuth("ram@gmail.com", "Ram@123");
        // insta i = new insta();
        // i.instaHome();

        m=new fb();
		m.loginAuth("rahul@gmail.com", "Ramesh@123");
        // fb f=new fb();
        // f.fbHome();
    }
}





