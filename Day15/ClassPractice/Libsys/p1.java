package Day15.ClassPractice.Libsys;

public class p1 {

    public void issueBook(String bookName, boolean isAvailable) {

        if (isAvailable) {
            System.out.println(bookName + " Book Issued Successfully.");
        } else {
            System.out.println(bookName + " Book is Not Available.");
        }
    }
}