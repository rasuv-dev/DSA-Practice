class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //store the nums1 into set to ensure lookup in constant time
        Set<Integer> numsSet = new HashSet<>();

        int n = nums1.length;
        int m = nums2.length;

        if (n < m) {
            for (int num : nums1) {
                numsSet.add(num);
            }
        } else {
            for (int num : nums2) {
                numsSet.add(num);
            }
        }

        //store the intercetion
        Set<Integer> resultSet = new HashSet<>();

        //check each element is common in both or not
        for (int num : (( n<m) ? nums2:nums1)) {
            if (numsSet.contains(num)) {
                //common found!,add it to result it!
                resultSet.add(num);
            }
        }

        return resultSet.stream().mapToInt(k -> k).toArray();

    }
}