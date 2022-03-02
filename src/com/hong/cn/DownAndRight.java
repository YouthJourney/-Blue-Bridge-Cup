package com.hong.cn;

import java.net.SocketOption;

public class DownAndRight {
    public static void main(String[] args) {
        int result = f(0, 0);
        System.out.println(result);
    }

    private static int f(int i, int j) {
        if (i == 3 || j == 4) {
            return 1; // 走到最下或者最右时只有一种走法
        }

        return f(i + 1, j) + f(i, j + 1);
    }
}
