package com.greatlearning.dsa.model;

public class BSTToSkewed {

    // instance variable to keep track of root of the tree
    public Node root;

    // instance variables to keep track of the head of skewed tree
    private Node head = null, prev = null;

    /**
     * Method to convert binary search tree to right skewed tree
     */
    public void convertBSTToSkewed() {
        conversionUtil(root);
        root = head;
    }

    /**
     * Utility function to convert binary search tree to right skewed tree
     * where nodes are arranged in increasing order.
     * performing inorder traversal and making necessary changes to make bst
     * to right skewed tree
     *
     * @param root - root of the tree
     */
    
    private void conversionUtil(Node root) {
        if (root == null) {
            return;
        }
        conversionUtil(root.left);
        if (head == null) {
            head = root;
        } else {
            prev.right = root;
        }
        root.left = null;
        prev = root;
        conversionUtil(root.right);
    }

    /**
     * Method to traverse right skewed tree
     */
    public void traverseSkewedTree() {
        Node current = root;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
    }
}