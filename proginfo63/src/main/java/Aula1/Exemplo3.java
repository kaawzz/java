
package Aula1;

import java.util.Scanner;

public class Exemplo3 {
    public static void  main(String[] args){ 
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o raio do circulo: ");
        double raio = ler.nextDouble();
        
        double total = Math.pow(raio, 2 )* Math.PI;
        
        System.out.printf("O valor da area é: %.2f", total);
    }
    
}
