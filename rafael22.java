/*22. Um experimento biológico utiliza uma fita de papel branco especial, na qual algumas gotas de um
reagente são colocadas em posições específicas. Inicialmente a gota de reagente faz com que o papel
se torne preto na posição em que foi colocada. A cada dia o reagente se propaga pelo papel, em todas
as direções, com velocidade de 1 posição por dia, colorindo a região em que o reagente se propagou. A
figura abaixo mostra um experimento com uma fita de 13 posições, com três gotas de reagente
inicialmente, colocadas nas posições 2, 6 e 13 (a posição 1 é a primeira mais à esquerda da fita). Ao
final do terceiro dia, a fita está completamente tomada pelo reagente.

Você foi contratado para escrever um programa que, dados o comprimento da fita de papel e as posições das
gotas de reagente no início do experimento, determine quantos dias serão necessários para a fita de papel ficar
completamente tomada pelo reagente.
Entrada
A primeira linha contém dois inteiros F e R, indicando respectivamente o comprimento da fita de papel, em
números de posições, e o número de gotas no início do experimento. A segunda linha contém R inteiros,
indicando as posições das gotas de reagente, que são dadas em ordem crescente.
Saída
Seu programa deve produzir uma única linha, contendo um único inteiro,*/

import java.util.*;
public class rafael22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int comprimento, gotas, dias;
        boolean tomada = false;

        dias = 0;
        
        System.out.println("22. Programa que calcula em quantos dias uma fita e tomada completamente por um reagente");

        System.out.print("Digite em números inteiros o comprimento da fita e a quantidade de gotas: ");
        comprimento = teclado.nextInt( ); gotas=teclado.nextInt(); 

        int [] fita = new int [comprimento];
        int [] fitaAux = new int[comprimento];

        fitaAux = fita;

        System.out.print("Digite quais as posições das gotas na fita: ");

        for (int i = 1 ; i <= gotas ; i++){
            fita[teclado.nextInt()-1] = 1;
        }

        while (!tomada) {
            fita = fitaAux;

            for (int i = 1 ; i < fita.length-1 ; i++){
                if (fita[i] == 1 && (fita[i-1] == 0 || fita[i+1] == 0)){
                    if(i < fita.length-1){
                        if (i > 0){
                            fitaAux[i-1] = 1;
                        }                                 
                    }
                    if(i > 0){
                        if ( i < fita.length-1){
                            fitaAux[i+1] = 1;
                            i++;
                        } 
                    }     
                }
                if (fita[0]==1 && fita[1]==0){
                    fita[1]=1;
                }
                if (fita[fita.length-1]==1 && fita[fita.length-2]==0){
                    fita[fita.length-2] = 1;
                }
            }
            tomada = true;
            dias++;
            for(int i = 0 ; i < fita.length ; i++){
                if (fita[i]==0) {
                    tomada = false;
                    break;
                }
            }
        }

        System.out.println("Resultado: "+dias);

        teclado.close();
    }
}
