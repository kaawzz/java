
package Aula1;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Quanto você ganha por hora: ");
        float salario = ler.nextFloat();
        
        System.out.printf("Quantas horas você trabalha por mês: ");
        float horas = ler.nextFloat();
        
        float total = salario*horas;
        
        System.out.printf("O seu salario total no mês é: %.2f ", total);
        
        
    }
}
