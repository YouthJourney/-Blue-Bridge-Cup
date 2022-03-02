package com.hong.cn;

import javax.xml.transform.Source;
import java.util.ArrayList;


// 4位数字，颠倒可读，一个价牌赔了200多，另一个价牌赚了800多，赚了558
// 问赔钱的那个价牌多少钱
public class PeiQian {
    public static void main(String[] args) {
        ArrayList<Price> a1 = new ArrayList<Price>();
        ArrayList<Price> a2 = new ArrayList<Price>();
        // 枚举四位数，简单筛选
        for (int number = 1000; number < 10000; number++) {
            // 将其颠倒，和原价做差，将赔200多的放入一个集合，将赚800多的放入一个集合
            String s = "" + number;
            if (s.contains("3") || s.contains("4") || s.contains("7")) continue;
            String re_s = reverse(s);
            int i1 = Integer.parseInt(re_s);
            int plus = i1 - number;
            if (plus < -200 && plus > -300) {
                a1.add(new Price(number, plus));
            }
            if (plus < 900 && plus > 800) {
                a2.add(new Price(number, plus));
            }
        }

        // 遍历两个集合两两组合，检查相加结果是否为558
        for (Price p1 : a1) {
            for (Price p2 : a2) {
                if (p1.plus + p2.plus == 558) {
                    // 输出结果
                    System.out.println(p1.p + " " + p1.plus);
                    System.out.println(p2.p + " " + p2.plus);
                }
            }
        }
    }
    /*输出结果
    9088 -282
    1061 840
    9088 -282
    2062 840
    9088 -282
    5065 840
    9088 -282
    6069 840
    9088 -282
    8068 840
    9088 -282
    9066 840
     */

    private static String reverse(String s) {
        // 6和9翻转和反向
        char[] ans = new char[s.length()];
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            char c = s.charAt(i);
            if (c == '6') ans[j] = '9';
            else if (c == '9') ans[j] = '6';
            else ans[j] = c;
        }

        return new String(ans);
    }

    // 价格类，原价和颠倒价
    public static class Price {
        int p; // 原价
        int plus; // 颠倒价

        public Price(int p, int plus) {
            this.p = p;
            this.plus = plus;
        }
    }
}
