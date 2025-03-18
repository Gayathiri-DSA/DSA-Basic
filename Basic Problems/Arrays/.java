/*
Rotate Array by One
Difficulty: Basic Accuracy: 69.6% Submissions: 301K+ Points: 1 Average Time: 20m
Given an array arr, rotate the array by one position in clockwise direction
problem link : https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
*/
class Solution {
    public void rotate(int[] arr) {
        // store last ele in temp var
        int temp = arr[arr.length - 1] ;
        
        //Shift elements to right by one position
        //initialix=ze i with last ele and condt to be > 0 and then decrement from last ele
        for(int i = arr.length - 1 ; i>0 ; i--)
        {
            // shift happens -- store prev element in current i
               arr[i] = arr[i-1] ;
               
        }
        // store last ele  stored @ temp to first index
        arr[0]= temp;
    //Right shift done successfully
        
    }
    
}
