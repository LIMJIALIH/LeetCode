public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "ABCDEF";
        String str2 = "ABC";
        System.out.println("\n" + solution.gcdOfStrings(str1, str2)); // Output: "ABC"
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1 + str2).equals(str2 + str1) == false){
            return "";
        }
        int count = 0;
        for(int i = 1 ; i <= str1.length() ; i++){
            if(str1.length() % i == 0 && str2.length() % i ==0){
                count = i;
            }
        }
        return str1.substring(0, count);
    }
}