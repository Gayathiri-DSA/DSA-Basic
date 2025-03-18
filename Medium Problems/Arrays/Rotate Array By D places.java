/*
Rotate Array
Difficulty: Medium Accuracy: 37.06% Submissions: 457K+ Points: 4 Average Time: 20m
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
Note: Consider the array as circular.
Problem Link : https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
*/

class Solution

{
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) 
    {
        int n =arr.length;
        
         // to reduce no's d rotation less than n(arr  length) since multiple of n size of arr gives original array after rotation
         d = d % n;
         
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
     //Manual function for reverse/swap
    static void reverse(int arr[],int start,int end)
    {
            while(start<=end)
            {
                 // Swap the elements
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start ++;
                end--;
            }
    }
}

/*
Note:
    ** reverse the arr from 0 th index till given d eg:3 d-1 =2 i.e upto 2nd index
    ** reverse arr from given d i.e 3rd index upto n-1 last index
    **reverse the reversed arr from 0th index till last 
    
    
Another Optimise approach would be: usng built in collections to rotate the array
    
     int n = arr.length;  // Find the length of the array
        
        // If d is larger than n, normalize it to be within the range of the array
        d = d % n;

        // Convert array to list
        
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Rotate the list by d positions (counter-clockwise)
        Collections.rotate(list, -d);  // Negative for counter-clockwise rotation
        
        // Convert the list back to array
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
    
    */
