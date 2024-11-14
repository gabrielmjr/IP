package com.mjr.code.ip.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float saldo = new Random().nextFloat() * 100000;
        byte escolha;
        do {
            System.out.println("\n1. Ver dados do cliente");
            System.out.println("2. Levantar");
            System.out.println("3. Transferir");
            System.out.println("0. Sair");
            System.out.print("Entrada do usu�rio: ");
            escolha = Byte.parseByte(reader.readLine());
            System.out.println();
            switch (escolha) {
                case 1:
                    System.out.println("Nome completo: Gabriel Mucacho Junior");
                    System.out.println("Data de nascimento: 24/04/2005");
                    System.out.println("N�mero de identificacao: 6454635165465N");
                    System.out.println("Tipo de identificacao: BI");
                    System.out.println("Ano de aderencia: 2024");
                    System.out.println("Planos activos: Poupanca plus");
                    System.out.println("Numero de cartoes activos: 3");
                    break;
                case 2:
                    float valorALevantar;
                    do {
                        System.out.println("\nSaldo actual: " + saldo + "MZN");
                        System.out.print("Valor a levantar: ");
                        valorALevantar = Float.parseFloat(reader.readLine());
                        if (valorALevantar < saldo)
                            break;
                        else
                            System.out.println("Saldo insuficiente, tente novamente");
                    } while (true);
                    saldo -= valorALevantar;
                    System.out.println(valorALevantar + " levantado com sucesso. \nO teu novo saldo e "
                            + saldo + ". \nFactura imprimida");
                    break;
                case 3:
                    float valorATransferir;
                    String NIB;
                    do {
                        System.out.print("Insira o NIB da conta: ");
                        NIB = reader.readLine();
                        if (NIB.length() != 22)
                            System.out.println("NIB invalido, tente novamente");
                        else
                            break;
                    } while (true);
                    do {
                        System.out.println("\nSaldo actual: " + saldo + "MZN");
                        System.out.print("Valor a transferir: ");
                        valorATransferir = Float.parseFloat(reader.readLine());
                        if (valorATransferir < saldo)
                            break;
                        else
                            System.out.println("Saldo insuficiente, tente novamente");
                    } while (true);
                    saldo -= valorATransferir;
                    System.out.println(valorATransferir + " transferido com sucesso para " + NIB + ". O teu novo saldo e "
                            + saldo + ". Factura imprimida");
                    break;
                default:
                    if (escolha < 0 || escolha > 4)
                        System.out.println("Opcao invalida. Tente novamente");
                    break;
            }
        }  while (escolha != 0);
        System.out.println("Encerrado. Obrigado pela preferencia.");
    }
}
