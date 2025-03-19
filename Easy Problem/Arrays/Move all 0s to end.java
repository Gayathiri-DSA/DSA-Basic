/*
Move All Zeroes to End
Difficulty: Easy Accuracy: 45.51% Submissions: 287K+ Points: 2 Average Time: 15m
You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. 
The operation must be performed in place, meaning you should not use extra space for another array.
Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
*/
class Solution 
{
    void pushZerosToEnd(int[] arr) 
    {
        // this approach is by using two pointers
        //step 1: Find 1st 0 th element in the arr
        
         int j=-1; // initilaize j to -1 as it is the max value in smallest range other than 0
         
         // iterate thru array
         for(int i=0 ; i<arr.length ; i++)
         {
             //current element == 0
             if(arr[i]==0)
             {
                 // store i (i.e 0) in j
                 j=i;
                 break;
             }
         }
         //  non zero element (i.e  no 0s present in arr then return arr)
         if(j==-1)
            {
                return;// if 0 is not found ,return bcoz arr is already arranged 
            }
            
            // step 2: process arr to push 0s to end 
            
            //Take i right after 0  value (j) found 
        for(int i=j+1 ; i<arr.length ;i++)
            {
                // if 0 is not found
                if(arr[i]!=0)
                {
                    //then swap non 0 element with 0 inorder to retain non zero element in first half
                    swap(arr,i,j);
                    // then move the j ptr --0 after placing non zero elements first
                    j++;
                }
            }
        }
        //Remeber : Function implementation should always be outside the class seprately
        // simple swap function using third var 
            void swap(int[] arr, int i, int j)
            {
                int temp = arr[i];
                arr [i] = arr[j];
                arr[j] = temp;
            }
    
}
