package com.jack.learnDay5;

public class LikeFor {
    public static void main(String[] args) {
        //循环
        for(int i = 0; i < 10; i++){
            System.out.println("hello world " + i);
        }

        //求和
        int sum = 0;
        for(int i = 1; i<= 5; i++){
            sum +=i;
        }
        System.out.println(sum);


        //水仙花数
        for (int i = 100; i <= 999; i++){
            int one = i % 10;
            int two = i / 10 % 10;
            int three = i / 100;

            if(one * one * one + two * two * two + three * three * three == i){
                System.out.println("水仙花数是：" + i);
            }
        }

        //while
        int j = 0;
        while(j < 3){
            System.out.println("hello world----");
            j++;
        }

        //do-while 肯定会执行一次
        int m = 6;
        do{
            System.out.println("hello world");
            m++;
        }while (m < 4);


        //总结：for用户知道次数，不知道次数用while。do-while是肯定先运行一次，比如抢票软件。

    }
}
