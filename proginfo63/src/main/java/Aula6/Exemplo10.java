package Aula6;

import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        int[] X = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] Y = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] R = new int[20];

        for (int i = 0; i < 10; i++) {
            R[2*i] = X[i];     
            R[2*i+1] = Y[i];  
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(R[i] + " ");
        }
    }
    }


