class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();

        //traverse through the array
        for (int i = 0; i < nums.length; i++) {
            //caclulate the complement
            int complement = target - nums[i];

            //check is the complement already present in map
            if (visited.containsKey(complement)) {
                return new int[] { visited.get(complement), i };
            }

            //put the current element to rememeber it
            visited.put(nums[i],i);

        }

        return new int[] { -1, -1 };
    }
}