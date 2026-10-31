class Solution {
    public void moveZeroes(int[] nums) {
        //index to track the places to place the element
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            //if the element is non-zero
            if (nums[i] != 0) {
                //place the element on index and increment the index
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}