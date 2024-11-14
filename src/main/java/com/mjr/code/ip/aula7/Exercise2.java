package com.mjr.code.ip.aula7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        int quantidade = quantidade();
        System.out.println("Preenchendo os valores");
        int[] valores = preencherArray(quantidade);
        System.out.println("\nImprimindo os valores");
        exibirArray(valores);
        System.out.println("\nImprimindo os menores do que 30");
        exibirMenorDoQue30(valores);
    }

    private static int quantidade() throws IOException {
        int quantidade = 0;
        do {
            System.out.print("Quantas notas deseja ler?: ");
            quantidade = Integer.parseInt(reader.readLine());
            if (quantidade <= 0)
                System.out.println("Quantidade invalida, tente novamente.");
        } while (quantidade <= 0);
        return quantidade;
    }

    private static int[] preencherArray(int quantidade) throws IOException {
        int[] valores = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Insira o " + (i + 1) + "ª valor: ");
            valores[i] = Integer.parseInt(reader.readLine());
        }
        return valores;
    }

    private static void exibirArray(int[] valores) {
        for (int valor : valores)
            System.out.println(valor);
    }

    private static void exibirMenorDoQue30(int[] valores) {
        for (int valor : valores)
            if (valor < 30)
                System.out.println(valor);
    }
}
