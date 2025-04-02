/*
Majority Element
Difficulty: Medium Accuracy: 27.82% Submissions: 698K+ Points: 4 Average Time: 59m
Given an array arr. Find the majority element in the array. If no majority exists, return -1.
Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.
Problem Link :https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Arrays&difficulty=Medium&sortBy=submissions
*/

class Solution {
    static int majorityElement(int arr[]) {
        
        // Using Moore Voting Algorithm 
        int n=arr.length;
        // element not initialized ; cnt initialized to 0
        int ele=0,cnt=0;
        
        // iterate thru arr
        for(int i=0;i<n;i++)
        {
            // if cnt ==0 update  ele with first value in arr then increase/update count
            if(cnt==0)
            {
                cnt=1;
                ele=arr[i];
            }
            // else if value @ i == element then increase count
            else if(ele==arr[i]) cnt++;
            
            // as we iterate if other value other than ele encountered decrease cnt
            else
            {
               cnt --; 
            }
        }
        //Verify value stored @ Ele is Majority element condt : > n/2
        //As we iterate thru arr value @ i==ele increase count
        int cnt1=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele) 
                {
                    cnt1++;
                }
                // verification of majority ele condt
                if(cnt1 > (n/2))
                {
                    return ele; //Majority  Element
                }
        }
        //Majority not found return -1
                return -1;
        
    }
}
