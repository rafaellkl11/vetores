/*2. Faça um programa que solicite o preenchimento de um vetor com 10 posições chamado
VetorOriginal. Em seguida, o programa deve armazenar os números digitados de maneira invertida
em vetor chamado VetorInvertido.*/

import java.util.*;
public class rafael02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int [] vetorOriginal = new int[10];
        int [] vetorIvertido = new int[10];

        System.out.println("2.Programa que inverte um vetor de 10 posições.");

        for (int i = 0 ; i < (vetorOriginal.length); i++){
            System.out.print("Digite o "+(i+1)+"° valor: ");
            vetorOriginal[i] = teclado.nextInt();
        }

        for (int i = 0; i < (vetorOriginal.length); i++){
            vetorIvertido[i] = vetorOriginal[(vetorOriginal.length-1)-i];
        }

        System.out.println("Resultado: ");
        System.out.print("Vetor original: ");
        for (int i = 0; i < (vetorOriginal.length); i++){
            System.out.print(vetorOriginal[i]+", ");
        }
        System.out.print("\nVetor invertido: ");
        for (int i = 0; i < (vetorIvertido.length); i++){
            System.out.print(vetorIvertido[i]+", ");
        }

        teclado.close();
    }
}
