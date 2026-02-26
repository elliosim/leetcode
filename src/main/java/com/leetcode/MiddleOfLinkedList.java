package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 876. Middle of the Linked List
 * Easy
 * Topics
 * premium lock icon
 * Companies
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2:
 *
 *
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 */
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {



        // TODO not working!!!
        // failed attempt

        ListNode lastNode = head;
        ListNode middleNode = head;
        int count = 0;

        // find list size
        while (head != null) {
            lastNode = head.next;
            if (count % 2 == 0) {
                middleNode = head.next;
            }
            head = head.next;
            count++;
        }

        return middleNode;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
