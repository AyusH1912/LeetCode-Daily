//LeetCode Daily Challenge Problem Jan 2, 2024 
//Problem Link: https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
//Solved by my own intuition of using a Hashset.

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> hset = new HashSet<>();
        List<Integer> arr = new ArrayList<>();
        for (int e : nums) {
            arr.add(e);
        }
        while (arr.size() != 0) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> ds = new ArrayList<>();

            for (int i = 0; i < arr.size(); i++) {
                hset.add(arr.get(i));
            }

            ds.addAll(hset);
            ans.add(ds);

            for (int i = 0; i < arr.size(); i++) {
                if (hset.contains(arr.get(i))) {
                    hset.remove(arr.get(i));
                } else {
                    temp.add(arr.get(i));
                }
            }
            arr = temp;
        }
        return ans;
    }
}
