package Day15.ClassPractice.Maxno;

public class p1 {

    public int findMax(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}