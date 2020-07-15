package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.ListNode;

/**
 * @author mengxiangzhe
 * @date 2020/7/15
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0;
        ListNode data = null;
        ListNode result = null;
        while (l1 != null || l2 != null) {
            int num1 = 0;
            int num2 = 0;
            if (l1 != null) {
                num1 = l1.val;
            }
            if (l2 != null) {
                num2 = l2.val;
            }
            int num = num1 + num2 + a;
            if (num >= 10) {
                num = num - 10;
                a = 1;
            }else {
                a = 0;
            }
            if (data == null) {
                data = new ListNode(num);
                result = data;
            }else {
                data.next = new ListNode(num);
                data = data.next;
            }
            l1 = l1 == null?null:l1.next;
            l2 = l2 == null?null:l2.next;
        }
        if (a > 0) {
            data.next = new ListNode(a);
        }

        return result;
    }
}
