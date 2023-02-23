package dsa.sdet.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class DistributeCandies_575 {
	
	 @Test
	    public void test1() {
	        int[] candyType = {1,1,2,2,3,3};
	        int output = 3;
	        Assert.assertEquals(output, distributeCandiesmy(candyType));
	    }

	    @Test
	    public void example2() {
	        int[] candyType = {1,1,2,3};
	        int output = 2;
	        Assert.assertEquals(output, distributeCandiesmy(candyType));
	    }

	    @Test
	    public void example3() {
	        int[] candyType = {6,6,6,6};
	        int output = 1;
	        Assert.assertEquals(output, distributeCandiesmy(candyType));
	    }
	    public int distributeCandiesmy(int[] candyType) {
	    	Set<Integer> set =new HashSet<>();
	    	for (int i : candyType) {
				set.add(i);
			}
	    	//max n/2;
	    	//set.size()
	        
	        return Math.min(candyType.length/2,set.size());
	   
	    }
	    
	    /*  Pseudo code:
	     - Create a hashmap and add all elements with teh frequency count
	     - if the map size >= array length/2 then return array length/2
	     - return map size by default
	     */
	    public int distributeCandies(int[] candyType) {

	        int n = (candyType.length)/2;
	        HashMap<Integer, Integer> map = new HashMap<>();

	        for(int candy : candyType) {
	            if(map.containsKey(candy)) {
	                map.put(candy, map.getOrDefault(candy, 0) +1);
	            }
	            else
	                map.put(candy,1);
	        }

	        if(map.size() >= n) return n;

	        return map.size();
	    }
}
