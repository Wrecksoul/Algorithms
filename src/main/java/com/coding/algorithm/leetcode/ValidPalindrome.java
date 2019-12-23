package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2019/12/23
 */
public class ValidPalindrome {
    /**
     * 解法1 O(3n):构建栈一次循环,构建数组一次循环,equals比较一次循环
     *
     * @param s
     * @return
     */
    /*public boolean isPalindrome(String s) {
        byte[] bytes = s.getBytes();

        LinkedList<Byte> stack = new LinkedList<>();
        for (byte c : bytes) {
            if ((c > 64 && c < 91) || (c > 47 && c < 58)) {
                stack.push(c);
            }
            if (c > 96 && c < 123) {
                stack.push((byte) (c - 32));
            }
        }
        if (stack.size() == 1) {
            return false;
        }

        byte[] arr1 = new byte[stack.size()];
        byte[] arr2 = new byte[stack.size()];
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            Byte pop = stack.pop();
            arr1[i] = pop;
            arr2[length - 1 - i] = pop;
        }
        String s1 = new String(arr1);
        String s2 = new String(arr2);

        return s1.equals(s2);
    }*/

    /**
     * 解法2
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        String s1 = s.toUpperCase();
        int left = 0;
        int right = s1.length() - 1;
        byte[] bytes = s1.getBytes();

        while (left < right) {
            byte leftByte = bytes[left];
            byte rightByte = bytes[right];

            if (isInValidByte(leftByte)) {
                left ++;
                continue;
            }
            if (isInValidByte(rightByte)) {
                right --;
                continue;
            }

            if (leftByte != rightByte) {
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }

    private boolean isInValidByte(byte c) {
        return (c < 'A' || c > 'Z') && (c < '0' || c > '9');
    }
}
