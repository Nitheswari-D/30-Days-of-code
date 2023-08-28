//Roman to Int
class Solution {
    public int romanToInt(String s) {
        int rton=0;
        int arr[]=new int[100];
        arr['I']=1;arr['V']=5;arr['X']=10;arr['L']=50;arr['C']=100;arr['D']=500;arr['M']=1000;
        for(int i=s.length()-1;i>=0;i--){
            if(4*arr[s.charAt(i)]<rton)
                rton-=arr[s.charAt(i)];
            else
                rton+=arr[s.charAt(i)];
        }
        return rton;
    }
