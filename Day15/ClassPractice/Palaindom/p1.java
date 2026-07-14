package Day15.ClassPractice.Palaindom;

public class p1 {

    public boolean isPalindrome(int num) {

        int temp = num;
        int reverse = 0;

        while (num > 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (temp == reverse) {
            return true;
        } else {
            return false;
        }
    }
}