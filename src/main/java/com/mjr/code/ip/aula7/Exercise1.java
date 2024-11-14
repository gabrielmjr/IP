package com.mjr.code.ip.aula7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        /*int quantidade = quantidade();
        float[] notas = preencherNotas(quantidade);
        exibirMenu(notas);*/
        exibirMenu(preencherNotas(quantidade()));
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

    private static float[] preencherNotas(int quantidade) throws IOException {
        float[] notas = new float[quantidade];
        for (int i = 0; i < quantidade; i++) {
            do {
                System.out.print("Insira a " + (i + 1) + "ª nota: ");
                notas[i] = Float.parseFloat(reader.readLine());
                if (notas[i] < 0 || notas[i] > 20)
                    System.out.println("Nota invalida, tente novamente.");
            } while (notas[i] < 0 || notas[i] > 20);
        }
        return notas;
    }

    private static void exibirMenu(float[] notas) throws IOException {
        boolean encerrar = false;
        do {
            System.out.println("1. Exibir a media das notas");
            System.out.println("2. Visualizar notas abaixo de 10");
            System.out.println("3. Sair");
            byte escolha = Byte.parseByte(reader.readLine());
            switch (escolha) {
                case 1:
                    exibirMedia(notas);
                    break;
                case 2:
                    visualizarNegativas(notas);
                    break;
                case 3:
                    encerrar = true;
                    break;
                default:
                    System.out.println("Escolha invalida, tente novamente.");
                    break;
            }
        } while (!encerrar);
    }

    private static void exibirMedia(float[] notas) {
        float somatorio = 0;
        for (float nota : notas)
            somatorio += nota;
        float media = somatorio / notas.length;
        System.out.println("A media e " + media);
    }

    private static void visualizarNegativas(float[] notas) {
        for (float nota : notas)
            if (nota < 10)
                System.out.println(nota);
    }
}
