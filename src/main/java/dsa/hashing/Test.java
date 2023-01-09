package dsa.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.IntStream;

import org.junit.Assert;

public class Test {
	
	/**
     * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
     *
     * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
     *
     * Share your screen full not a specific window
     * ends sharp at 3.50 PM
     */

    /**
     * We need solution in,
     * 1. Pseudocode  (commented)
     * 2. Testdata (commented)
     * 3. Brute force  (commented)
     * 4. Algorithm solution
     */
/**
 * Team, as said please do solve in leetcode. all the sections needed can be in comment section
 */
    /**
     *
     * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
     *
     * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
     *
     * The tests are generated such that there is exactly one solution. You may not use the same element twice.
     *
     * Your solution must use only constant extra space.
     *
     *
     *
     * Example 1:
     *
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     * Example 2:
     *
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
     * Example 3:
     *
     * Input: numbers = [-1,0], target = -1
     * Output: [1,2]
     * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
     *
     *
     * Constraints:
     *
     * 2 <= numbers.length <= 3 * 104
     * -1000 <= numbers[i] <= 1000
     * numbers is sorted in non-decreasing order.
     * -1000 <= target <= 1000
     * The tests are generated such that there is exactly one solution.
     */
    @org.junit.Test
    public void test1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expected = {1,2};
        Assert.assertArrayEquals(expected, getIndicesMatchingTargetAsSum(nums,target));
    }

    public void test2(){
        int[] nums = {2,7,11,15};
        int target = 8; //error expected as target doesnt matching
        getIndicesMatchingTargetAsSum(nums,target);
    }

    public void test3(){
        int[] nums = {-11,-1,0,2};
        int target = -9;
        int[] expected = {1,4};
        Assert.assertArrayEquals(expected, getIndicesMatchingTargetAsSum(nums,target));
    }

    @org.junit.Test
    public void test4(){
        int[] nums = {2,5,11,15,17};
        int target = 16;
        int[] expected = {2,3};
        Assert.assertArrayEquals(expected, getIndicesMatchingTargetAsSum(nums,target));
    }

    private int[] getIndicesMatchingTargetAsSum(int[] numbers, int target) {

        int start = 0;  //1
        int end = numbers.length-1;
        int[] output = new int[2];


        while(start < end){  // o[n]
            int sum = 0;
            sum +=  numbers[start] + numbers[end];
            if(sum == target) {
                output[0] = start+1;
                output[1] = end+1;
                break;
            }
            else if (sum < target) start++;
            else end--;
        }

        return output;
    }

    @org.junit.Test
    public void test(){

        int input = 11;
        int[] output = {2,9};
        getNoZeroIntegers(input);
    }

    public int[] getNoZeroIntegers(int n) {
        if(n < 10) return new int[] {1, n-1};
        int[] output = new int[2];
        for(int i = 1; i < n; i++){
            if(!checkZeros(i)  && !checkZeros(n-i)) {

                output[0] =i;
                output[1] =n-i;
            }
        }
        return output;
    }


    public boolean checkZeros(int num){

        while(num>0){
            int digit=num%10;
            if(digit==0) return true;
            num=num/10;
        }

        return false;
    }



    @org.junit.Test
    public void test5(){
        int[] nums = {1,2,0,1,2,0};
        sortNonDecrOrder(nums);
    }

    private void sortNonDecrOrder(int[] nums){

        for(int i = 0; i < nums.length-1;i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }

            }
        }
       System.out.println( Arrays.toString(nums));
    }


    @org.junit.Test
    public void testDF(){
        int[] nums = {1,3,0,5,4,9,8};
        System.out.println(Arrays.toString(nums));
        sortByDutchFlag(nums);
    }

    private void sortByDutchFlag(int[] nums){
        int lowIndex = 0;
        int middleIndex = 0;
        int highIndex = nums.length-1;

        int lowValue = 0;
        int highValue = 0;
        int midValue = nums.length/2;

        for(int i = 0; i < nums.length; i++){
            lowValue = Math.min(lowValue, nums[i]);
            highValue = Math.max(highValue, nums[i]);
        }

        while(middleIndex < highIndex){
            if(nums[middleIndex] >= lowValue && nums[middleIndex]  < midValue)
            {
                int temp = nums[lowIndex];
                nums[lowIndex] = nums[middleIndex];
                nums[middleIndex] = temp;
                middleIndex++;
                lowIndex++;
            }
           else if(nums[middleIndex] <= highValue && nums[middleIndex]  > midValue)
            {
                int temp = nums[highIndex];
                nums[highIndex] = nums[middleIndex];
                nums[middleIndex] = temp;
                middleIndex++;
                highIndex--;
            }
           else
               middleIndex++;

        }

        System.out.println(Arrays.toString(nums));
    }

    @org.junit.Test
    public void twoSumHashing(){
        int[] nums = {2,4,5,8,3,6,7};
        int target = 15;
        System.out.println(Arrays.toString(returnEltsSummingUpTarget(nums,target)));
        System.out.println(Arrays.toString(returnIndicesOfEltsSummingUpTarget(nums,target)));
        System.out.println(Arrays.toString(returnEltsSummingUpTargetHashSet(nums,target)));
    }

    private int[] returnIndicesOfEltsSummingUpTarget(int[] nums, int target){

        int[] output = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    /*    for(int i = 0; i < nums.length; i++){
            map.put( nums[i], i);
        }
    */
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                output[0] = map.get(target - nums[i]);
                output[1] = i;
            }
            else
                map.put(nums[i],i);
        }
        return output;

    }


    private int[] returnEltsSummingUpTarget(int[] nums, int target){

        int[] output = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    /*    for(int i = 0; i < nums.length; i++){
            map.put( nums[i], i);
        }
    */
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                output[0] = target - nums[i];
                output[1] = nums[i];
            }
            else
                map.put(nums[i],i);
        }
        return output;

    }


    private int[] returnEltsSummingUpTargetHashSet(int[] nums, int target){

        int[] output = new int[2];

        HashSet<Integer> set = new HashSet<Integer>();

    /*    for(int i = 0; i < nums.length; i++){
            map.put( nums[i], i);
        }
    */
        for(int i = 0; i < nums.length; i++){
            if(set.contains(target - nums[i])){
                output[0] = target - nums[i];
                output[1] = nums[i];
            }
           else
               set.add(nums[i]);
        }
        return output;

    }

    /**
     *
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     * Constrains: s and t consist of lowercase English letters.
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     */

    @org.junit.Test
    public void testAnagrams(){
        String s = "anagram";
        String t = "nagaram";
        Assert.assertTrue(isAnagram(s,t));
    }

    private boolean isAnagram(String s, String t){
            if(s.length() != t.length()) return false;

            int[] sChars = new int[26];
            int[] tChars = new int[26];

            for(int i = 0; i < s.length(); i++){
                sChars[s.codePointAt(i) - 'a']++;
               // sChars[t.codePointAt(i)- 'a']--;
                tChars[t.codePointAt(i)-'a']++;
            }

         //   if(sChars.equals(new int[128])) return true;
      //  if(sChars.equals(tChars)) return true;
        // return Arrays.equals(sChars,tChars);
        return IntStream.of(sChars).allMatch(n -> n == 0);
    }

}


