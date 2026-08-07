package Day26;


//// StringBuilder & StringBuffer

public class p2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ram");
        sb.append(" Yadav");

        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Shubham");
        sb1.append(" Patil");

        System.out.println(sb1);

        sb1.reverse();

        System.out.println(sb1);
    }
}