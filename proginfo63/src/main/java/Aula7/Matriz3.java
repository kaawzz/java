package Aula7;

import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int somaLinha3 = 0;
        int somaColuna3 = 0;
        int somaMatriz = 0;

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            somaLinha3 += matriz[3][i];
            somaColuna3 += matriz[i][3];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somaMatriz += matriz[i][j];
            }
        }

        System.out.println("Soma da linha 3: " + somaLinha3);
        System.out.println("Soma da coluna 3: " + somaColuna3);
        System.out.println("Soma de todos os elementos: " + somaMatriz);

        ler.close();
    }
}
