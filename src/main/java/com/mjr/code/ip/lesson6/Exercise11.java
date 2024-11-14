package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantidade = 10;
        int[] valores = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            do {
                System.out.print("Valores[" + i + "] = ");
                valores[i] = Integer.parseInt(reader.readLine());
                if (valores[i] < 20 || valores[i] > 200)
                    System.out.println("Valor invalido, tente novamente.");
            } while (valores[i] < 20 || valores[i] > 200);
        }
        int vezesRepetidas;
        StringBuilder valoresRepetidos = new StringBuilder();
        int[] valoresEmCrescente = valores.clone();
        int[] valoresEmDecrescente = valores.clone();
        for (int i = 0; i < quantidade; i++) {
            vezesRepetidas = 0;
            for (int j = 0; j < quantidade; j++) {
                if (valores[i] == valores[j])
                    vezesRepetidas++;
                if (vezesRepetidas == 2)
                    valoresRepetidos.append(" ").append(valores[i]);
            }
            for (int j = 0; j < quantidade - 1; j++) {
                if (valoresEmCrescente[j] > valoresEmCrescente[j + 1]) {
                    int temp = valoresEmCrescente[j];
                    valoresEmCrescente[j] = valoresEmCrescente[j + 1];
                    valoresEmCrescente[j + 1] = temp;
                }
                if (valoresEmDecrescente[j] < valoresEmDecrescente[j + 1]) {
                    int temp = valoresEmDecrescente[j];
                    valoresEmDecrescente[j] = valoresEmDecrescente[j + 1];
                    valoresEmDecrescente[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Os valores repetidos s�o: " + valoresRepetidos);
        System.out.println();
        System.out.println("Imprimindo o array em ordem crescente");
        for (int i = 0; i < quantidade; i++)
            System.out.print(valoresEmCrescente[i] + " ");
        System.out.println();
        System.out.println("Imprimindo o array em ordem decrescente");
        for (int i = 0; i < quantidade; i++)
            System.out.print(valoresEmDecrescente[i] + " ");
    }
}
