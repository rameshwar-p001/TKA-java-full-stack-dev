package Day26;

////String Literal, SCP, ==, equals(), new String(), and immutability.

public class p1 {
    public static void main(String[] args) {

        // String Literal - SCP
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        // Object Creation - Heap
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        // Immutable
        String str5 = "Ram";
        String str6 = str5.concat(" Yadav");

        System.out.println(str5);
        System.out.println(str6);
    }
}






/*"Hello"              → SCP
new String("Hello")  → Heap

==       → compares reference
equals() → compares content

String → Immutable
concat() → creates a new String */