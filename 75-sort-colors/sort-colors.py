class Solution:
    def swap(self,nums : list[int],left : int , right : int) -> None :
        tmp = nums[left]
        nums[left] = nums[right]
        nums[right] = tmp

    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=0
        mid = 0
        end = len(nums)-1
        while mid <= end :
            if nums[mid] == 0:
                self.swap(nums,i,mid)
                mid+=1
                i+=1
            elif nums[mid] == 2:
                self.swap(nums,mid,end)
                end-=1
            else :
                mid+=1



        