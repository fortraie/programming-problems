public class ConcatenationOfArray1929 {

//    LeetCode #1929 - Concatenation of Array

    public int[] getConcatenation(int[] nums) {

        int[] oNums = new int[nums.length * 2];
        int i = 0;
        int j = nums.length;

        while (i != nums.length) {
            oNums[i] = nums[i];
            oNums[j] = nums[i];
            i++;
            j++;
        }

        return oNums;
    }


}
