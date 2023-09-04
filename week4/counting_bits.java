//counting bits
class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
           arr[i]=setbitcount(i);
        }
        return arr;
    }
    public int setbitcount(int n){
        if(n==0)
            return 0;
        else
            return (n&1)+setbitcount(n>>1);
    }
}
