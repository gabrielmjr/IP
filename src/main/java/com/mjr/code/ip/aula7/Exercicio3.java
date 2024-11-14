package com.mjr.code.ip.aula7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio3 {
    public static void main(String[] args) throws IOException {
        short idade = lerIdade();
        String fase = identificarFase(idade);
        System.out.println("A sua fase e do(a) " + fase);
        exibirAnoDeNascimento(idade);
    }

    private static short lerIdade() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        short idade = 0;
        do {
            System.out.print("Insira a sua idade: ");
            idade = Short.parseShort(reader.readLine());
            if (idade < 0)
                System.out.println("Idade invalida, tente novamente");
        } while (idade < 0);
        return idade;
    }

    private static String identificarFase(short idade) {
        if (idade < 18)
            return "crianca";
        else if (idade < 35)
            return "jovem";
        else if (idade < 60)
            return "adulto";
        else
            return "idoso";
    }

    private static void exibirAnoDeNascimento(short idade) {
        long anoDeNascimento = anoActual() - idade;
        System.out.println("O seu ano de nascimento e " + anoDeNascimento);
    }

    private static long anoActual() {
        long agoraEmMilisegundos = System.currentTimeMillis();
        return agoraEmMilisegundos / 1000 / 60 / 60 / 24 / 365 + 1970;
        // agoraEmMilisegundos / segundos / minuto / hora / dia / ano + ano dos computadores
    }
}
