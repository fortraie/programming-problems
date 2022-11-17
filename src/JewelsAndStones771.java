import java.util.HashSet;

public class JewelsAndStones771 {

    // You're given strings jewels representing the types of stones that are jewels, and stones representing the stones
    // you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have
    // are also jewels.
    //
    // Letters are case-sensitive, so "a" is considered a different type of stone from "A".

    public int numJewelsInStones(String jewels, String stones) {

        if (jewels == null || jewels.length() == 0) return 0;

        int ctr = 0;
        HashSet<Character> jewelSet = new HashSet<>();

        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) ctr++;
        }

        return ctr;

    }

}
