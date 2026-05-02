class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            mp.put(nums[i] ,i);
        }

        for(int j = 0 ; j < nums.length; j++){
            int complement = target - nums[j];
            if(mp.containsKey(complement) && mp.get(complement) != j){
                return new int[]{j , mp.get(complement)};
            }
        }
        return new int[0];
    }
}
