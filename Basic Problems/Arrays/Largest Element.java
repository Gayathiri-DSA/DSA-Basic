/*
Largest Element in Array
Difficulty: Basic Accuracy: 67.48% Submissions: 440K+ Points: 1 Average Time: 20m
Given an array arr[]. The task is to find the largest element and return it.
problem link :https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1?page=1&category=Arrays&difficulty=Basic,Easy&sortBy=submissions
*/
class Solution {
    public static int largest(int[] arr) {
        //assume that 1 st element to be largest
        int largest = arr[0];
        
        //iterate thru the array 
        for(int i=0 ; i<arr.length ; i++)
        {
            //check if current ele i is > that elmente stored at largest var
            if(arr[i] > largest)
            {
                //if yes store/update current element to largest
                largest = arr[i];
            }
        }
        //return largest elemenr in the array
        return largest;
    }
}
