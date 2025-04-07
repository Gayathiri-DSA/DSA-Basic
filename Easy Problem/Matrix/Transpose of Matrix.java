/*
Transpose of Matrix
Difficulty: Easy Accuracy: 66.5% Submissions: 108K+ Points: 2 Average Time: 20m
Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.
Problem Link : https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1?page=1&category=Matrix&difficulty=Easy,Medium,Hard&sortBy=submissions
*/
class Solution 
{
    public void transpose(int n, int mat[][]) 
    {
        //Transpose -- > converting row to cols
        
        int x = mat.length;
        for(int i=0;i<x;i++)
        {
            for(int j=i;j<x;j++)
            {
                // Swapping of row col to col row using temp thitd var
                int temp = 0;
                temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i] = temp;
            }
        }
        
    }
}
