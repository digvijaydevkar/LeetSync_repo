class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
         max = Math.max(nums[i],max);
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=k;i<=max+k;i+=k){
            if(!map.containsKey(i)) return i;
        }
        return -1;
    }
}