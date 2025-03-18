/*
Remove duplicates in array
Difficulty: Easy Accuracy: 35.86% Submissions: 65K+ Points: 2 Average Time: 20m
Given an array arr consisting of positive integer numbers, remove all duplicate numbers.
Problem Link : https://www.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1
*/
class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[])
    {
        Set<Integer> st = new LinkedHashSet<>();
        for(int num : arr) 
        {   
            st.add(num);
        }
        
        ArrayList<Integer> result = new ArrayList<>(st);
        return result;
    }
}
/*Note:
    **a Set is a collection that does not allow duplicate elements
        elements in a Set are not stored in any particular order
        
    ** HashSet: Stores elements with no specific order and is backed by a hash table.
        LinkedHashSet: Maintains the insertion order of elements.
        TreeSet: Stores elements in a sorted order (based on natural ordering or a comparator).
    
        ** Create a HashSet to store unique elements;any duplicates are automatically discarded.
         Add elements to the set (duplicates will be automatically handled)
        enhanced for loop iterate thru arr just shorter syntax
        
        ** adds each element from the array to the set, ensuring that only unique elements are stored.
            st.add(num);  // Use add() to insert into the set
            
        ** We create an ArrayList<Integer> from the Set to maintain the order and return it as the result.
        ArrayList<Integer> result = new ArrayList<>(st);
        
         **Return the ArrayList of unique elements
            
        **Create an ArrayList to store the unique elements from the set
    */
    (or)


class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        
        
        Set<Integer> st = new LinkedHashSet<>();  // Create a Linked HashSet to store unique elements;any duplicates are automatically discarded. 
        
        // Add elements to the set (duplicates will be automatically handled)
        //enhanced for loop iterate thru arr just shorter syntax
        
        for (int i : arr) {
            
            //adds each element from the array to the set, ensuring that only unique elements are stored.
            st.add(i);  // Use add() to insert into the set
        }
        
        // Create an ArrayList to store the unique elements from the set
        
        //We create an ArrayList<Integer> from the Set to maintain the order and return it as the result.
        ArrayList<Integer> result = new ArrayList<>(st);
        
        return result;  // Return the ArrayList of unique elements
    }
}
/*Note:
    **a Set is a collection that does not allow duplicate elements
        elements in a Set are not stored in any particular order
    ** HashSet() : Stores elements with no specific order and is backed by a hash table
    */
    
