/*11. Faça um programa que carregue dois vetores de dez elementos e mostre um terceiro vetor resultante da
intercalação desses dois vetores.*/

import java.util.*;
public class rafael11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int [] vetor1 = new int [10];
        int [] vetor2 = new int [vetor1.length];
        int [] vetor3 = new int [vetor1.length+vetor2.length];

        System.out.println("11. Programa que intercala 2 vetores de 10 elementos cada.");


        System.out.println("\nVetor 1: ");
        for (int i = 0 ; i < vetor1.length ; i++){
            System.out.print("Digite o "+(i+1)+"° valor do 1° vetor: ");
            vetor1[i] = teclado.nextInt();
        }

        System.out.println("\nVetor 2: ");
        for (int i = 0 ; i < vetor2.length ; i++){
            System.out.print("Digite o "+(i+1)+"° valor do 2° vetor: ");
            vetor2[i] = teclado.nextInt();
        }

        for (int i = 0 ; i < vetor1.length ; i++){
            vetor3[i*2] = vetor1[i]; 
        }

        for (int i = 0 ; i < vetor2.length ; i++){
            vetor3[i*2+1] = vetor2[i];
        }

        System.out.println("Resultado: ");
        System.out.print("Vetor 3: ");
        for (int i = 0 ; i < vetor3.length ; i++){
            System.out.print(vetor3[i]+", ");
        }

        teclado.close();
    }
}
