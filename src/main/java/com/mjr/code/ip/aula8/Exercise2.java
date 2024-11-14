package com.mjr.code.ip.aula8;

import java.io.*;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        criarFicheiro();
        escreverNoFicheiro();
        lerDoFicheiro();
    }

    private static void criarFicheiro() throws IOException {
        File file = new File("exercise2.txt");
        if (!file.exists())
            file.createNewFile();
    }

    private static void escreverNoFicheiro() throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bWriter = new BufferedWriter(new FileWriter("exercise2.txt"));

        int quantidadeDeViaturas = 0;
        do {
            System.out.print("Quantidade de viaturas: ");
            quantidadeDeViaturas = Integer.parseInt(bReader.readLine());
            if (quantidadeDeViaturas < 1)
                System.out.println("Quantidade de viaturas inválida, tente novamente.");
        } while (quantidadeDeViaturas < 1);

        String[] viaturas = new String[quantidadeDeViaturas];
        for (int i = 0; i < quantidadeDeViaturas; i++) {
            System.out.print("Nome da viatura; ");
            viaturas[i] = bReader.readLine();
            viaturas[i] += " : ";
            System.out.print("Ano de fabrico da viatura: ");
            viaturas[i] += Integer.parseInt(bReader.readLine());
            System.out.println();
        }

        for (String viatura : viaturas) {
            bWriter.write(viatura);
            bWriter.newLine();
        }
        bWriter.close();
    }

    private static void lerDoFicheiro() throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader("exercise2.txt"));
        String line;
        while ((line = bReader.readLine()) != null)
            System.out.println(line);
    }
}
