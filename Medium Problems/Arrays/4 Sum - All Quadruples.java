/*
4 Sum - All Quadruples
Difficulty: Medium Accuracy: 19.94% Submissions: 203K+ Points: 4 Average Time: 30m
Given an array arr[] of integers and another integer target. Find all unique quadruples from the given array that sums up to target.
Note: All the quadruples should be internally sorted, ie for any quadruple [q1, q2, q3, q4] it should be : q1 <= q2 <= q3 <= q4.
Problem Link : https://www.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
*/

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        //To store ans ill use a list ds
        List<List<Integer>> ans = new ArrayList<>();
        int n=arr.length;
        
        //Sort the array
        Arrays.sort(arr);
        
        // Iterate thru arr keeping i &  j as constant
        for(int i = 0 ;i < n ; i++)
        {
            //Skip Duplicates -- > Boundaries and comparison
            if( i > 0 && arr[i] == arr[i-1]) continue; // move next
            
            for(int j = i+1 ;j <n ; j++)
            {
                if(j > i+1 && arr[j] == arr[j-1]) continue;
                
                int k = j+1 , l = n-1; // k--> right after j and l --> last ele
                
                // Boundary check
                while(k < l)
                {
                    long sum = arr[i] + arr[j] + arr[k] +arr[l];
                   /* sum+ = arr[j];
                    sum+ = arr[k];
                    sum+ = arr[l];*/
                    
                    //condt 1 : sum == target store sum in temp and add temp to list (ans)
                    if(sum == target)
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        
                        ans.add(temp);
                        
                        //Find next quads
                        k++ ; l--;
                    
                    // Skip dups in k || l
                    while(k < l && arr[k] == arr[k-1]) k++;
                    while(k < l && arr[l] == arr[l+1]) l--;
                    
                    }
                    
                    //Condt2 : sum < target move k forward
                    else if (sum < target) 
                    {   
                        k++;
                    }
                    
                    //Condt 3 : sum > target move l closer 
                    else
                    {   
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
