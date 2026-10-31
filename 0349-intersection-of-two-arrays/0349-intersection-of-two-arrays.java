class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //for storing the intersections
        Set<Integer> intersectionSet = new HashSet<Integer>();

        //select the element of fisrt array
        for (int num : nums1) {
            //traverse the nums2 to check the whether seleted eleemnt present  in it.
            for (int n : nums2) {
                if (n == num) {
                    intersectionSet.add(n);
                    break;
                }
            }
        }
        //convert the set into the integer array and return it
        return intersectionSet.stream().mapToInt((k) -> k).toArray();
    }
}