# Problem Statement
Given two linked lists `head1` and `head2` with distinct elements, determine the count of all distinct pairs from both lists whose sum is equal to the given value `x`.

Note: A valid pair would be in the form (x, y) where x is from the first linked list and y is from the second linked list.

## Example 1:
Input:<br>
head1 = 1->2->3->4->5->6 <br>
head2 = 11->12->13 <br>
x = 15 <br>
Output: 3 <br>
Explanation: There are total 3 pairs whose sum is 15: (4, 11), (3, 12), and (2, 13). <br>

## Example 2:
Input: <br>
head1 = 7->5->1->3 <br>
head2 = 3->5->2->8 <br>
x = 10 <br>
Output: 2 <br>
Explanation: There are total 2 pairs whose sum is 10: (7, 3) and (5, 5). <br>

# Intuition
To solve this problem efficiently, we can utilize a HashSet to store elements from the second linked list `head2`. Then, we iterate through the first linked list `head1`, and for each element `i`, we check if `x - i` exists in the HashSet. If it does, we increment the count of valid pairs.

# Approach
1. Create a HashSet to store elements from the second linked list `head2`.
2. Iterate through each element `i` in the first linked list `head1`.
    a. Check if `x - i` exists in the HashSet. If it does, increment the count of valid pairs.
3. Return the count of valid pairs.

# Complexity Analysis
- Time Complexity: O(length(head1) + length(head2)). 
  - Building the HashSet takes O(length(head2)).
  - Iterating through the first linked list takes O(length(head1)).
- Space Complexity: O(length(head2)).
  - Additional space is used to store elements from the second linked list in the HashSet.
