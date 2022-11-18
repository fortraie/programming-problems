public class ConcatenationOfArray1929 {


    /*

    LeetCode #1929 - Concatenation of Array

    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and
    ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    Specifically, ans is the concatenation of two nums arrays.
    Return the array ans.

     */


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
