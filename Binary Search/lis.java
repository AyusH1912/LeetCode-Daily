//LeetCode Daily Challenge Problem Jan 5, 2024 
//Problem Link: https://leetcode.com/problems/longest-increasing-subsequence/
//Explanation : https://takeuforward.org/data-structure/longest-increasing-subsequence-binary-search-dp-43/
//Leetcode Medium Problem

class Solution {
    public int lengthOfLIS(int[] nums) { // Approach using Binary Search, the desirable solution in O(nlogn).
        int len = 1;
        List<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > arr.get(arr.size() - 1)) {
                arr.add(nums[i]);
                len++;
            } else { // not using extra space to store the subsequence as we are concerned only about
                     // the length and it will workout.
                int ind = Collections.binarySearch(arr, nums[i]);
                if (ind < 0) {
                    ind = -ind - 1;
                }
                arr.set(ind, nums[i]);
            }
        }
        return len;
    }
}