class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.containsKey(dif) && i != map.get(dif)) {
                index[0] = i;
                index[1] = map.get(dif);
                return index;
            }
        }
        return index;
    }
}
