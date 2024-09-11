/*3. Faça um programa em JAVA que carregue em um vetor os N primeiros valores da serie de Fibonacci.
Fibonacci = [1, 1, 2, 3, 5, 8, 13, 21, ....].*/

import java.util.*;
public class rafael03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int num;

        System.out.println("3.  Programa que mostre os N primeiros termos da serie de Fibonacci.");

        System.out.print("Digite o valor de N: ");
        num = teclado.nextInt();

        
        int [] fibonacci = new int [num];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2 ; i < num ; i++){
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2]; 
        }

        System.out.println("Resultado: ");
        System.out.print("Termos: ");
        for (int i = 0; i < fibonacci.length; i++){
            System.out.print(fibonacci[i]+", ");
        }

        teclado.close();
    }
}
