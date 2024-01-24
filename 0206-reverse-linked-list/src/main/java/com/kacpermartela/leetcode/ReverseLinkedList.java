package com.kacpermartela.leetcode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode prev = head;
        ListNode curr = head.next;
        prev.next = null;

        while (curr.next != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        curr.next = prev;

        return curr;
    }
}
