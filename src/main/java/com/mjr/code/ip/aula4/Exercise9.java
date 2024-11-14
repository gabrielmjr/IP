package com.mjr.code.ip.aula4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insira alguma nota: ");
        int nota = Integer.parseInt(reader.readLine());
        String tipoDeNota = null;
        if (90 <= nota && nota <= 100)
            tipoDeNota = "A";
        else if (80 <= nota && nota < 90)
            tipoDeNota = "B";
        else if (70 <= nota && nota < 80)
            tipoDeNota = "C";
        else if (60 <= nota && nota < 70)
            tipoDeNota = "D";
        else if (0 <= nota && nota < 60)
            tipoDeNota = "F";
        System.out.println("A sua nota � do tipo " + tipoDeNota);
    }
}
