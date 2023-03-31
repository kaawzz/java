
package Aula1;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite a sua altura: ");
        float altura = ler.nextFloat();
        
        System.out.printf("Digite seu peso: ");
        float peso  = ler.nextFloat();
        
        float IMC = peso/(altura*altura);
        
        System.out.printf("O seu IMC é %.2f",IMC);
    }
    
}
