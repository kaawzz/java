package Aula6;

import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];

        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Digite um valor para excluir:");
        int valorExcluir = ler.nextInt();

        int indexExcluir = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorExcluir) {
                indexExcluir = i;
                break;
            }
        }

        if (indexExcluir == -1) {
            System.out.println("Valor não encontrado no vetor.");
        } else {
     
            for (int i = indexExcluir; i < vetor.length - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[vetor.length - 1] = 0;

            System.out.println("Novo vetor:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }
    
}
