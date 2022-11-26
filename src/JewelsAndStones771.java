import java.util.HashSet;

public class JewelsAndStones771 {

//    LeetCode #771 - Jewels and Stones

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
