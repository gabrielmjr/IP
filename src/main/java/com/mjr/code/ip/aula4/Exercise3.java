package com.mjr.code.ip.aula4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A, B;
        double C;
        System.out.print("Insira o 1º n�mero: ");
        A = Integer.parseInt(reader.readLine());
        System.out.print("Insira o 2º n�mero: ");
        B = Integer.parseInt(reader.readLine());
        if (A == B)
            C = A + B;
        else if (A % 2 == 0)
            C = A * B;
        else
            C = (double) (A + B) / 2;
        System.out.println(C);
    }
}
