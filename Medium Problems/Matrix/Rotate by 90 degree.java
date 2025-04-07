/*
Rotate by 90 degree
Difficulty: Medium Accuracy: 66.8% Submissions: 62K+ Points: 4 Average Time: 20m
Given a square mat[][]. The task is to rotate it by 90 degrees in clockwise direction without using any extra space. 
Problem Link : https://www.geeksforgeeks.org/problems/rotate-by-90-degree0356/1
*/

class GFG {
    static void rotate(int mat[][]) {
        // Idea : Do Transpose first then Reversing will give rotated arr without any extra space
        int n=mat.length;
        
        // Step 1: Transpose the matrix (convert rows to columns)
        // 1.Transpose 
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp =0;
                // Swap elements at (i,j) with (j,i)
                temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        // 2. Reverse each row (to get the final rotated matrix)
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp = 0;
                // Swap elements in the row from start to end
                temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j]=temp;
                
            }
        }
    }
}

/*Note:

Original matrix :
1 2 3
4 5 6
7 8 9


Swap mat[i][j] with mat[j][i] (only for j >= i to avoid double swapping):

i=0, j=1 → swap(mat[0][1], mat[1][0]) → 2, 4 → mat[0][1]=4, mat[1][0]=2  
i=0, j=2 → swap(mat[0][2], mat[2][0]) → 3, 7 → mat[0][2]=7, mat[2][0]=3  
i=1, j=2 → swap(mat[1][2], mat[2][1]) → 6, 8 → mat[1][2]=8, mat[2][1]=6 

Reverse :

Row 0: 1 4 7 → 7 4 1

Row 1: 2 5 8 → 8 5 2

Row 2: 3 6 9 → 9 6 3
*/
