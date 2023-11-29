class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int remainder;
        int original =x;
        while(x>0){
            remainder =x%10;
            reverse=reverse*10+remainder;
            x/=10;
        }

        if(reverse==original){
            return true;
        }
        else{
        return false;
        }
    }
}