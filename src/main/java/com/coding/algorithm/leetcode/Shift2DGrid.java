package com.coding.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 此方法效率并不高,也不是in-place算法
 * <p>
 * 这个题本质上其实是把二维数组当做1维数据后移.
 * 所以我的思路是对二维数组每个数据指定一维编号.然后通过i和j 与index编号的关系计算出新的ni 和nj.如下
 * <p>
 * index = i * arr[i].length + j
 * <p>
 * 移动k个,newIndex =( index + k )% 总个数
 * <p>
 * j的变化规律:nj=(j+k) % grid[i].length
 * <p>
 * 公式反推得到 ni = (newIndex - nj) / grid[i].length
 *
 * @author mengxiangzhe
 * @date 2020/7/15
 */
public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>(grid.length);
        for (int[] aGrid : grid) {
            List<Integer> list = new ArrayList<>(aGrid.length);
            result.add(list);
            for (int data : aGrid) {
                list.add(data);
            }
        }

        int size = grid.length * grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int data = grid[i][j];

                int index = i * grid[i].length + j;

                int newIndex = (index + k) % size;

                int nj = (j + k) % grid[i].length;

                int ni = (newIndex - nj) / grid[i].length;

                List<Integer> list = result.get(ni);
                list.set(nj, data);
            }
        }
        return result;
    }
}
