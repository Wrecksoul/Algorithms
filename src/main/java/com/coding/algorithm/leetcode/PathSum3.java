package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.TreeNode;

/**
 * @author mengxiangzhe
 * @date 2020/2/5
 */
public class PathSum3 {
    // Example:
//
//root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
//
//      10
//     /  \
//    5   -3
//   / \    \
//  3   2   11
// / \   \
//3  -2   1
//
//Return 3. The paths that sum to 8 are:
//
//1.  5 -> 3
//2.  5 -> 2 -> 1
//3. -3 -> 11
    public int pathSum(TreeNode root, int sum) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        count += getNodeNum(root, sum, 0);
        count += pathSum(root.left, sum);
        count += pathSum(root.right, sum);


        return count;
    }


    private int getNodeNum(TreeNode root, int sum, int count) {
        if (root == null) {
            return 0;
        }
        if (root.val == sum) {
            count ++;
        }
        if (root.right != null) {
            count = getNodeNum(root.right, sum - root.val, count);
        }
        if (root.left != null) {
            count = getNodeNum(root.left, sum - root.val, count);
        }
        return count;
    }

}
