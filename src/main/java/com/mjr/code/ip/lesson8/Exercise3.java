package com.mjr.code.ip.lesson8;

import java.io.*;

public class Exercise3 {
    private static final int NOTA = 1;

    private static BufferedReader bReader;

    public static void main(String[] args) throws IOException {
        bReader = new BufferedReader(new InputStreamReader(System.in));
        File file = criarFicheiro();
        String[] infoDeEstudantes = lerInfoDeEstudantes();
        escreverNoFicheiro(infoDeEstudantes, file);
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

    private static String[] lerInfoDeEstudantes() throws IOException {
        int quantidadeDeEstudantes;
        do {
            System.out.print("Número de estudantes: ");
            quantidadeDeEstudantes = Integer.parseInt(bReader.readLine());
            if (quantidadeDeEstudantes < 1)
                System.out.println("Quantidade de estudantes inválida");
        } while (quantidadeDeEstudantes < 1);

        String[] infoDeEstudantes = new String[quantidadeDeEstudantes];
        for (int i = 0; i < quantidadeDeEstudantes; i++) {
            System.out.print("Nome do estudante " + (i + 1) + ": ");
            infoDeEstudantes[i] = bReader.readLine();
            infoDeEstudantes[i] += " : ";
            float notaDoEstudante;
            do {
                System.out.print("Nota do estudante: ");
                notaDoEstudante = Integer.parseInt(bReader.readLine());
                if (notaDoEstudante < 0 || notaDoEstudante > 20)
                    System.out.println("Nota inválida, tente novamente.");
            } while (notaDoEstudante < 0 || notaDoEstudante > 20);
            infoDeEstudantes[i] += notaDoEstudante;
            System.out.println();
        }

        return infoDeEstudantes;
    }

    private static void escreverNoFicheiro(String[] infoDeEstudantes, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        for (String infoDeEstudante : infoDeEstudantes)
            bWriter.append(infoDeEstudante).append(System.lineSeparator());
        bWriter.close();
        fileWriter.close();
    }

    private static void lerDoFicheiro(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        bReader = new BufferedReader(fileReader);
        String line;
        int numeroDeEstudantes = 0;
        System.out.println("Os estudantes com nota superior a 13 são: ");
        while ((line = bReader.readLine()) != null) {
            numeroDeEstudantes++;
            String[] infoDeEstudante = line.split(" : ");
            if (Float.parseFloat(infoDeEstudante[NOTA]) > 13) {
                System.out.println(line);
            }
        }
        System.out.println("O número total de estudantes é " + numeroDeEstudantes);
    }
}
