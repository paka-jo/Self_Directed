package com.alpaca.coTe.Divisors_multiple_prime_numbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B4134_다음_소수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter sw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long m = Integer.parseInt(br.readLine());

        for(int i=0; i<m; i++){
            long prime = Long.parseLong(br.readLine());

            if(prime == 0|| prime ==1){
                sb.append(2).append("\n");
                continue;
            }
            while(true){
                long cnt = 0;
                for(long j =2;j <= Math.sqrt(prime) ; j++){
                    if(prime%j == 0){
                        cnt++;
                        break;
                    }
                }
                if(cnt ==0){
                    sb.append(prime).append("\n");
                    break;
                }
                prime++;
            }
        }
        sw.write(sb.toString());
        sw.flush();
        sw.close();
    }

}

