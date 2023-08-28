//sqrt(x)
class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
            return x;
        int val=0;
        for(val=1;val<=x/val;val++){
            if(x/val==val)
                return val;
        }
        return val-1;
    }
}
