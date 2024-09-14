/*13. Intercalação é o processo utilizado para construir uma tabela ordenada, de tamanho n+m, a partir de
duas tabelas já ordenadas de tamanhos n e m. Por exemplo, a partir das tabelas A = {1,3,6,7} e B =
{2,4,5}, construímos a tabela C = {1,2,3,4,5,6,7}. Faça um algoritmo que:
a. Leia NA, número de elementos do conjunto A (NA<=100);
b. Leia, em seguida, os elementos do conjunto A;
c. Leia, após o valor de NB, número de elementos do conjunto B(NB<=100);
d. Leia, finalmente, os elementos do conjunto B;
e. Crie e imprima um conjunto C, ordenado, de tamanho NA + NB, a partir dos conjuntos originais A e
B.
Obs: Considere os elementos de A e B como inteiros e já ordenados.*/

import java.util.*;
public class rafael13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num, validacao, aux, indexA, indexB;

        indexA = 0;
        indexB = 0;

        validacao = 0;

        System.out.println("13. Programa que intercala dois conjuntos");

        System.out.println("\nConjunto A: ");
        
        System.out.print("Digite o tamanho do conjunto A: ");
        num = teclado.nextInt();
        while (num > 100){
            System.out.print("Número invalido. \nDigite um número menor de 100: ");
            num = teclado.nextInt();
        }

        int [] A = new int[num];

        for (int i = 0 ; i < A.length ; i++){
            System.out.print("Digite o "+(i+1)+"° valor: ");
            A[i] = teclado.nextInt();
        }

        num = 0;

        System.out.println("\nConjunto B:");

        System.out.print("Digite o tamanho do conjunto B: ");
        num = teclado.nextInt();
        while (num > 100){
            System.out.print("Número invalido. \nDigite um número menor de 100: ");
            num = teclado.nextInt();
        }

        int [] B = new int[num];

        for (int i = 0 ; i < B.length ; i++){
            System.out.print("Digite o "+(i+1)+"° valor: ");
            B[i] = teclado.nextInt();
        }

        while (validacao != A.length-1) {
            validacao = 0;
            for (int i = 0 ; i < (A.length-1) ; i++){
                if(A[i] > A[i+1]){
                    aux = A[i];
                    A[i] = A[i+1];
                    A[i+1] = aux;
                }
                else {
                    validacao++;
                }
            }
        }

        validacao = 0;

        while (validacao != B.length-1) {
            validacao = 0;
            for (int i = 0 ; i < (B.length-1) ; i++){
                if(B[i] > B[i+1]){
                    aux = B[i];
                    B[i] = B[i+1];
                    B[i+1] = aux;
                }
                else {
                    validacao++;
                }
            }
        }

        int [] C = new int[A.length+B.length];

        for (int i = 0 ; i < C.length ; i++){
            if (indexA < A.length && indexB < B.length){
                if(A[indexA] <= B[indexB]){
                    C[i] = A[indexA];
                    indexA++;
                }
                else if (B[indexB] <= A[indexA]){
                    C[i] = B[indexB];
                    indexB++;
                }
            }
            else{
                if(indexA < A.length){
                    C[i] = A[indexA];
                    indexA++;
                }
                else if (indexB < B.length){
                    C[i] = B[indexB]; 
                    indexB++;
                }
            }

        }

        System.out.println("\nResultado: ");
        System.out.print("Conjunto C: ");
        for (int i = 0 ; i < C.length ; i++){
            System.out.print(C[i]+", ");
        }

        teclado.close();
    }
}
