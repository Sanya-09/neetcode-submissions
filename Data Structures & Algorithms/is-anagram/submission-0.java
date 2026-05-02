class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character , Integer> mps = new HashMap<>();
        HashMap<Character , Integer> mpt = new HashMap<>();
        for (char el : s.toCharArray()){
            if(!mps.containsKey(el)){
                mps.put(el,1);
            } else{
                mps.put(el,mps.get(el)+1);
            }
        }
        for (char el : t.toCharArray()){
            if(!mpt.containsKey(el)){
                mpt.put(el,1);
            } else{
                mpt.put(el,mpt.get(el)+1);
            }
        }

        if(mps.equals(mpt)){
            return true;
        } else{
            return false;
        }
    }
}
