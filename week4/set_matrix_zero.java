//set matrix zeros
class Solution {
    public void setZeroes(int[][] matrix) {
       int arr[]=new int[matrix.length];
       int crr[]=new int[matrix[0].length];
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==0){
                   arr[i]=1;
                   crr[j]=1;
               }
           }
       }
       for(int i=0;i<matrix.length;i++){
           if(arr[i]==1){
               for(int j=0;j<matrix[0].length;j++)
                    matrix[i][j]=0;
           }
       }
       for(int i=0;i<matrix[0].length;i++){
           if(crr[i]==1){
               for(int j=0;j<matrix.length;j++)
                    matrix[j][i]=0;
           }
       }
    }
}
