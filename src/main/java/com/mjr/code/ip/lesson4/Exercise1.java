package com.mjr.code.ip.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insira algum n�mero: ");
        int num = Integer.parseInt(reader.readLine());
        if (num % 5 == 0)
            System.out.println("O n�mero � divis�vel por 5.");
    }
}
