package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairs_70 {

    @Test
    public void example1() {
        int n = 2;
        int output = 2;
        Assert.assertEquals(climbStairs(n), output);
    }

    @Test
    public void example2() {
        int n = 3;
        int output = 3;
        Assert.assertEquals(climbStairs(n), output);
    }

    @Test
    public void example3() {
        int n = 1;
        int output = 1;
        Assert.assertEquals(climbStairs(n), output);
    }

    @Test
    public void example4() {
        int n = 4;
        int output = 5;
        Assert.assertEquals(climbStairs(n), output);
    }

    /*
    Traverse from 2 till n
    Add s1 and s2 to temp then s2 to s1 nad temp to s2
    return temp
     */
    public int climbStairs(int n) {

        if(n == 1) return 1;
        if(n == 2) return 2;

        int s1 = 1, s2 = 2, temp = 0;

        for(int i = 2; i < n; i++){
            temp = s1 + s2;
            s1 = s2;
            s2 = temp;
        }
        return temp;
    }

}
