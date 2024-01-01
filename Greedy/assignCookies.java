//LeetCode Daily Challenge Problem Jan 1, 2024 
//Problem Link: https://leetcode.com/problems/assign-cookies/
//Explanation in Ayushi Sharma's YT Channel

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        if (s.length == 0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
                j++;
                ans++;
            } else if (g[i] > s[j])
                j++;
        }
        return ans;
    }
}