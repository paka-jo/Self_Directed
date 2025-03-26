package com.alpaca.method;

public class method_pra {
    public static void main(String[] args) {

        System.out.println("main 호출");

        method_pra app1 = new method_pra();
        app1.methodA();



    }
    public void methodA() {

        System.out.println("methodA 호출");

        methodB();

    }
    public void methodB() {

        System.out.println("methodB 호출");

        methodC();
    }
    public void methodC() {

        System.out.println("methodC 호출");
        System.out.println("methodB 종료");
    }


}
