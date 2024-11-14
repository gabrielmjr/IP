package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise16 {
	private static final int ALTURA = 0;
	private static final int PESO = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int linhas = 5;
		int colunas = 2;
		String[] nomes = new String[linhas];
		float[][] informacoes = new float[linhas][colunas];
		float[] imc = new float[linhas];
		for (int i = 0; i < linhas; i++) {
			System.out.print("Insira o teu nome: ");
			nomes[i] = reader.readLine();
			System.out.print("Insira a sua altura: ");
			informacoes[i][ALTURA] = Float.parseFloat(reader.readLine());
			System.out.print("Insira o seu peso: ");
			informacoes[i][PESO] = Float.parseFloat(reader.readLine());
			imc[i] = informacoes[i][PESO] / (informacoes[i][ALTURA] * 2);
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < linhas; i++) {
			System.out.println(imc[i]);
			if (imc[i] > 18.5 && imc[i] < 24.9)
				System.out.println(nomes[i] + " esta saudavel");
			else
				System.out.println(nomes[i] + " nao esta saudavel");
		}
		System.out.println("\nAs pessoas que estao abaixo do peso, com sobrepeso ou obesidade sao: ");
		for (int i = 0; i < linhas; i++ ) {
			if (imc[i] < 18.4 || imc[i] > 24.9)
				System.out.println(nomes[i]);
		}
	}
}
