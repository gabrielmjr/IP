package com.mjr.code.ip.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insira algum n�mero: ");
        int num = Integer.parseInt(reader.readLine());
        if (num > 0) {
            int novoValor = -num;
            System.out.println("N�mero invertido para " + novoValor);
        }
    }
}
