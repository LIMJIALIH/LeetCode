import java.util.HashMap;

//public class RomanToInteger {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        String romanNumeral = "CCCI";
//        int result = solution.romanToInt(romanNumeral);
//        System.out.print("\nThe integer value of " + romanNumeral + " is: " + result);
//    }
//}

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanToIntMap.get(s.charAt(i));

            if (i < s.length() - 1) {
                int nextValue = romanToIntMap.get(s.charAt(i + 1));
                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    i++;
                    continue;
                }
            }

            result += currentValue;
        }

        return result;
    }
}

//Another Solution
/*
class Solution{
    public int romanToInt(String s){
        int pValue = 0;
        int value = 0;
        int result = 0;
        for(int i = s.length()-1 ; i>=0 ; i--){
            char c = s.charAt(i);
            switch(c){
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }
            if(pValue > value){
                result -= value;
            }else{
                result += value;
            }
            pValue = value;
        }
        return result;
    }
}
 */