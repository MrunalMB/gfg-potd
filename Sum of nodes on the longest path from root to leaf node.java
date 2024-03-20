//Given a binary tree having n nodes. Find the sum of all nodes on the longest path from root to any leaf node.
//If two or more paths compete for the longest path, then the path having maximum sum of nodes will be considered.
//Your Task:
// You don't need to read input or print anything. Your task is to complete the function sumOfLongRootToLeafPath() 
// which takes root node of the tree as input parameter and returns an integer denoting the sum of the longest root to leaf path of the tree.

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

  class Solution{
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        int[] sol = new int[]{0, 0};
        solve(root, 0, 0, sol);
        return sol[1];
    }
    
    private void solve(Node root, int depth, int prevSum, int []sol){
        if(root == null){
            if(depth > sol[0]){
                sol[1]= prevSum;
                sol[0] = depth;
            }else if(depth == sol[0] && sol[1] < prevSum){
                sol[1] = prevSum;
            }
            return;
        }
        
        int currSum = prevSum + root.data;
        solve(root.left, depth + 1, currSum, sol);
        solve(root.right, depth + 1, currSum, sol);

    }
}
