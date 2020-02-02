package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.ListNode;

/**
 * @author mengxiangzhe
 * @date 2020/2/1
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode cur = prev.next;
        while (cur != null) {
            if (val == cur.val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
