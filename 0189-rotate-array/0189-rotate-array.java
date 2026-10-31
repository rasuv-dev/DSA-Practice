class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        //length of array
        int n = nums.length;

        //array to remember the last k elemenents
        int[] lastKElements = new int[k];

        //store the last k elements
        for (int i = 0; i < k; i++) {
            lastKElements[i] = nums[n - k + i];
        }

        //track the index to place the element
        int index = n - 1;
        //shift the rest left element to right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[index--] = nums[i];
        }

        //place the last element of array on proper positions
        for (int i = 0; i < k; i++) {
            nums[i] = lastKElements[i];
        }
    }
}