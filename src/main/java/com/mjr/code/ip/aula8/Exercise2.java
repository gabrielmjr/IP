package com.mjr.code.ip.aula8;

import java.io.*;

public class Exercise2 {
    private static BufferedReader bReader;

    public static void main(String[] args) throws IOException {
        bReader = new BufferedReader(new InputStreamReader(System.in));
        File file = criarFicheiro();
        String[] viaturas = lerInformacoesDeViaturas();
        escreverNoFicheiro(viaturas, file);
        lerDoFicheiro(file);
    }

    private static File criarFicheiro() throws IOException {
        System.out.print("Nome do ficheiro: ");
        String nome = bReader.readLine();
        File file = new File(nome);
        if (!file.exists())
            file.createNewFile();
        return file;
    }

    private static String[] lerInformacoesDeViaturas() throws IOException {
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
        }

        return viaturas;
    }

    private static void escreverNoFicheiro(String[] viaturas, File file) throws IOException {
        FileWriter fWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        for (String viatura : viaturas)
            bWriter.append(viatura)
                    .append(System.lineSeparator());
        bWriter.close();
        fWriter.close();
    }

    private static void lerDoFicheiro(File file) throws IOException {
        FileReader fReader = new FileReader(file);
        bReader = new BufferedReader(fReader);
        String line;
        while ((line = bReader.readLine()) != null)
            System.out.println(line);
    }
}
