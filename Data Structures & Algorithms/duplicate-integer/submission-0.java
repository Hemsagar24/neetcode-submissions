class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> res = new HashSet();
        for (int i = 0; i < nums.length; i++) {
           if(res.contains(nums[i])){
            return true;
           }else{
            res.add(nums[i]);
           }
           
        }

        return false;
    }
}