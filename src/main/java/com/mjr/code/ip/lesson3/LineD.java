package com.mjr.code.ip.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
* Digitar 3 n�meros verificar qual deles � o maior
 */
public class LineD {
    public static void main(String[] args) throws IOException {
        int num1, num2, num3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insira o 1º n�mero: ");
        num1 = Integer.parseInt(reader.readLine());
        System.out.print("Insira o 2º n�mero: ");
        num2 = Integer.parseInt(reader.readLine());
        System.out.print("Insira o 3º n�mero: ");
        num3 = Integer.parseInt(reader.readLine());
        if (num1 > num2 && num1 > num3)
            System.out.println("O maior n�mero � " + num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("O maior n�mero � " + num2);
        else if (num3 > num1 && num3 > num2)
            System.out.println("O maior n�mero � " + num3);
    }
}
