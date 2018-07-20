class Solution {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x == 0){
            return true;
        }
        int res = 0;
        int y = x;
        while(x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
            System.out.println(res);
        }
        if(res == y){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    	System.out.println(isPalindrome(121));
    	
    }
}