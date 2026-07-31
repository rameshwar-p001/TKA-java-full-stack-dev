package Day23.Privatee;


//////(Accessing Inside Same Class)

public class Student {

    private int marks = 85;

    public void display() {
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}