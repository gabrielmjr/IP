package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("N�mero de estudantes: ");
        int quantidade = Integer.parseInt(reader.readLine());
        int numeroDeNotas = 2;
        float notaLida;
        String[] nomes = new String[quantidade];
        float[][] notas = new float[quantidade][numeroDeNotas];
        for (int i = 0; i < quantidade; i++){
            System.out.print("Nome do estudante " + (i + 1) + ": ");
            nomes[i] = reader.readLine();
            for (int j = 0; j < numeroDeNotas; j++) {
                do {
                    System.out.print("Nota " + (j + 1) + ": ");
                    notaLida = Float.parseFloat(reader.readLine());
                    if (notaLida < 0 || notaLida > 20)
                        System.out.println("Nota inv�lida, insira novamente.");
                } while (notaLida < 0 || notaLida > 20);
                notas[i][j] = notaLida;
            }
            System.out.println();
        }
        System.out.println("Imprimindo as medias\n");
        float somaDasNotas;
        float media;
        for (int i = 0; i < quantidade; i++) {
            System.out.print(nomes[i]);
            somaDasNotas = 0F;
            for (int j = 0; j < numeroDeNotas; j++) {
                somaDasNotas += notas[i][j];
            }
            media = somaDasNotas / numeroDeNotas;
            System.out.println(" " + media);
         }
    }
}
