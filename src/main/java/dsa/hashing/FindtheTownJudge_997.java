package dsa.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindtheTownJudge_997 {

	/*
	 997. Find the Town Judge
In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

Example 1:

Input: n = 2, trust = [[1,2]]
Output: 2
Example 2:

Input: n = 3, trust = [[1,3],[2,3]]
Output: 3
Example 3:

Input: n = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1

Approch 1

  -
	 */


	public void findJudge(int n, int[][] trust) {

		HashMap<Integer,List<Integer>> map1= new  HashMap();


		for (int i = 0; i < trust.length; i++) {
            List<Integer> integers = map1.getOrDefault(trust[i][0],new ArrayList<>());
            integers.addAll(Arrays.asList(trust[i][1]));
            map1.put(trust[i][0], integers);
        }
	 List<List<Integer>> collect = map1.values().stream().collect(Collectors.toList());
			
			
		
	}
}
