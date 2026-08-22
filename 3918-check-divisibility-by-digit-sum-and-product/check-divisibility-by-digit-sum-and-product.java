class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0,num = n;
        int pro = 1;
        while(num >0){
            int r = num%10;
            sum += r;
            pro *= r;
            num /= 10; 
        }
        int s = sum + pro;
        if(n%s==0) return true;
        else return false;
    }
}