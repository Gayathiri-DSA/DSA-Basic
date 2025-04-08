/*
Spiral Matrix
Difficulty: Medium Accuracy: 41.26% Submissions: 25K+ Points: 4 Average Time: 20m
Given a matrix of size N x M. You have to find the Kth element which will obtain while traversing the matrix spirally starting from the top-left corner of the matrix.
Problem Link : https://www.geeksforgeeks.org/problems/spiral-matrix--141631/1
*/
class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    //Logic covers all edge cases (single row/column, square/rectangular matrices).
        
        // List to store the elements in spiral order
        List<Integer> ans = new ArrayList<>();

        // Initialize boundaries of the matrix
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        // Traverse the matrix in spiral order
        while (top <= bottom && left <= right)
        {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                ans.add(a[top][i]);
                if (ans.size() == k) return ans.get(k - 1); // Return if we've reached the k-th element
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                ans.add(a[i][right]);
                if (ans.size() == k) return ans.get(k - 1); // Early exit
            }
            right--; // Move the right boundary left

            // Traverse from right to left along the bottom row (if not already traversed)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(a[bottom][i]);
                    if (ans.size() == k) return ans.get(k - 1); // Early exit
                }
                bottom--; // Move the bottom boundary up
            }

            // Traverse from bottom to top along the left column (if not already traversed)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(a[i][left]);
                    if (ans.size() == k) return ans.get(k - 1); // Early exit
                }
                left++; // Move the left boundary right
            }
        }

        // If k is out of bounds (shouldn't happen if inputs are valid), return -1
        return -1;

	}
	
}
