/*
8. Construa um programa JAVA que preenche dois vetores reais de 10 posições, depois crie um terceiro
vetor cujo conteúdo de cada posição é: 1, se o número armazenado em uma posição do vetor é o
mesmo armazenado na posição respectiva do 2o, e 0, caso contrário.*/

import java.util.*;
public class rafael08 {
    public static void main(String[] args) {
        Scanner teclado  =  new Scanner(System.in);
        int [] vetor1 = new int [10];
        int [] vetor2 = new int [10];
        int [] vetor3 = new int [10];

        System.out.println("8. Programa que recebe 2 vetores e imprima um 3° que preencha com 1 na posição onde os elementos dos 2 vetores são iguais.");

        System.out.println("Digite os elementos do 1° vetor");
        for (int i = 0 ; i < vetor1.length ; i++){
            System.out.print("Digite o "+(i+1)+"° número: ");
            vetor1[i] = teclado.nextInt();
        }
        System.out.println("Digite os elementos do 2°vetor");
        for (int i = 0 ; i < vetor2.length ; i++){
            System.out.print("Digite o "+(i+1)+"° número: ");
            vetor2[i] = teclado.nextInt();
        }

        for (int i = 0 ; i< vetor3.length ; i++){
            if(vetor1[i] == vetor2[i]){
                vetor3[i] = 1;
            }
            else {
                vetor3[i] = 0;
            }
        }

        System.out.println("Resultado; ");
        System.out.print("vetor 3: ");
        for (int i = 0 ; i < vetor3.length ; i++){
            System.out.print(vetor3[i]+", ");
        }

        teclado.close();
    }
}