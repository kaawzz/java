package Aula1;
import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Digite a temperatura em Fahrenheit: ");
        float Fah = ler.nextFloat();
        
        float celsius  = (5 * (Fah-32) / 9);
        
        System.out.printf("A conversão da temperatura de Fahrenheit para Celsius é: %.2f", celsius);
        
        
    }
    
    
}
