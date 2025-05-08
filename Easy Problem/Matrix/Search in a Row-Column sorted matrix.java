/*
Search in a Row-Column sorted matrix
Difficulty: EasyAccuracy: 41.62%Submissions: 174K+Points: 2Average Time: 15m
Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x,
the task is to find whether element x is present in the matrix.
Problem Link : https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1
*/
class Solution 
{
    public static boolean matSearch(int mat[][], int x) 
    {
        for( int i = 0 ;i < mat.length;i++)
        {
            for( int j = 0; j < mat[0].length;j++)
            {
                if(mat[i][j]==x)
                {
                    return true;
                }
            }
        }
        return false;
        
        
    }
}

/*Binary search approch TC: O(log ( n* m))
// Flatten 2d mat to 1d hypothetically / imagine
        int m = mat.length , n = mat[0].length;
        int low = 0 ; high = n * m -1;
        
        while(low <= high)
        {
            int mid = (row +col) / 2;
            
            // match mid -- index of 1d to 2d coordinates
            row = mid / m ;
            col = mid % m;
            
            // if target found return true
            if(mat[row][col] == x)
                {
                    return true;
                }
                 // if target not found trim search space
            else if( mat[row][col] < x)
            {
                low = mid +1;
            }
            else
            {
                high = mid -1;
            }
        }
        //when target not found return false
        return false;*/
