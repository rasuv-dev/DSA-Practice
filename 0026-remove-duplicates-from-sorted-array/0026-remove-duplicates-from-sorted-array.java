class Solution {
    public int removeDuplicates(int[] nums) {
        //to store the unique elements 
        ArrayList<Integer> list = new ArrayList<>();

        //traverse the array to collect the unique elements.
        for (int num : nums) {
            //if list is empty add the first element in it
            if (list.size() == 0) {
                list.add(num);
                continue;
            }
            if (num != list.get(list.size() - 1)) {
                list.add(num);
            }
        }

        //length/count of the unique elements
        int k = list.size();

        //place the unique elements in the original array
        for (int i = 0; i < k; i++) {
            nums[i] = list.get(i);
        }

        return k;
    }
}