//Decompress run-length encodedList
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int i=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(i<nums.length){
            for(int j=0;j<nums[i];j++){
                arr.add(nums[i+1]);
            }
            i+=2;
        }
        int ans[]=new int[arr.size()];
        for(int k=0;k<ans.length;k++)
            ans[k]=arr.get(k);
        return ans;
    }
}
