package Day15.ClassPractice.Votingonline;

public class p1 {

    public void vote(int age) {

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}