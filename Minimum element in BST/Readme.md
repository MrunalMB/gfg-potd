# Problem Statement: Find Minimum Value in a Binary Search Tree (BST)

Given the root of a Binary Search Tree (BST), the task is to find the minimum valued element in this given BST.

## Examples :

``` Input:
           5 
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1
Example 2:

Input:
             9
              \
               10
                \
                 11
Output: 9 


```
## Approach

Since it's a Binary Search Tree (BST), the minimum valued element will always be the leftmost node in the tree. Thus, we can use a simple recursive approach to find the minimum value by traversing towards the left subtree recursively until we reach the leftmost node.

## Intuition

1. Start with the root node of the BST.
2. Recursively traverse towards the left child of the current node until reaching a node with no left child.
3. Return the value of the leftmost node as it represents the minimum value in the BST.

## Time Complexity

The time complexity of this approach is O(h), where 'h' is the height of the BST. In the worst-case scenario, the height of the tree can be equal to the number of nodes in the tree, making the time complexity O(n), where 'n' is the number of nodes in the BST.

