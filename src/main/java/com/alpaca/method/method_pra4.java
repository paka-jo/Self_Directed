package com.alpaca.method;

public class method_pra4 {
    public static void main(String[] args) {

        int A = 30;
        int B = 50;

        method_pra4 app4 = new method_pra4();

        System.out.println("두수를 더한 값 :" + app4.plusTwonum(A, B));
        System.out.println("두수를 곱한 값 :" + app4.multipleTwonum(A, B));
    }

    public int plusTwonum(int A, int B) {
        return A + B;
    }
    public int multipleTwonum(int A, int B) {
        return A * B;
    }
}
