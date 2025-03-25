/*
Quick Sort
Difficulty: Medium Accuracy: 55.23% Submissions: 263K+ Points: 4 Average Time: 15m
Implement Quick Sort, a Divide and Conquer algorithm, to sort an array, arr[] in ascending order. Given an array, arr[], with starting index low and ending index high, complete the functions partition() and quickSort(). 
Use the last element as the pivot so that all elements less than or equal to the pivot come before it, and elements greater than the pivot follow it.
Note: The low and high are inclusive.
Problem Link : https://www.geeksforgeeks.org/problems/quick-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-sort
*/
class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) 
    {
        
        // Quick Sort : Find the PIVOT (i.e 1st ele . last ele, random ,median anything ) place pivot in its correct order
        // sort : Elements before pivot has to be lower and after pivot to be greater --i(0) < j(arr.length-1)
        
        if(low < high) //if theres more than 1 element ;Base Condition: If low >= high, stop recursion.
        {
            //1.find partition index we've created & called a function partition .
            
            int partitionIndex = partition(arr,low,high); // get pivot correcct position
            
            // 2.sort elements using recursion
            
            //Sort left Half of arr (i.e upto Partition-1) 
            quickSort(arr,low,partitionIndex-1);
            
            //Sort Right  Half of arr (i.e till high last element)
            quickSort(arr,partitionIndex+1,high);
        }
    }
    // Actual partition takes place ; function Definition
    static int partition(int arr[], int low, int high) 
    {
       // Assume 1st element to be pivot 
       int pivot = arr[low];
       
       //Initialize two pointers: i (left) and j (right)
       int i = low , j = high; 
       
       //Find 1st greatest & smallest element in array & swap them to place pivot in crt position/index/ mark teritory of pivot
        while(i < j)
        {
            // check element @ i <= pivot (bcoz if same element present then it is placed in the left) & i--position/index within index of last element high-1
           
            while(arr[i] <= pivot && i <=high-1) //Move i right until we find a larger element
            {
                // i placed @ 0--low move ptr forward ++
                i++;
            }
            
            //check element @ j > pivot & j--position/index >= low+1 1st eleement in low bcoz j >=low one element left it will already be sorted if we move j ptr it'll lead to arrayindexoutofbound exception 
            
            while(arr[j] > pivot && j >=low+1) //Move j left until we find a smaller element
            {
                // j is @ last --high move ptr forward j--from last
                j--;
            }
            if(i < j) // i & j doesnt cross over then swap ; if it cross over thn we've marked teritory for pivot
            { 
                //swap elements @ i with j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }
            // if not (i.e i & j cross over then swap j with low) we've marked teritory for pivot
            
            //Swap pivot (arr[low]) with arr[j] (correct position for pivot)
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            
            
            return j; //Return pivot's final correct position
    }
    
}

