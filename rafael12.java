/*12. Faça um programa que preencha um vetor com 10 números digitados pelo usuário e em seguida crie e
mostre um vetor ordenado de forma crescente e outro vetor ordenado de forma decrescente.*/

import java.util.*;
public class rafael12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor [] = new int [10];
        int vetorCres [] = new int [vetor.length];
        int vetorDecres [] = new int [vetor.length];
        int validacao, aux;

        validacao = 0;

        System.out.println("12. Programa que ordena um vetor de forma crescente e outro de forma decrescente");

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.print("Digite o "+(i+1)+"° valor: ");
            vetor[i] = teclado.nextInt();
        }

        for (int i = 0 ; i < vetor.length ; i++){
            vetorCres[i] = vetor[i];
            vetorDecres[i] = vetor[i];
        }

        while (validacao != vetor.length-1) {
            validacao = 0;
            for (int i = 0 ; i < (vetorCres.length-1) ; i++){
                if(vetorCres[i] > vetorCres[i+1]){
                    aux = vetorCres[i];
                    vetorCres[i] = vetorCres[i+1];
                    vetorCres[i+1] = aux;
                }
                else {
                    validacao++;
                }
            }
        }

        aux = 0;
        validacao = 0;

        while (validacao != vetor.length-1) {
            validacao = 0;
            for (int i = 0 ; i < (vetorDecres.length-1) ; i++){
                if(vetorDecres[i] < vetorDecres[i+1]){
                    aux = vetorDecres[i];
                    vetorDecres[i] = vetorDecres[i+1];
                    vetorDecres[i+1] = aux;
                }
                else {
                    validacao++;
                }
            }
        }

        System.out.println("Resultado: ");
        System.out.print("Crescente: ");
        for(int i = 0 ; i < vetor.length ; i++){
            System.out.print(vetorCres[i]+", ");
        }
        System.out.print("\nDescrescente: ");
        for(int i = 0 ; i < vetor.length ; i++){
            System.out.print(vetorDecres[i]+", ");
        }

        teclado.close();
    }
}
