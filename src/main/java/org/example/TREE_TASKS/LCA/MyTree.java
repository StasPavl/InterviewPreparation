package org.example.TREE_TASKS.LCA;

public class MyTree {
    TreeNode root;
    public MyTree() {
    }
    void insert(int value){
        TreeNode newNode=new TreeNode(value);
        if (root==null) {
            root=newNode;
            return;
        }
        TreeNode current =root;
        while(true){
            if (value<= current.val){

                if (current.left==null){
                    // if left is null insert there!!!
                    current.left=newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current=current.left;
            }
            else {
                if (current.right==null){
                    // if right is null insert there!!!
                    current.right=newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current=current.right;
            }
        }
    }
}
