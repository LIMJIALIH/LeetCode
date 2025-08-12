class Solution{
    public String gcdOfStrings(String str1,String str2){
        char [] s1 = str1.toCharArray();
        char [] s2 = str2.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(s1.length > s2.length){
            for(char character : s2){
                for(int i = 0 ; i < s1.length ; i++){
                    char current = s1[i];
                    if(current == character){
                        sb.append(current);
                        s1[i] = '';
                        break;
                    }
                }
            }
        }else{

        }
    }
}