class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int x = 1;
        int y = 1;
        int[] output = new int[n];
        int[] suffix = new int[n];
        int[] prefix = new int[n];


        for(int i = 0; i < n ; i++){
            if(i==0){
                prefix[i] = nums[i];
            } else{
                prefix[i] = prefix[i-1] * nums[i];
            }
        }

        for(int i = n-1; i >= 0 ; i--){
            if(i== n-1){
                suffix[n-1] = nums[n-1];
            } else{
                suffix[i] = suffix[i+1] * nums[i];
            }
        }
        for(int i =0; i <n ; i++){
            if(i==0){
                output[i] = suffix[i+1];
            }
            else if(i==n-1){
                output[i]= prefix[i-1];
            }
            else{
                output[i] = prefix[i-1]*suffix[i+1];
            }
        }
        return output;
    }
}  