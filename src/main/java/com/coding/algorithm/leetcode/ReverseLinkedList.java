package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.ListNode;

/**
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * <p>
 * 使用轮询和递归两种方式实现
 *
 * @author mengxiangzhe
 * @date 2020/2/1
 */
public class ReverseLinkedList {
    /**
     * 递归方式recursively
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        return reverseList(null, head);
    }

    private ListNode reverseList(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }
        ListNode head = reverseList(cur, cur.next);
        cur.next = prev;
        return head;
    }


    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
