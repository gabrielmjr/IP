package com.mjr.code.ip.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Quantidade de numeros que deseja inserir: ");
        int quantidade = Integer.parseInt(reader.readLine());
        double[] array1 = new double[quantidade];
        double[] array2 = new double[quantidade];
        double[] soma = new double[quantidade];
        for (int i = 0; i < quantidade; i++)  {
            System.out.print("Primeiro array[" + i + "] = ");
            array1[i] = Double.parseDouble(reader.readLine());
            System.out.print("Segundo array[" + i + "] = ");
            array2[i] = Double.parseDouble(reader.readLine());
            System.out.println();
        }
        System.out.println("Imprimindo as somas-");
        for (int i = 0; i < quantidade; i++) {
            soma[i] = array1[1] + array2[i];
            System.out.println(array1[i] + " + " + array2[i] + " = " + soma[i]);
        }
    }
}
