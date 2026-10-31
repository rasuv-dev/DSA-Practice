class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //track the maximum consecutive ones found so far
        int max = 0;
        //count the current consecutive ones
        int count = 0;

        //traverse the array to find max consecutive ones
        for(int num : nums){
            //1 is discovered
            if(num ==1){
                //increamsent the current consecutive ones count
                count++;
            }else{
                //we encounted the zero so reset the current consectuve count
                count = 0;
            }

            //track the max number of consectuvie ones found so far
            max = Math.max(max,count);
        }

        //return the max number of consectuive ones
        return max;
    }
}