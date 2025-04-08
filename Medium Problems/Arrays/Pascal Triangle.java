/*
Pascal Triangle
Difficulty: Medium Accuracy: 23.68% Submissions: 118K+ Points: 4 Average Time: 20m
Given a positive integer n, return the nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.
Problem Link :https://www.geeksforgeeks.org/problems/pascal-triangle0652/1
*/

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
         
         //N rows == N elements NcR --> N! / R! * (N-R)!
         // Generate the value of row and store in ansRows
         ArrayList<Integer> ansRows=new ArrayList<>();
         
         //1st & last ele is always 1
        long  ans=1;
        //add 1 to ansRows
        ansRows.add(1);
        
        //Iterate thru cols in that particular rows
        for(int col=1;col<n;col++)
        {
            //n=5
            ans = ans* (n-col); // 5-1 = 4 ; 5-2=3 ; 5-3=2 ;5-4=1 ; 5-5=0 
            ans = ans/(col); // 4/1 * 3/2 *  2/3 * 1/4 ..
            ansRows.add((int)ans); // the ans i sadded to arraylist of ansRows
        }
        return ansRows; // Finally return all elements in that nth row
    }
}
