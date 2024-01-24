package com.kacpermartela.leetcode;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode merged;
        if (list1.val < list2.val) {
            merged = list1;
            list1 = list1.next;
        } else {
            merged = list2;
            list2 = list2.next;
        }

        ListNode start = merged;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merged.next = list1;
                list1 = list1.next;
            } else {
                merged.next = list2;
                list2 = list2.next;
            }
            merged = merged.next;
        }

        if (list1 != null) {
            merged.next = list1;
        } else {
            merged.next = list2;
        }

        return start;
    }
}
