package com.mjr.code.ip.aula3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Tendo 4 marcas de carros diferentes, escolher a marca que deseja, ap�s a escolha,
* deve informar o ano e o Pa�s de fabrico
 */
public class LineE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int carroEscolhido;
        System.out.println("Escolha um carro");
        System.out.println("1. Renault Stepway Zen 1.0");
        System.out.println("2. Volkswagen Polo 1.0T");
        System.out.println("3. Chevrolet Onix Plus 1.0");
        System.out.println("4. BMW I4 M50");
        carroEscolhido = Integer.parseInt(reader.readLine());
        switch (carroEscolhido) {
            case 1:
                System.out.println("Fabricado em Brasil em 2008");
                break;
            case 2:
                System.out.println("Fabricado em Brasil em 2002");
                break;
            case 3:
                System.out.println("Fabricado em Brasil em 2013");
                break;
            case 4:
                System.out.println("Fabricado Brasil em 2021");
                break;
            default:
                System.out.println("Escolha inv�lida");
                break;
        }
    }
}
