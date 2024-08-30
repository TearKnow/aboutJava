package com.jack.learnATM;


import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        //1. 定义账户类
        //2. 定义一个集合容器，负责存储全部的账户对象，进行相关的业务操作。
        ArrayList<Account> accounts = new ArrayList<>();

        //3. 展示系统的首页
        while (true) {
            System.out.println("===============ATM system==================");
            System.out.println("1. 账户登录");
            System.out.println("2. 账户开户");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入操作：");

            int command = sc.nextInt();
            switch (command){
                case 1:

                    break;

                case 2:

                    break;
                default:
                    System.out.println("操作不存在");
            }
        }
    }
}
