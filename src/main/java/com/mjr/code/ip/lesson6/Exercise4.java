package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantidade = 3;
        String[] nomes = new String[quantidade];
        float[] precos = new float[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print((i + 1) + "º Produto: ");
            nomes[i] = reader.readLine();
            System.out.print("Preco do " + (i + 1) + " º produto: ");
            precos[i] = Float.parseFloat(reader.readLine());
            System.out.println();
        }
        System.out.println("Imprimindo os produtos e seus respectivos precos\n");
        for (int i = 0; i < quantidade; i++)
            System.out.println((i + 1) + ". Nome: " + nomes[i] + ", preco: " + precos[i] + "Mts");
    }
}
