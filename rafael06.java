/*6. Leia um conjunto de N números inteiros (N<=100). Faça a divisão destes números em dois outros
conjuntos seguindo a regra: Conjunto 1 – Apenas números positivos e pares e Conjunto 2 – Apenas
números ímpares e/ou negativos.*/

import java.util.*;
public class rafael06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, v2, v3, index1, index2;

        v2 = 0;
        v3 = 0;
        index1 = 0;
        index2 = 0;

        System.out.println("6. Programa que divide um conjunto em 2 conjuntos um com números pares e \npositivos e outro com número impares e/ou negativos.");

        System.out.print("Digite quantos números deseja colocar: ");
        num = teclado.nextInt();

        int [] vetor1 = new int[num];

        for (int i = 0 ; i < vetor1.length; i++){
            System.out.print("Digite o "+(i+1)+"° número: ");
            vetor1[i] = teclado.nextInt();
        }

        for (int i = 0 ; i < vetor1.length ; i++){
            if (vetor1[i] > 0 ){
                if ((vetor1[i]%2) == 0){
                    v2++;
                }
                else {
                    v3++;
                }
            }
            else{
                v3++;
            }
        }

        int [] vetor2 = new int[v2];
        int [] vetor3 = new int[v3];

        for (int i = 0 ; i < vetor1.length ; i++){
            if (vetor1[i] > 0 ){
                if ((vetor1[i]%2) == 0){
                    vetor2[index1] = vetor1[i];
                    index1++;
                }
                else {
                    vetor3 [ index2] = vetor1[i];
                    index2++;
                }
            }
            else{
                vetor3[index2] = vetor1[i];
                index2++;
            }
        }

        System.out.println("Resultado: ");
        System.out.print("conjunto original: ");
        for (int i = 0 ; i < vetor1.length ; i++){
            System.out.print(vetor1[i]+", ");
        }
        System.out.print("\nconjunto1 : ");
        for (int i = 0 ; i < vetor2.length ; i++){
            System.out.print(vetor2[i]+", ");
        }
        System.out.print("\nconjunto2 : ");
        for (int i = 0 ; i < vetor3.length ; i++){
            System.out.print(vetor3[i]+", ");
        }

        teclado.close();
    }
}
