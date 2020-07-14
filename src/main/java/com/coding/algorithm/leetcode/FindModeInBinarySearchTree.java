package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mengxiangzhe
 * @date 2020/7/14
 */
public class FindModeInBinarySearchTree {

    public int[] findMode(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        searchTree(root, map);
        int max = 0;
        for (Integer count : map.values()) {
            if (count >= max) {
                max = count;
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();
            if (count == max) {
                Integer nodeVal = entry.getKey();
                res.add(nodeVal);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    private void searchTree(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) {
            return;
        }
        searchTree(node.left, map);
        Integer count = map.getOrDefault(node.val, 0);
        map.put(node.val, count + 1);
        searchTree(node.right, map);

    }
}
