//Shuffle string
class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[indices.length];
        char a[]=s.toCharArray();
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=a[i];
        }
        return String.valueOf(arr);
    }
}
