class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int low=0;
        int up=0;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=n-1;j>=i;j--){
                up+=matrix[i][j];
            }
        }
        result.add(up);
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                low+=matrix[i][j];
            }
        }
        result.add(low);
        
        return result;
    }
}
