//LeetCode Daily Challenge Problem Jan 2, 2024 
//Problem Link: https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
//Solved by my own intuition of using a Hashset and HashMap.
//HashMap explanation in Ayushi Sharma's YT Channel

class Solution { // Using HashSet
    public List<List<Integer>> findMatrix(int[] nums) {
        // List<List<Integer>> ans = new ArrayList<>();
        // Set<Integer> hset = new HashSet<>();
        // List<Integer> arr = new ArrayList<>();
        // for (int e : nums) {
        // arr.add(e);
        // }
        // while (arr.size() != 0) {
        // List<Integer> temp = new ArrayList<>();
        // List<Integer> ds = new ArrayList<>();

        // for (int i = 0; i < arr.size(); i++) {
        // hset.add(arr.get(i));
        // }

        // ds.addAll(hset);
        // ans.add(ds);

        // for (int i = 0; i < arr.size(); i++) {
        // if (hset.contains(arr.get(i))) {
        // hset.remove(arr.get(i));
        // } else {
        // temp.add(arr.get(i));
        // }
        // }
        // arr = temp;
        // }
        // return ans;

        // Using HashMap
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i : nums) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        while (!hmap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> removeArr = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
                int ele = entry.getKey();
                int count = entry.getValue();
                temp.add(ele);
                count--;
                if (count == 0) {
                    removeArr.add(ele);
                }
                hmap.put(ele, count);
            }
            ans.add(temp);
            for (int i : removeArr) {
                hmap.remove(i);
            }
        }
        return ans;
    }
}
