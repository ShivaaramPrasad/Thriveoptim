package dsa.twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AssignCookies_455 {

	/**
	455
https://leetcode.com/problems/assign-cookies/
	 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
 
Example 1:
Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
Example 2:
Input: g = [1,2], s = [1,2,3]
Output: 2
Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
You have 3 cookies and their sizes are big enough to gratify all of the children, 
You need to output 2.
 
Constraints:
1 <= g.length <= 3 * 104
0 <= s.length <= 3 * 104
1 <= g[i], s[j] <= 231 - 1
	 */

	
	
	//@Test
	public void test() {
		int[] greedFactorForEachChild = {2,1,1,1};
		int[] cookieSize = {1,2};
		
		int expectedSatisfiedChild = 2;
		
		Assert.assertEquals(expectedSatisfiedChild, getSatisfiedChilds(greedFactorForEachChild, cookieSize));
		
		
	}
	
		@Test
		public void test1() {
			int[] greedFactorForEachChild = {1,2};
			int[] cookieSize = {1,2,3};
			
			int expectedSatisfiedChild = 2;
			
			Assert.assertEquals(expectedSatisfiedChild, getSatisfiedChilds(greedFactorForEachChild, cookieSize));
			
			
		}
	
	/**
	 *  - initialise satisfiedKids = 0;
	 *  
	 *  - initialize 2 pointers : greed = 0. cookie = 0.
	 *  
	 *  - iterate through 2 arrays until greed < greedFactorForEachChild.length && cookie < cookieSize.length
	 *  
	 *  - check if greedFactor <= cookieSize
	 *  
	 *  	- if yes -> increment satisfiedKids.
	 *  
	 *      - if no ->  check if greedFactor > cookies --> then move cookie
	 * 		
	 * 							else  --> move greed
	 *
	 * 
	 * 	 
	 **/
	

	private int getSatisfiedChilds(int[] greedFactor, int[] cookieSize) {
		   int noOfSatisfiedKids = 0;
			int greed = 0; 
			int cookie = 0;
			while(greed < greedFactor.length && cookie < cookieSize.length) {
				if(greedFactor[greed] <= cookieSize[cookie]) {
					noOfSatisfiedKids++;
					greed++;
					cookie++;
				}
				else if(cookieSize[cookie] < greedFactor[greed]) {
					greed++;
				}
				else {
					cookie++;
				}
			}
			return noOfSatisfiedKids;
	}
	
	private int assignCookies(int[] child, int[] cookie){
        int left=0, right =0;
        Arrays.sort(child);
        Arrays.sort(cookie);
        while(left<child.length && right<cookie.length){
            if(child[left]<=cookie[right]) left++;
            right++;
        }
        return left;
    }
}