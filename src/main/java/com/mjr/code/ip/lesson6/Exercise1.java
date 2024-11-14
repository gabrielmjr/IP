package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numerosPares = 0;
        int tamanho = 5;
        int[] valores = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            int valorLido;
            do {
                System.out.print("valores[" + i + "] = ");
                valorLido = Integer.parseInt(reader.readLine());
                if (valorLido < 45 || valorLido > 100)
                    System.out.println("Valor inv�lido, tente novamente.");
            } while (valorLido < 45 || valorLido > 100);
            valores[i] = valorLido;
        }
        System.out.println("Imprimindo os valores");
        for (int i = 0; i < tamanho; i++) {
            if (valores[i] % 2 == 0)
                numerosPares++;
            System.out.print(valores[i] + " ");
        }
        System.out.println("\nO array tem " + numerosPares + " numeros pares");
    }
}
