package com.mjr.code.ip.lesson8;

import java.io.*;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        criarFicheiro();
        escreverNoFicheiro();
        lerDoFicheiro();
    }

    private static void criarFicheiro() throws IOException {
        File file = new File("exercise3.txt");
        if (!file.exists())
            file.createNewFile();
    }

    private static void escreverNoFicheiro() throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bWriter = new BufferedWriter(new FileWriter("exercise3.txt"));

        int quantidadeDeEstudantes;
        do {
            System.out.print("Número de estudantes: ");
            quantidadeDeEstudantes = Integer.parseInt(bReader.readLine());
            if (quantidadeDeEstudantes < 1)
                System.out.println("Quantidade de estudantes inválida");
        } while (quantidadeDeEstudantes < 1);

        for (int i = 0; i < quantidadeDeEstudantes; i++) {
            System.out.print("Nome do estudante " + (i + 1) + ": ");
            bWriter.write(bReader.readLine());
            float notaDoEstudante;
            do {
                System.out.print("Nota do estudante: ");
                notaDoEstudante = Integer.parseInt(bReader.readLine());
                if (notaDoEstudante < 0 || notaDoEstudante > 20)
                    System.out.println("Nota inválida, tente novamente.");
            } while (notaDoEstudante < 0 || notaDoEstudante > 20);

            bWriter.write(" : " + notaDoEstudante);
            bWriter.newLine();
            System.out.println();
        }

        bWriter.close();
    }

    private static void lerDoFicheiro() throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader("exercise3.txt"));
        String line;
        int numeroDeEstudantes = 0;
        System.out.println("Os estudantes com nota superior a 13 são: ");
        while ((line = bReader.readLine()) != null) {
            numeroDeEstudantes++;
            String[] infoDeEstudante = line.split(" : ");
            if (Float.parseFloat(infoDeEstudante[1]) > 13) {
                System.out.println(line);
            }
        }
        System.out.println("O número total de estudantes é " + numeroDeEstudantes);
    }
}
