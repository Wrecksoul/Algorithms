package com.coding.algorithm.dynamic;

/**
 *
 *
 * @author mengxiangzhe
 * @date 2020/1/13
 */
public class Cut {
    public static int cut(int[] p, int n) {
        if (n == 0) {
            return 0;
        }
        int q = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            q = Math.max(q, p[i - 1] + cut(p, n - i));
        }
        return q;
    }

    public static int cutMemo(int[] p, int n) {
        int[] r = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            r[i] = -1;
        }
        return cut(p, n, r);
    }

    private static int cut(int[] p, int n, int[] r) {
        int q = -1;
        if (r[n] >= 0)
            return r[n];
        if (n == 0) {
            q = 0;
        } else {
            for (int i = 1; i <= n; i++) {
                q = Math.max(q, cut(p, n - i, r) + p[i - 1]);
            }
        }
        r[n] = q;

        return q;
    }

    public static int buttom_up_cut(int[] p, int n) {
        int[] r = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int q = -1;
            //①
            for (int j = 1; j <= i; j++) {
                q = Math.max(q, p[j - 1] + r[i - j]);
            }
            r[i] = q;
        }
        return r[n];
    }
}
