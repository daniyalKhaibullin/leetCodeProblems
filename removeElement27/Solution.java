class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int leftPointer = 0;
        int RightPointer = 0;
        while(RightPointer < nums.length){
            if(nums[RightPointer] == val){
                RightPointer++;
                k++; 
                continue; 
            }
            else if(nums[RightPointer] != val){
                nums[leftPointer] = nums[RightPointer];
                leftPointer++;
                RightPointer++; 
            }
        }
        return nums.length-k;
    }
}
