import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray26 {

//    LeetCode #26 - Remove Duplicates from Sorted Array


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 9};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {

        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (offset == 0 || nums[offset - 1] != nums[i]) {
                nums[offset] = nums[i];
                offset++;
            }
        }

        return offset;

    }

}
