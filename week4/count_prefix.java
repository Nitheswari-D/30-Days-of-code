//count prefix of given string
class Solution {
    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        arr[0]=start+2*0;
        int val=arr[0];
        for(int i=1;i<n;i++){
            arr[i]=start+2*i;
            val^=arr[i];
        }
        return val;
    }
}
