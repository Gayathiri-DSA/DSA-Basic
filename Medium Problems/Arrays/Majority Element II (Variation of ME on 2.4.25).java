/*
Majority Element II
Difficulty: Medium Accuracy: 48.1% Submissions: 142K+ Points: 4 Average Time: 15m
You are given an array of integer arr[] where each number represents a vote to a candidate.
Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 
Problem Link : https://www.geeksforgeeks.org/problems/majority-vote/1
Note: The answer should be returned in an increasing format.
*/

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) 
    {
        int n=nums.length;
        
        // element not initialized ; cnt initialized to 0
        int ele1=0,cnt1=0 , ele2=0 ,cnt2=0;
        
        // iterate thru arr
        for(int i=0;i<n;i++)
        {
            // if cnt ==0 update  ele with first value in arr then increase/update count
            //ele 1 & 2 are unique integer that appears to be >n/3
            if(cnt1==0 && ele2!=nums[i])
            {
                cnt1=1;
                ele1=nums[i];
            }
            else if(cnt2==0 && ele1!=nums[i])
            {
                cnt2=1;
                ele2=nums[i];
            }
            // else if value @ i == element then increase count
            else if(ele1==nums[i]) cnt1++;
            else if(ele2==nums[i]) cnt2++;
            
            // as we iterate if other value other than ele encountered decrease cnt
            else
            {
               cnt1 --; cnt2 --; 
            }
        }
        
        
        //Verify value stored @ Ele is Majority element condt : > n/3
        //As we iterate thru arr value @ i==ele increase count
        
           List<Integer> ls = new ArrayList<>(); // list of answers
           
         cnt1=0; cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==ele1) 
                 cnt1++;
                
             if(nums[i]==ele2) 
                 cnt2++;
        }    
                int min = (int)(n/3); // condition ele appear > n/3 are added to list
                
                if(cnt1 > min) ls.add(ele1);
                if(cnt2 > min) ls.add(ele2);
                
                Collections.sort(ls);
                return ls;
        
    }
}
/*Note:

Initialization:
    You have two candidates (ele1, ele2) because at most two elements can appear more than n/3 times.
    Counters cnt1 and cnt2 track their tentative frequency.

First Pass – Candidate Selection:
    You loop through nums[], updating candidates and counters.
    If a candidate matches, increment its counter.
    If neither candidate matches and both counters are non-zero, decrement both (i.e., vote out both).
    If a counter is 0 and the current number isn't the other candidate, replace the candidate and reset the counter.

Second Pass – Validation:
    You re-count the actual occurrences of ele1 and ele2 to confirm they occur more than n/3 times.
    If they do, you add them to the result list.

Sort & Return:
    The result list is sorted for consistent output.


*/
