/*
Search in a sorted Matrix
Difficulty: MediumAccuracy: 56.27%Submissions: 132K+Points: 4
Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.
Problem Link : https://www.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1
*/
class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        
        //Works on Elimiation check a point where ele dec from left to right and incr from top to btm
        //when element @ that point is < target eliminate col -- row ++ else elemet @ point is > target eleiminate row -- do col--  
        int n =mat.length , m = mat[0].length;
        
        int row = 0 , col = m-1;
        
        while( row < n && col >= 0)
        {
            if(mat[row][col] == x)
            {
                return true;
            }
            else if (mat[row][col] < x)
            {
                row ++;
            }
            else
            {
                col --;
            }
        }
        return false;
    }
}
