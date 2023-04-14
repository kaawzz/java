package Aula7;

import java.util.Scanner;

public class Matriz1 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
  
    int [] [] matriz = new int [2] [3];
    for(int l = 0; l < 2; l++){
    for(int c = 0; c < 3; c++){ 
        System.out.print("Digite o valor para a posição [" + l + "][" + c + "]: ");
        matriz [l] [c] = ler.nextInt();
    }
}
        System.out.println("Matriz:");
        for (int l = 0; l < 2; l++) {
         for (int c = 0; c < 3; c++) {
            System.out.print(matriz[l][c] + " ");
        }
            System.out.println();
        }
        
    System.out.print("Digite um número inteiro: ");
    int x = ler.nextInt();
    
    boolean existex = false;
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            if (matriz[i][j] == x) {
            existex = true;
            break;
    }
    }
} 
        if (existex) {
            System.out.println("O valor " + x + " existe na matriz.");
        } else {
            System.out.println("O valor " + x + " não existe na matriz.");
        
        ler.close();
    }
    }
}
