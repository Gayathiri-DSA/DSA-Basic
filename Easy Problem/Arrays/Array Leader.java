/*
Array Leaders
Difficulty: EasyAccuracy: 29.94%Submissions: 845K+Points: 2Average Time: 15m
You are given an array arr of positive integers. Your task is to find all the leaders in the array. 
An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.
Problem link : https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions

*/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        //since rightmost element to be larger iterate from last ele to arr[0]
        
        ArrayList <Integer> result = new ArrayList<>();
        // initialize current ele to arr.length-1 i.e last ele
        int curmax=arr[arr.length-1];
        
        // iterate from last element to 0th if we find cur element > than current max then update ele to current max
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=curmax)
            {
                //the > elemet is added to arraylist ;insert an element at the 0th index (the beginning of the list) to preserve order
                result.add(0,arr[i]);
                curmax=arr[i]; // after elemet is added to list update current max 
            }
        }
        return result;
    }
}
/*note:
    **ArrayList resizable array implementation of the List interface. 
    It is used when you need a dynamic array that can grow and shrink automatically.*/
