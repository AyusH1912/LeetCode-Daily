//LeetCode Daily Challenge Problem Jan 3, 2024 
//Problem Link: https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0; // previous row
        int res = 0; // final result return
        for (String s : bank) {
            int curr = 0; // current row
            for (char c : s.toCharArray()) {
                if (c == '1')
                    curr++;
            }
            if (curr > 0) {
                res += prev * curr; // product of no. of devices in prev and curr = no. of laser beams
                prev = curr; // curr becomes prev row
            }
        }
        return res;
    }
}
