package org.example.TREE_TASKS.LCA;

import com.sun.source.tree.Tree;

public class main {
    /*

    Input: root ={6,2,8,0,4,7,9,null,null,3,5} , p = 2 , q = 8
    _____Recursive approach:
1. Base case: if the root is null, then return null.
2. Recursive rule:

- if both p.val and q.val are smaller than root.val, then the LCA must be within the root's left subtree,
so we search the root's left child;
- if both p.val and q.val are greater than root.val, then the LCA must be within the root's right subtree,
so we search the root's right child;
otherwise, root splits p and q, so we return root as our result.

     */

    public static void main(String[] args) {
        int[] root = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        MyTree tree = new MyTree();
        for (int i = 0; i < root.length; i++) {
            tree.insert(root[i]);
        }
        VisualizeTree.printTree(tree.root,null,false);


        System.out.println((lcaRecursion(tree.root,new TreeNode(2),new TreeNode(8)).val));
    }

    //time => O(n) space => O(n) (cuz we using stuck)
    public static TreeNode lcaRecursion(TreeNode root, TreeNode p , TreeNode q){

        //stop condition
        if (root==null){
            return root;
        }
        if (p.val > root.val && q.val > root.val){
            return lcaRecursion(root.left, p ,q);
        }
        if (p.val < root.val && q.val < root.val){
            return lcaRecursion(root.right,p,q);
        }
        return root;
    }


    //So basically we create a pointer starting from root.
    // We create a while-loop to search LCA until root becomes null.
    //In this solution we have Time => O(N) and space => O(1)
    public static TreeNode lcaIteration(TreeNode root, TreeNode p, TreeNode q){
        TreeNode node = root;
        while (node != null) {

            if (p.val < node.val && q.val < node.val){
                node = node.left;
            } else if (p.val > node.val && q.val > node.val) {
                node = node.right;
            }else {
                return node;
            }
        }
        return node;
    }

}
