package com.mjr.code.ip.aula8;

import java.io.*;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        criarFicheiro();
        guardarInfoDeViauturas();
        lerDoFicheiro();
    }

    private static void criarFicheiro() throws IOException {
        File file = new File("exercise1.txt");
        if (!file.exists())
            file.createNewFile();
    }

    private static void guardarInfoDeViauturas() throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bWriter = new BufferedWriter(new FileWriter("exercise1.txt"));

        System.out.print("Número de viaturas: ");
        int quantidadeDeViaturas = Integer.parseInt(bReader.readLine());

        for (int i = 0; i < quantidadeDeViaturas; i++) {
            System.out.print("Nome da viatura " + (i + 1) + ": ");
            String marca = bReader.readLine();
            System.out.print("Ano de fabrico da viatura " + (i + 1) + ": ");
            int anoDeFabrico = Integer.parseInt(bReader.readLine());
            bWriter.write(marca + ":" + anoDeFabrico);
            bWriter.newLine();
            System.out.println();
        }
        bWriter.close();
    }

    private static void lerDoFicheiro() throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader("exercise1.txt"));
        String line;
        while ((line = bReader.readLine()) != null)
            System.out.println(line);
    }
}
