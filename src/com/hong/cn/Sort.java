package com.hong.cn;

public class Sort {
    static void sort(int[] x) {
        int p = 0;
        int left = 0; // 最左边的下标
        int right = x.length - 1; // 最右边的下标

        while(p <= right){
            if(x[p] < 0){
                int t = x[left];
                x[left] = x[p];
                x[p] = t;
                left ++;
                p++;
            }else if(x[p] > 0){
                int t = x[right];
                x[right] = x[p];
                x[p] = t;
                right --;
            }else {

            }
        }
    }
}
