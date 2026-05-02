class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> st = new HashSet<>();
       for(int el : nums){
        if(st.contains(el)){
            return true;
        }
        st.add(el);
       }
       return false;
    }
}