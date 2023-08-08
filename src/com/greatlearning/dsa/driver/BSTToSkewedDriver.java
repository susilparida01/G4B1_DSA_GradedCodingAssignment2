package com.greatlearning.dsa.driver;

import com.greatlearning.dsa.model.BSTToSkewed;
import com.greatlearning.dsa.model.Node;

public class BSTToSkewedDriver {
    public static void main(String[] args) {
        // question 2: driver code to convert bst to right skewed tree
        BSTToSkewed tree = new BSTToSkewed();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.right.left = new Node(55);

        // call to convert binary search tree to right skewed tree
        tree.convertBSTToSkewed();

        // call to print right skewed tree
        tree.traverseSkewedTree();
    }
}