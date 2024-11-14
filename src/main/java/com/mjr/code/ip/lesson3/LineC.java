package com.mjr.code.ip.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
* Verifica se o estudante est� admitido, dispensado ou excluido atrav�s do calculo da media
 */
public class LineC {
    public static void main(String[] args) throws IOException {
        float nota1, nota2, nota3, media;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insira a 1ª nota: ");
        nota1 = Float.parseFloat(reader.readLine());
        System.out.print("Insira a 2ª nota: ");
        nota2 = Float.parseFloat(reader.readLine());
        System.out.print("Insiar a 3ª nota: ");
        nota3 = Float.parseFloat(reader.readLine());
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A sua m�dia � " + media);
    }
}
