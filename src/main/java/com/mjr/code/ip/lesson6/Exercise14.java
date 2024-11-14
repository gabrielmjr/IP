package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Numero de linhas: ");
        int linhas = Integer.parseInt(reader.readLine());
        System.out.print("Numero de colunas: ");
        int colunas = Integer.parseInt(reader.readLine());
        int[][] matriz = new int[linhas][colunas];
        int maiorValor = 0;
        int menorValor = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = Integer.parseInt(reader.readLine());
                if (i == 0 && j == 0) {
                    maiorValor = matriz[i][j];
                    menorValor = matriz[i][j];
                }
                if (matriz[i][j] > maiorValor)
                    maiorValor = matriz[i][j];
                else if (matriz[i][j] < menorValor)
                    menorValor = matriz[i][j];
                if (i == j)
                    matriz[i][j] = 3;
            }
            System.out.println();
        }
        System.out.println("O maior valor e " + maiorValor);
        System.out.println("O menor valor e " + menorValor);
        System.out.println("Imprimido a matriz alterada");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }
    }
}
