package Aula6;

import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
         int[] x = {1, 2, 3, 4, -5, -6, -7, -8, -9, -10};
        int[] r = new int[x.length]; 
        
        int indexR = 0;
        
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                r[indexR] = x[i];
                indexR++;
            }
        }
        
        System.out.print("Vetor X: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor R: ");
        for (int i = 0; i < indexR; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
    }
    }

