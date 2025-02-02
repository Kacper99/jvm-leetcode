package com.kacpermartela.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        Set<Integer> seenNodes = new HashSet<>();

        ListNode curr = head;
        while (curr != null) {
            if (curr.val == Integer.MAX_VALUE) {
                return true;
            }
            curr.val = Integer.MAX_VALUE;
            curr = curr.next;
        }
        return false;
    }
}
