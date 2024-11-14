package com.mjr.code.ip.aula4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insira algum valor i: ");
        int i = Integer.parseInt(reader.readLine());
        System.out.print("Insira algum valor a: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Insira algum valor b: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Insira algum valor c: ");
        int c = Integer.parseInt(reader.readLine());
        if (i % 2 == 0) {
            double media = (double) (a + b + c) / 3;
            System.out.println("A m�dia �: " +  media);
        } else if (i > 35) {
            if (a > b && a > c)
                System.out.println("O maior � " + a);
            else if (b > a && b > c)
                System.out.println("O maior � " + b);
            else if (c > a && c > b)
                System.out.println("O maior � " + c);
        } else {
            int soma = a + b + c;
            System.out.println("A soma � " + soma);
        }
    }
}
