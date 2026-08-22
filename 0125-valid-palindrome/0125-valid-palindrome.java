class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder("");
        StringBuilder rev= new StringBuilder("");
        s= s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                rev.append(s.charAt(i));
            }
        }
        if(rev.toString().equals(sb.toString())){
            return true;
        }
        else{
            return false;
        }
        
        
        
    }
}