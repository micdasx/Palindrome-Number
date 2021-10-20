class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        String novo = "" + x;
        
        for(int i = 0; i < novo.length()/2; i++){
            if(novo.charAt(i) != novo.charAt(novo.length() -i -1)) return false;
        }
        return true;
    }
}