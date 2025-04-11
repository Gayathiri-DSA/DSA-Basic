/*
Count Subarrays with given XOR
Difficulty: Medium Accuracy: 58.86% Submissions: 32K+ Points: 4
Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.
Problem Link : https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/0
*/
class Solution {
    public int subarrayXor(int arr[], int k) {
        
        //Initializing xr and count to 0
        int n=arr.length;
         int xr = 0; 
         
         //Using Map ds to store the first element and its count
        Map<Integer,Integer> mpp = new HashMap<>();
        
        // Initializing map to (0,1)
          mpp.put(xr , 1);
         int cnt = 0;
         
         //Iterate thru arr
         for(int i=0 ; i < n;i++)
         {
             // Find xor using prefix sum
             xr = xr ^ arr[i];
             
             ///By formula: x = xr^k:
             int x = xr ^ k;
             
             //add the occurrence of xr^k to the count:
             if(mpp.containsKey(x))
             {
                 cnt =cnt + mpp.get(x);
             }
             // Insert the prefix xor till index i into the map
             if (mpp.containsKey(xr))
             {
                mpp.put(xr, mpp.get(xr) + 1);
            } 
             else
             {
                 mpp.put(xr,1);
             }
         }
         return cnt;
    }
}
