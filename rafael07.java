/*7. Fazer um algoritmo que:
a. Leia um conjunto de valores inteiros correspondentes a 80 notas dos alunos de uma turma, notas
estas que variam de 0 a 10 (valide as entradas);
b. Calcule a frequência absoluta e a frequência relativa de cada nota;
c. Imprima uma tabela contendo os valores das notas (de 0 a 10) e suas respectivas frequências
absoluta e relativa.*/

import java.util.*;
public class rafael07 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int [] notas = new int[80];
        double [] frequenciaAb = new double [11];
        double [] frequenciaRel = new double [11];

        System.out.println("7. Programa que recebe 80 notas e calcule a frequencia absoluta e a frequencia relativa");

        for (int i = 0 ; i < notas.length ; i++){
            System.out.print("Digite a nota do "+(i+1)+"° aluno: ");
            notas[i] = teclado.nextInt();
            if (notas[i] <= 0 || notas[i] >=10){
                while (notas[i]> 10 || notas[i] < 0){
                    System.out.println("Nota invalida");
                    System.out.print("Digite a nota novamente: ");
                    notas[i] = teclado.nextInt();
                }
            }
        }

        for (int i = 0 ; i < frequenciaAb.length ; i++){
            for (int j = 0 ; j < notas.length ; j++){
                if (notas[j] == i){
                    frequenciaAb[i]++;
                }
            }
        }
        for (int i = 0 ; i < frequenciaRel.length ; i++){
            frequenciaRel[i] = (frequenciaAb[i] / notas.length) *100; 
        }  

        System.out.println("Resultado: ");
        System.out.println("\nFrequência Absoluta: ");
        for (int i = 0 ; i < frequenciaAb.length ; i++){
            System.out.println("Frequência absoluta de notas "+i+" : "+frequenciaAb[i]);
        }
        System.out.println("\nFrequência Relativa: ");
        for (int i = 0 ; i < frequenciaRel.length ; i++){
            System.out.println("Frequência relativa de notas "+i+" : "+frequenciaRel[i]+"%");
        }


        teclado.close();
    }
}
