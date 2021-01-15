public class Solution {
    /**
     * Given an array of integers. Find the minimum sum which is obtained from summing each Two integers product .
     *
     * Notes:
     * - Array/list will contain positives only.
     * - Array/list will always has even size.
     */
    public static int minSum(int[] passed) {
        if (passed.length == 0)
            return 0;

        int min = 0;

        java.util.Arrays.sort(passed);
        for (int i = 0; i < passed.length / 2; i++) {
            min += passed[i] * passed[passed.length - i - 1];
        }
        return min;
    }
}