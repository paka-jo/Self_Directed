package com.alpaca.If_Else;

import java.util.Scanner;

public class ifElseIf_rabbitTurtle {

    public static void main(String[] args) {

        System.out.println("토끼와 거북이가 경주를 시작했다");
        System.out.println("토끼와 거북이중 고르시오");

        System.out.println("1.발빠른 토끼 2.느릿느릿 거북이");
        Scanner sc= new Scanner(System.in);
        int answer1 = sc.nextInt();


        if(answer1==1){

            System.out.println("토끼는 이겼을까 졌을까?");
            System.out.println("(1.이겼다 2.졌다 ):");
            Scanner sc1 = new Scanner(System.in);
            int answer2  = sc1.nextInt();

            if (answer2 == 1) {

                System.out.println("정답이 틀렸습니다");

            }else if (answer2 == 2) {

                System.out.println("왜 졌을까요?");

                System.out.println("1.게을러서 2.다쳐서 ");
                Scanner sc2 = new Scanner(System.in);
                int answer3 = sc2.nextInt();

                if (answer3 == 1) {

                    System.out.println("자만이 당신을 망칠 수 있습니다");
                } else if (answer3 == 2) {

                    System.out.println("틀렸습니다");
                }
            }

        }
       else if(answer1 == 2){

            System.out.println("거북이는 이겼을까 졌을까?");
            System.out.println("1.이겼다 2.졌다");
            Scanner sc3 = new Scanner (System.in);
            int answer4 = sc3.nextInt();

            if (answer4 == 1) {
                System.out.println("상대보다 늦지만 포기하지않고 꾸준히 노력하다보면 이겨낼 수 있습니다 ");

            }
            else if(answer4 == 2){
                System.out.println("정답이 틀렸습니다");
            }

        }




        }



    }

