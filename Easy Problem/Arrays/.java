/*
Count the Zeros
Difficulty: Easy Accuracy: 68.08% Submissions: 118K+ Points: 2 Average Time: 15m
Given an array arr of only 0's and 1's. The array is sorted in such a manner that all the 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.
Problem Link : https://www.geeksforgeeks.org/problems/count-the-zeros2550/1?page=3&category=Arrays&difficulty=Easy&sortBy=submissions
*/
class Solution {
    int countZeroes(int[] arr) {
        int count=0; 
        
        // traverse from 0th index till last
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
}

/*Note:
..Brute Approach not run for many testcase
//Initialise count to 0 ; count var tracks the no of 0's
        
        int count =0 ;
        
        //Traverse from last ele since arr is sorted thn 0's r stored end
        //condt is arr > 0 then decrement from last ele
        for(int i=arr.length -1 ;i >0 ; i--)
        {
            // if current ele is 0 then increase count by 1 
            if(arr[i]==0)
            {
                
                count ++;
            }
        }
        // return count which stores total no of 0's
    return count;
    
    */
