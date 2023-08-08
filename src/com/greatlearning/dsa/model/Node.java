package com.greatlearning.dsa.model;

public class Node {
    int data;
    public Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}