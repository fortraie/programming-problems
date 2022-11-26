public class LongestCommonPrefix14 {

//    LeetCode #14 - Longest Common Prefix

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        int minLength = strs[0].length();
        for (String str : strs) if (minLength > str.length()) minLength = str.length();

        StringBuilder sB = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            char tmp = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != tmp) return sB.toString();
            }
            sB.append(tmp);
        }

        return sB.toString();
    }
}
