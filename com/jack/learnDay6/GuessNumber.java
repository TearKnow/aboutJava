package com.jack.learnDay6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //有5个20内的数字，猜数字
        int[] num = new int[5];
        Random r = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(20) + 1;
        }

        System.out.println("请输入你的数字：");
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true){
            int guessData = sc.nextInt();
            for (int i = 0; i < num.length; i++) {
                if(guessData == num[i]){
                    System.out.println("恭喜你猜中了");
                    break OUT;
                }
            }
            System.out.println("请继续输入");
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + "\t");
        }


        int a = 5;
        System.out.println("=======");
        System.out.println((int)' ');//空貌似对应数字3212
    }
}
