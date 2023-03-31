package Aula6;

import java.util.Scanner;

public class Exemplo9 {
    public static void main(String[] args){
    Scanner ler = new Scanner (System.in);
    
    int [] r = {-4  , -3, -2, -1, 0};
    int [] s = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   
    
     int[] x = new int[15];
        System.arraycopy(r, 0, x, 0, r.length);
        System.arraycopy(s, 0, x, r.length, s.length);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
}
}