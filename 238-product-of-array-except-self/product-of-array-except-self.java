class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int tmp = 1;
        for(int i=0;i<n;i++){
            arr[i] = tmp ; 
            tmp *= nums[i];
        }
        tmp = 1;
        for(int i=n-1;i>=0;i--){
            arr[i] *= tmp;
            tmp *= nums[i];
        }
        return arr;
    }
}