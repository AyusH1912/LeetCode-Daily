//LeetCode Daily Challenge Problem Jan 4, 2024 
//Problem Link: https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
//Problem Identification: we have to do minimum no. of operations so we chose to use 3 over 2 and if not divisible by 3 we then count the no of operations by 2 by adding 1 to the ans variable.
//Explanation Video: https://www.youtube.com/watch?v=z5L5xYorZC8&t=360s 

class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int e : nums) {
            hmap.put(e, hmap.getOrDefault(e, 0) + 1);
        }

        // for(Map.Entry<Integer, Integer> e : hmap.entrySet()){ // One Way of iterating
        // values of keys in a Map.
        // int val = e.getValue();
        // if(val == 1)
        // return -1;
        // ans += val/3;
        // if(val % 3 != 0) ans++;
        // }

        for (int val : hmap.values()) { // Another Way of iterating values of keys in a Map.
            if (val == 1) // if value of a key is 1 then simply return as we can't remove from the array
                          // as per the problem statement
                return -1;
            ans += val / 3;
            if (val % 3 != 0)
                ans++; // (val/3 + 1)
        }
        return ans;
    }
}