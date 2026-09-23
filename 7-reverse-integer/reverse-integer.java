class Solution {
    public int reverse(int x) {
        boolean s = false;
        if(x<0) {
            x = -x;
            s = true;
        }
        int sum = 0;
        while(x>0){
            if (sum > Integer.MAX_VALUE / 10 ||
               (sum == Integer.MAX_VALUE / 10 && x % 10 > 7)) {
                return 0;
            }
        sum = sum*10 + x%10;
        x/=10;
        
        }
     

        if(s) sum = -sum;
            
         return sum;
        
        
    }
}