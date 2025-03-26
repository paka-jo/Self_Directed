package com.alpaca.calculating_machin;

import java.util.Scanner;

public class machin {
    //        프로그램 개요
//        시스템 요구 사항
//        1.양의 정수 입력 받기
//        2.사칙연산 수행 (+,-,*,/)
//        3.사칙연산에 맞는 연산 진행
//        4.진행된 연산 결과값 출력
//    클래스 설계하기
//            1.사칙연산 클래스
//            2.숫자 클래스


    public static void main(String[] args) {

        User user = new User();


        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("=====계산기=====");
            System.out.println("계산기가 작동됐습니다");
            System.out.println("1. 첫번째 숫자 입력");
            System.out.println("2. 연산 입력");
            System.out.println("3. 두번째 숫자 입력");
            System.out.println("4. 합계");
            System.out.println("0. 계산기 종료");
            System.out.print("메뉴선택:");
            int error = sc.nextInt();

            switch (error){
                case 1: user.numbera(); break;
                case 2: user.calcu(); break;
                case 3: user.numberb(); break;
                case 4: user.total(); break;
                case 0: System.out.println("계산기를 종료합니다"); break;
                default: System.out.println("잘못된 번호입니다"); break;
            }
            if(error == 0){
                break;
            }

        }


        }


        }





