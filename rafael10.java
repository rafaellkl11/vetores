/*10. Faça um programa que preencha um vetor A de 10 posições e calcule o valor de S da seguinte forma:

S = (a[0] - a[9]) 2 + (a[1] - a[8])2 + (a[2] - a[7])2 + (a[3] - a[6])2 + (a[4] - a[5])2*/

import java.util.*;
public class rafael10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [] a = new double[10];
        double s;

        s = 0; 

        System.out.println("10. Programa que calcula a partir de um vetor A");

        for (int i = 0 ; i<  a.length ; i++){
            System.out.print("Digite o "+(i+1)+"° elemento de A: ");
            a[i] = teclado.nextDouble();
        }

        for (int i = 0 ; i < (a.length)/2 ; i++){
            s = s + Math.pow((a[i]-a[a.length-1-i]),2);
        }

        System.out.println("Resultado: ");
        System.out.println("S = "+s);

        teclado.close();
    }
}
