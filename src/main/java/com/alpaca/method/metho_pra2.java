package com.alpaca.method;

public class metho_pra2 {
    public static void main(String[] args) {

        System.out.println("main 시작");

        metho_pra2 app2 = new metho_pra2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main 끝");
    }
        public void methodA() {
            System.out.println("A");
        }
        public void methodB() {
            System.out.println("B");
        }
        public void methodC() {
            System.out.println("C");
        }
    }

