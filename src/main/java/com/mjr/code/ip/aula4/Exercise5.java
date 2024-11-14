package com.mjr.code.ip.aula4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insira algum dia: ");
        int dia = Integer.parseInt(reader.readLine());
        System.out.println("Insira algum ano: ");
        String anoTemporario = reader.readLine();
        int ano = Integer.parseInt(anoTemporario.substring(anoTemporario.length() - 2));
        if (dia * 6 == ano)
            System.out.println("A data � m�gica.");
        else
            System.out.println("A data n�o � m�gica.");
    }
}
