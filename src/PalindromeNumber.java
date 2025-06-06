import java.util.Stack;
public class PalindromeNumber {
    public static void main(String[] args) {
        Solution slt = new Solution();
        System.out.print("\n" + slt.isPalindrome(-121));
        System.out.print("\n" + slt.isPalindrome(121));

    }
}

class Solution{
    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }

        int original = x;
        int reversed = 0;

        while(x != 0){
            int digit = x%10;
            reversed = reversed * 10 + digit;
            x = x/10;
        }
        return original == reversed;
//        if(x < 0){
//            return false;
//        }
//        if(x == 0){
//            return true;
//        }
//
//        String rst = "";
//        int store = x;
//
//        while(x > 0){
//            rst += x%10;
//            x = x/10;
//        }
//        int num = Integer.parseInt(rst);
//        if(num == store){
//            return true;
//        }
//        else{
//            return false;
//        }
    }
}
