package com.jack.learnDay8;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> strings = new java.util.ArrayList<>();
        strings.add("www");
        strings.add("ssss");
        strings.add(2, "six");
        System.out.println(strings.get(2));

    }
}
