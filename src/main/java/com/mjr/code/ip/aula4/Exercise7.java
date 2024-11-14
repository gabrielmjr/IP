package com.mjr.code.ip.aula4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float precoDoProduto, valorAPagar;
        int quantidade;
        String nomeDoProduto;
        System.out.print("Insira o nome do produto: ");
        nomeDoProduto = reader.readLine();
        System.out.print("Insira o preço do produto: ");
        precoDoProduto = Float.parseFloat(reader.readLine());
        System.out.print("Insira a quantidade a comprar: ");
        quantidade = Integer.parseInt(reader.readLine());
        valorAPagar = precoDoProduto * quantidade;
        if (quantidade > 7)
            valorAPagar -= (float) (valorAPagar * 0.3);
        else if (quantidade >= 5)
            valorAPagar -= (float) (valorAPagar * 0.1);
        System.out.println("Nome: " + nomeDoProduto +
                "\nPreço por unidade: " + precoDoProduto
                + "\nQuantidade: " + quantidade
                + "\nValor a pagar: " + valorAPagar);
    }
}
