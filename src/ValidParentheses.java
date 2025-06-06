import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "((";
        System.out.println("\n" + solution.isValid(s)); // Output: true
    }
}

class Solution{
    public boolean isValid(String s){
        Stack <Character> st = new Stack<>();
        if(s.length()%2 != 0) return false;
        
        for(char c : s.toCharArray()){
            if(c == '(') st.push(')');
            else if(c == '{') st.push('}');
            else if(c == '[') st.push(']');
            else if(st.isEmpty() || st.pop() != c) return false;
        }

        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
