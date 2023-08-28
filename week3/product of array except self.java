//Product of array except self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,pro=1,zero=0;
        int ans[]=new int[n];
        for(int val:nums){
            if(val!=0)
                pro*=val;
            else
                zero++;
        }
        if(zero==n)
            pro=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0 && zero!=0)
                ans[i]=0;
            else if(nums[i]==0){
                if(zero>1)
                    ans[i]=0;
                else
                    ans[i]=pro;
            }
            else if(nums[i]!=0)
                ans[i]=pro/nums[i];
            
        }
        return ans;
    }
}
