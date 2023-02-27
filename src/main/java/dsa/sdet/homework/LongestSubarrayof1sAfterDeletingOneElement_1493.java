package dsa.sdet.homework;

public class LongestSubarrayof1sAfterDeletingOneElement_1493 {
	
	
	
    public int longestSubarray(int[] nums) {
    int left = 0, right = 0, maxLength = 0, numZeros = 0;
    while (right < nums.length) {
        if (nums[right] == 0) {
            numZeros++;
        }
        while (numZeros > 1) {
            if (nums[left] == 0) {
                numZeros--;
            }
            left++;
        }
        maxLength = Math.max(maxLength, right - left);
        right++;
    }
    return maxLength;
}
}