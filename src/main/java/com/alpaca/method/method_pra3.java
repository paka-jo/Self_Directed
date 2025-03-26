package com.alpaca.method;

public class method_pra3 {
    public static void main(String[] args) {
        method_pra3 app3 = new method_pra3();

        app3.MethodTest(40);

        int age = 20;
        app3.MethodTest(age);

        byte byteAge = 4;
        app3.MethodTest(byteAge);

        app3.MethodTest(age * 2);
    }
    public void MethodTest(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
    }

