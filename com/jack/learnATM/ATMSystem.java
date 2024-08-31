package com.jack.learnATM;


import java.util.ArrayList;
import java.util.Random;
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
                    login(accounts, sc);
                    break;

                case 2:
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("操作不存在");
            }
        }
    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===================系统登录操作===================");
        if(accounts.size() == 0){
            System.out.println("对不起，系统中无账户");
            return;
        }

        while (true) {
            System.out.println("请输入卡号");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId, accounts);
            if(acc != null){//卡号存在
                //认证密码
                while (true) {
                    System.out.println("请输入密码");
                    String password = sc.next();
                    if(acc.getPassWord().equals(password)){
                        //登录成功
                        System.out.println("恭喜你" + acc.getUserName() + "，登录成功！" + "卡号" +acc.getCardId());

                    }else{
                        System.out.println("输入的密码有误");
                    }
                }
            }else{
                System.out.println("不存在该账户卡号");
            }
        }

    }

    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===================系统开户操作===================");
        Account account = new Account();

        System.out.println("请输入账户用户名");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请输入账户密码");
            String password = sc.next();
            System.out.println("请再次输入密码");
            String okPassword = sc.next();
            if(okPassword.equals(password)){
                account.setPassWord(okPassword);
                break;
            }else{
                System.out.println("对不起，两次输入密码错误");
            }
        }

        System.out.println("请输入账户限额");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);


        //随机一个8位唯一的卡号
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);


        accounts.add(account);
        System.out.println("恭喜"+userName+"，开户成功"+"，卡号 " + cardId);

    }

    //生存随机卡号
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();

        while (true) {
            String cardId = "";

            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }

            Account newAccount = getAccountByCardId(cardId, accounts);
            if(newAccount == null){//可以使用新卡号了，因为没查到
                return cardId;
            }
        }
    }

    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account tmpAccount = accounts.get(i);
            if(tmpAccount.getCardId().equals(cardId)){
                return tmpAccount;
            }
        }
        return null;//查不到账号
    }


}
