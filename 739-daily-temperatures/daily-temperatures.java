class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> set = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!set.isEmpty() && temperatures[i] > temperatures[set.peek()]){
                int ind = set.pop();
                res[ind] = i - ind;
            }
            set.push(i);
        } 
        return res;
    }
}