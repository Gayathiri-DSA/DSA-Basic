/*
Array Duplicates
Difficulty: Easy Accuracy: 18.95% Submissions: 814K+ Points: 2 Average Time: 20m
Given an array arr of integers, find all the elements that occur more than once in the array. If no element repeats, return an empty array.
Problem Link : https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&sortBy=submissions
*/
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        
        // To store/Hold Duplicates nos  
        List <Integer> Duplicate = new ArrayList<>();
        
        // To check if element is visited or not and store it / track unique nos we've aready encountered
        Set <Integer> Visit = new HashSet<>();
        
        //Iterate thru arr using i
        for(int i=0 ; i<arr.length ; i ++)
        {
            //Since set stored unique values already if we iterate thru arr 
            //when i is present in visit then it is duplicate so add in duplicate var 
            if(Visit.contains(arr[i]))
            {
                Duplicate.add(arr[i]); 
            }
            // if the i is not in list(unique) /not visited before then add it in visit
            else
            {
              Visit.add(arr[i]);  
            }
        }
        return Duplicate;
    }
}
/*Note:
    **List (Duplicate):
        -- used to store the duplicate values found in the array.
    The ArrayList is chosen because it allows easy insertion of elements, maintaining their order of appearance.
    
    **Set (Visit):
        -- used to track the numbers that have already been encountered in the array.
    A HashSet is ideal for this purpose because it allows for constant time checks (O(1)) for whether an element has been seen before. 
    The main feature of a Set is that it does not allow duplicate values, so it helps identify numbers that appear more than once.
    */
