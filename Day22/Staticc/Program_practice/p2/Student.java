package Day22.Staticc.Program_practice.p2;



// Create a class Student with:
// static variable → collegeName
// non-static → id, name
// method to display details
// Create 3 objects and show how collegeName is same for all.


public class Student {

    static String collegeName = "PCU";

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("College : " + collegeName);
        System.out.println();
    }
}

