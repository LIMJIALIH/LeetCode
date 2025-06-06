import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution3 {
    public int lengthOfLongestSubstring(String s){
        Set<Character> hashset = new HashSet<>();
        int maxlength = 0;
        int left = 0;

        for(int right = 0 ; right<s.length() ; right++){
            char character = s.charAt(right);
            if(!hashset.contains(right)){
                hashset.add(character);
                maxlength = Math.max(maxlength, right - left + 1);
            }else{
                while(hashset.contains(character)){
                    hashset.remove(s.charAt(left));
                    left++;
                }
                hashset.add(character);
            }
        }
        return maxlength;
    }
}

