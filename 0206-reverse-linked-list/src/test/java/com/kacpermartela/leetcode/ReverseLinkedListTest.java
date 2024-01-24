package com.kacpermartela.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void example1() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        var actual = ReverseLinkedList.reverseList(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        var head = new ListNode(1, new ListNode(2));
        var expected = new ListNode(2, new ListNode(1));
        var actual = ReverseLinkedList.reverseList(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void empty() {
        var head = new ListNode();
        var expected = new ListNode();
        var actual = ReverseLinkedList.reverseList(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void nullCheck() {
        ListNode head = null;
        ListNode expected = null;
        var actual = ReverseLinkedList.reverseList(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
