package com.alpaca.If_Else;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {

            System.out.println("입력하신 숫자는 짝수 입니다");

        }else{
                System.out.println("입력한신 숫자는 홀수 입니다");
            }
        }
    }

