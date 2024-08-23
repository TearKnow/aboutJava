package com.jack.learnDay5;

import java.util.Random;

public class GetRandom {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(10);
        System.out.println(num);
    }
}
