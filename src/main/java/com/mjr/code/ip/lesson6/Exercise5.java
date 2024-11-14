package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantidade = 50;
        int[] valores = new int[quantidade];
        int valorLido;
        for (int i = 0; i < quantidade; i++) {
            do {
                System.out.print("Valores[" + i + "] = ");
                valorLido = Integer.parseInt(reader.readLine());
                if (valorLido < 20 || valorLido > 200)
                    System.out.println("Valor invalido, tente novamente");
            } while (valorLido < 20 || valorLido > 200);
            valores[i] = valorLido;
        }
        int quantidadeDesejada =0;
        for (int i = 0; i < quantidade; i++)
            if (valores[i] % 2 == 0 && valores[i] % 5 == 0)
                quantidadeDesejada++;
        System.out.println("Quantidade de numeros pares divisiveis por 5: " + quantidadeDesejada);
    }
}
