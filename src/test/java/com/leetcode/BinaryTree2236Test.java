package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTree2236Test {

    @Test
    void testBinaryTree1() {
        BinaryTree2236 binaryTree2236 = new BinaryTree2236();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        assertTrue(binaryTree2236.checkTree(root));
    }

    @Test
    void testBinaryTree2() {
        BinaryTree2236 binaryTree2236 = new BinaryTree2236();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        assertFalse(binaryTree2236.checkTree(root));
    }

}