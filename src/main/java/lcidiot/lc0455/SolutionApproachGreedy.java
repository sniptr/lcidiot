/**
 * https://leetcode.com/problems/assign-cookies/
 * 
 * Time Complexity: O(Nlg(N))
 * Space Complexity: O(1)
 */
package main.java.lcidiot.lc0455;

import java.util.Arrays;

public class SolutionApproachGreedy {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int ans = 0;
        int greed = 0, candy = 0;
        
        while(greed < g.length && candy < s.length){
            if(g[greed] > s[candy]){
                candy++;
            }else{
                greed++;
                candy++;
                ans++;
            }
        }
        
        return ans;
    }
}