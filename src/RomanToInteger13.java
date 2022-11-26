public class RomanToInteger13 {

//    LeetCode #13 - Roman to Integer

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
