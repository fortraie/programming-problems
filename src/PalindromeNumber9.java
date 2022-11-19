import java.util.Arrays;

public class PalindromeNumber9 {

    /*

    LeetCode #9 - Palindrome Number

    Given an integer x, return true if x is a palindrome, and false otherwise.

     */

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }


    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        if (x < 10) return true;

        int tmp = x;
        int ctr = 0;

        while (tmp != 0) {
            tmp /= 10;
            ctr++;
        }

        int[] ints = new int[ctr];
        tmp = x;

        for (int i = 0; tmp != 0; i++) {
            ints[i] = tmp % 10;
            tmp /= 10;
        }

        int i = 0;
        int j = ints.length - 1;

        while (i < ints.length) {
            if (ints[i] != ints[j]) return false;
            i++;
            j--;
        }

        return true;
    }

}
