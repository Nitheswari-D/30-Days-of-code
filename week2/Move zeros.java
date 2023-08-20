//Move zeros
class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0,val=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0)
                arr[val++]=nums[i];
        }
        for(int i=0;i<zeros;i++)
            arr[val++]=nums[i];
        for(int i=0;i<nums.length;i++)
            nums[i]=arr[i];
    }
}
