/*

Sum of Squares of First n Natural Numbers

Difficulty: Easy Accuracy: 92.68% Submissions: 219+ Points: 2 Average Time: 10m

Given an integer n. The task is to calculate the sum of the squares of the first  n natural numbers.

Problem Link : https://www.geeksforgeeks.org/problems/sum-of-squares-of-first-n-natural-numbers/1?page=1&sortBy=latest
*/
class Solution 
{
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) 
    {
        // code here
        int sum=0;
        for(int i =0 ; i<=number ; i++)
        {
          sum+=i*i  ;//sum=sum+i*i
        }
        
        return sum;
    }
}

/*Note:
        ** Initialize a global var called sum to 0
        ** Looping through given number
        ** Add the square (i*i) of i to sum 
        ** return sum
    Alternate way :
            Using Formula Of Natural Numbers:
            (n) * (n+1)*(2*n+1)/6
*/
