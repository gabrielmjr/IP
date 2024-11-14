package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int linhas = 2;
        int colunas = 3;
        float[][] notas = new float[linhas][colunas];
        float notaLida;
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++) {
                do {
                    System.out.print("Nota[" + i + "][" + j + "] = ");
                    notaLida = Float.parseFloat(reader.readLine());
                    if (notaLida < 0 || notaLida > 20)
                        System.out.println("Nota invalida,tente novamente");
                } while (notaLida < 0 || notaLida > 20);
                notas[i][j] = notaLida;
            }
        System.out.println("Imprimindo os valores impares");
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                if (notas[i][j] % 2 == 1)
                    System.out.print(notas[i][j] + " ");
    }
}
