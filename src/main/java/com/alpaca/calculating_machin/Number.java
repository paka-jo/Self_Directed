package com.alpaca.calculating_machin;

import java.util.Scanner;

public class Number {

    private int num1;
    private char c;
    private int num2;


//    첫번째 숫자 입력
    public void numbera(){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("num1 : " + num1);
            this.num1 = num1;
        }
        else {
            System.out.println("입력할 수 없습니다");

        }
    }
//    기호 입력
    public void calcu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("+,-,*,/중 기호를 고르세요");
        char c = sc.next().charAt(0);
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            System.out.println("부호:" + c);
            this.c = c;

        }

        else {
            System.out.println("다시 입력해주세요");

        }
    }
//    두번째 숫자 입력
    public void numberb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        if (num2 > 0) {
            System.out.println("num2 : " + num2);
            this.num2 = num2;

        }
        else {
            System.out.println("입력하실 수 없습니다");
        }
    }

    public void total(){

            int result = 0;
            switch (c) {
                case '+' :
                    result = num1 + num2;
                    break;
                case '-' :
                    result = num1 - num2;
                    break;
                case '*' :
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다");
                    return;
            }

            System.out.println( "total:" + result );
        }
    }



