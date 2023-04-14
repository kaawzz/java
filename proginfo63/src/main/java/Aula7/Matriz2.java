package Aula7;
import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) { 
                if (l == c) {
                    matriz[l][c] = l;
                } else {
                    matriz[l][c] = 0;
                }
            }
        }
        
        System.out.println("Matriz:");
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) { 
                System.out.print(matriz[l][c] + " "); // corrigido aqui
            }
            System.out.println();
        }
        
        ler.close();
    } 
}
        