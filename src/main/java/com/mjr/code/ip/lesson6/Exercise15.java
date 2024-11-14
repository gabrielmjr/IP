package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escolha entre i/I, p/P ou b/B");
        char escolha = reader.readLine().charAt(0);
	int indice;
	int contador;
        switch (escolha) {
            case 'I', 'i':
                int[] impares = new int[100];
		indice = 0;
		contador = 1;
		while (true) {
			if (contador % 2 != 0) {
				impares[indice] = contador;
				indice++;
			}
			if (indice == 100)
				break;
			contador++;
		}
		for (int i = 0; i < impares.length; i++)
			System.out.print(impares[i] + " ");
		System.out.println();
                break;
            case 'P' | 'p':
		int[] pares = new int[25];
		contador = 0;
		indice = 0;
		while (true) {
			if (contador % 2 == 0) {
				pares[indice] = contador;
				indice++;
			}
			if (indice == 25)
				break;
			contador++;
		}
		for (int i = pares.length - 1; i >= 0; i--)
			System.out.print(pares[i] + " ");
		System.out.println();
                break;
            case 'B' | 'b':
		// Os valores dos multiplos de 7 sao numeros unicos que formam linhas, nao vectores bidimensionais, o exercicio nao faz sentido
                break;
            default:
                System.out.println("Escolha inv�lida");
                break;
        }
    }
}
