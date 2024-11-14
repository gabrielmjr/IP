package com.mjr.code.ip.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        byte quantidadeDeBrincadeiras = quantidadeDeBrincadeiras();
        float valorAPagar = valorAPagar(quantidadeDeBrincadeiras);
        System.out.println("Brincadeiras: " + quantidadeDeBrincadeiras);
        System.out.println("Valor a pagar " + valorAPagar);
    }

    private static byte quantidadeDeBrincadeiras() throws IOException {
        byte quantidade = 0;
        do {
            System.out.print("Quantas brincadeiras quer comprar?: ");
            quantidade = Byte.parseByte(reader.readLine());
            if (quantidade <= 0)
                System.out.println("Quantidade invalida, tente novamente.");
        } while (quantidade <= 0);
        return quantidade;
    }

    private static float valorAPagar(short quantidadeDeBrincadeiras) {
        float precoPorBrincadeira;
        if (quantidadeDeBrincadeiras > 9)
            precoPorBrincadeira = 100F;
        else if (quantidadeDeBrincadeiras > 5)
            precoPorBrincadeira = 300F;
        else
            precoPorBrincadeira = 550F;
        return quantidadeDeBrincadeiras * precoPorBrincadeira;
    }
}
