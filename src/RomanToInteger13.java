public class RomanToInteger13 {

    /*

    LeetCode #13 - Roman to Integer

    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which
    is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is
    not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX. There are six instances where subtraction
    is used:
    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.

     */

    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));
    }

    public static int romanToInt(String s) {

        char[] input = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case 'M' -> sum += 1000;
                case 'D' -> sum += 500;
                case 'C' -> {
                    if (i + 1 < input.length) {
                        if (input[i + 1] == 'D') {
                            sum += 400;
                            i++;
                        } else if (input[i + 1] == 'M') {
                            sum += 900;
                            i++;
                        } else {
                            sum += 100;
                        }
                    } else sum+= 100;
                }
                case 'L' -> sum += 50;
                case 'X' -> {
                    if (i + 1 < input.length) {
                        if (input[i + 1] == 'L') {
                            sum += 40;
                            i++;
                        } else if (input[i + 1] == 'C') {
                            sum += 90;
                            i++;
                        } else {
                            sum += 10;
                        }
                    } else sum += 10;
                }
                case 'V' -> sum += 5;
                case 'I' -> {
                    if (i + 1 < input.length) {
                        if (input[i + 1] == 'V') {
                            sum += 4;
                            i++;
                        } else if (input[i + 1] == 'X') {
                            sum += 9;
                            i++;
                        } else {
                            sum += 1;
                        }
                    } else sum += 1;
                }
            }
        }

        return sum;
    }

}
