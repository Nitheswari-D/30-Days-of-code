//Reverse words in a string
class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=arr.length-1;i>0;i--)
            sb.append(arr[i]+" ");
        sb.append(arr[0]);
        String answer=sb.toString();
        return answer;
    }
}
