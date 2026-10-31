class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //store the nums1 into set to ensure lookup in constant time
        Set<Integer> numsSet = new HashSet<>();

        for(int num:nums1){
            numsSet.add(num);
        }
        
        //store the intercetion
        Set<Integer> resultSet = new HashSet<>();

        //check each element is common in both or not
        for(int num:nums2){
            if(numsSet.contains(num)){
                //common found!,add it to result it!
                resultSet.add(num);
            }
        }
        
        return resultSet.stream().mapToInt(k->k).toArray();

    }
}