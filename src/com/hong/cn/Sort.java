package com.hong.cn;

public class Sort {
    static void sort(int[] x) {
        int p = 0;
        int left = 0; // 最左边的下标，左边都小于0
        int right = x.length - 1; // 最右边的下标，右边都大于0

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
                p++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {25, 18, -2, 0, 16, -5, 33, 21, 0, 19, -16, 25, -3, 0};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
