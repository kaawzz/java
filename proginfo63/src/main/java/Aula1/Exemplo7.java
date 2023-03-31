package Aula1;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Escreva o comprimento da parede da cozinha: ");
        float compri = ler.nextFloat();
        
        System.out.printf("Escreva a largura da parede da cozinha: ");
        float largu = ler.nextFloat();
        
        System.out.printf("Escreva a altura da parede da cozinha: ");
        float altu = ler.nextFloat();
        
         System.out.printf("Escreva quantos metros as portas e as janelas ocupam: ");
         float pj = ler.nextFloat();
         
         largu = largu * 2 * altu;
         compri = compri * 2 * altu;
         
         double total = (compri+largu-pj) / 1.5;
         
         System.out.printf("A quantidade de azulejos que serão neceassarios é %.2f", total);
         
         
         
    }
    
}
