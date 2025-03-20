/*
Facing the sun
Difficulty: Easy Accuracy: 45.54% Submissions: 85K+ Points: 2 Average Time: 20m
Given an array height representing the heights of buildings. You have to count the buildings that will see the sunrise (Assume the sun rises on the side of the array starting point).
Note: The height of the building should be strictly greater than the height of the buildings left in order to see the sun.
Problem Link :https://www.geeksforgeeks.org/problems/facing-the-sun2126/1?page=8&category=Arrays&difficulty=Basic,Easy,Medium&sortBy=submissions
*/

class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // Regardless of anything 1st sees the sunlight 
         int first = height[0];
         
         // to keep track of how many saw sunrise initialize count
         int count =1;
         
         // iterate through given heights
         for(int i=0;i<height.length;i++)
         {
             // if height is > than first then position @ height[i] would see ..
             if(height[i] > first)
             {
                 // then increase the count to keep track of how many would see sunrise
                 count++;
                 first = height[i];// update i with one that saw sunrise after first and store it in first
             }
         }
         //return final answer stored @ count
         return count;
    }
}
