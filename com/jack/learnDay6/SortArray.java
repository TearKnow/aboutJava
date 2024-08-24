package com.jack.learnDay6;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        //           0  1  2  3
        for (int i = 1; i <= arr.length - 1; i++) {
            //比3轮，每轮 4 - i次

            //i = 1, 比较3次，  0 1 2和它右边的比较

            //i = 2, 比较2次

            //i = 3, 比较1次


            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
