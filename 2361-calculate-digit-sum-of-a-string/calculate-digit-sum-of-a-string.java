class Solution {
    public String digitSum(String s, int k) {
        return rec(s,k);
    }
    public String rec(String s , int k){
        if(s.length() <= k){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int sum=s.charAt(0) -'0';
        for(int i=1;i<s.length();i++){
            sum += s.charAt(i) - '0';
             
            if((i+1)%k == 0){
                
                sb.append((sum));
                sum = 0;    
            }
        }
   
        if (s.length() % k != 0) {
            sb.append(sum);
        }  
        System.out.println(sb); 
        return  rec( sb.toString(),k);

    }
}