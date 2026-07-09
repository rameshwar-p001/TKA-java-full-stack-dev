package Day14.practiceque.Student;

public class main {
    public static void main(String[] args) {

        System.err.println("--------------student 1--------------");
        p1 p = new p1();

        p.marks = 89;
        p.name = "Rameshwar";
        p.rollNo = 52;

        p.display();

        System.err.println("--------------student 2--------------");

        p1 r = new p1();

        r.marks = 65;
        r.name = "Om";
        r.rollNo = 53;

        r.display();

    }
}
