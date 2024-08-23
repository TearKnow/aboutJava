package com.jack.learnDay5;

import java.util.Scanner;

public class CaiMiMa {
    public static void main(String[] args) {
        //猜密码
        Scanner sc = new Scanner(System.in);
        int password = 520;
        while(true){
            System.out.println("Please input your password:");
            int userInput = sc.nextInt();
            if(userInput == password){
                System.out.println("Welcome!");
                break;
            }else{
                System.out.println("Wrong password");
            }
        }
    }
}
