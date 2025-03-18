/*
Reverse an Array
Difficulty: Easy Accuracy: 55.32% Submissions: 142K+ Points: 2 Average Time: 5m
You are given an array of integers arr[]. Your task is to reverse the given array.
Note: Modify the array in place.
Problem Link :https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array
*/
class Solution 
{
    public void reverseArray(int arr[]) 
    {
        int i=0; // pointer starting from the beginning of the array
        int j=arr.length -1; // pointer starting from the end of array
        
              while(i < j)
              {
                  //Swap or reverse element
                  int temp = arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  i++;
                  j--;
              }
    }
}

/*
Note:
    ** This approach is by using two pointers
    ** i is placed @ 0th index and j is placed @ last index n-1
    ** while(i < j) // i should be less than j if so enters the loop
    ** the function uses temp var to swap elements @ indices i and j
            ** store start ele--i [index 0] @ temp 
            ** then last element j @ i 
            ** then store temp value to j
            ** then move ptr to incr/decr 
            
    ** brute force approach would be : using simple 2 for loops which can be time consuming so optimisec
    
            for(int i=0 ; i<arr.length ; i++)
                {
                    for (int j=arr.length-1 ; j>0 ; j--)
                        {
*/
