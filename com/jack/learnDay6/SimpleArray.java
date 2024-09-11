package com.jack.learnDay6;

import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {

        int[] bb = new int[5];
        bb[0] = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(bb[i]);
        }




        int[] cc = {1,2,3,4};
        for (int i = 0; i < cc.length; i++) {
            System.out.print(cc[i]);
        }


        System.out.println(Arrays.toString(cc));//[1,2,3,4]这样打印的

        System.out.println(cc.toString());//这里是地址
    }
}
