package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tamanho = 15;
        int[] numerosPrimos = new int[tamanho];
        int preenchidos = 0;
        int iterador = 0;
        int divisores;
        for (int i = 0; ; i++) {
            divisores = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    divisores++;
            if (divisores == 2) {
                numerosPrimos[iterador] = i;
                iterador++;
                preenchidos++;
            }
            if (preenchidos == 15)
                break;
        }
        System.out.println();
        System.out.println("O maior numero primo do array e " + numerosPrimos[tamanho - 1]);
        System.out.println();
        int valorLido;
        do {
            System.out.println("Insira -1 para encerrar.");
            System.out.println("Posicao do valor: ");
            valorLido = Integer.parseInt(reader.readLine());
            boolean valorEncontrado = false;
            for (int i = 0; i < tamanho; i++)
                if (numerosPrimos[i] == valorLido) {
                    System.out.println(valorLido + " esta na posicao " + i);
                    valorEncontrado = true;
                }
            if (!valorEncontrado && valorLido != -1)
                System.out.println("O valor nao faz parte do array");
            System.out.println();
        } while (valorLido != -1);
        System.out.println("Encerrando...");
    }
}
