package com.mjr.code.ip.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float valorDiario = 400;
        System.out.print("Insira o n�mero de dias: ");
        int numeroDeDias = Integer.parseInt(reader.readLine());
        float valorAPagar = valorDiario * numeroDeDias;
        if (numeroDeDias >= 7)
            valorAPagar -= (float) (valorAPagar * 0.5);
        else if (numeroDeDias >= 3)
            valorAPagar -= (float) (valorAPagar * 0.3);
        System.out.println("Para " + numeroDeDias + " ter� de pagar " + valorAPagar);
    }
}
