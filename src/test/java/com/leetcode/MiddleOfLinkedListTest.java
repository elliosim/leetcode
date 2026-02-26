package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfLinkedListTest {

    @Test
    public void testCase1() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        MiddleOfLinkedList sut = new MiddleOfLinkedList();
        ListNode actualNode = sut.middleNode(node1);

        ListNode expectedNode5 = new ListNode(5);
        ListNode expectedNode4 = new ListNode(4, expectedNode5);
        ListNode expectedNode3 = new ListNode(3, expectedNode4);

        assertEquals(expectedNode3.val, actualNode.val);

    }

}