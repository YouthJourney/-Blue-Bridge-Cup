package com.hong.cn;

import javax.xml.transform.Source;
import java.math.BigInteger;

public class MeiSenShu {
    public static void main(String[] args) {
        // 大数的表示方式
        BigInteger x = BigInteger.valueOf(2).pow(11213).subtract(BigInteger.ONE); // 2^11213 -1
        // 转化为字符串
        String s = x.toString();
        int length = s.length();
        System.out.println(length);
        // 截取后100个字符
        String result = s.substring(length - 100);
        System.out.println(result);
    }
}
