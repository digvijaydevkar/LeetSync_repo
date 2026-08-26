class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int chcnt=0,rem=money;
        for(int ch : prices){
            if(chcnt == 2 || rem <0) break;
            if(ch <= rem){
                rem -= ch;
                chcnt++;
            }
            if(rem < ch) break;
        }
        if(chcnt == 2) return rem;
        else return money;
    }
}