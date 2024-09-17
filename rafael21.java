/*21. Um sistema de informações geográficas computadorizado está representando o perfil de uma
montanha através de uma sequência de números inteiros, na qual não há dois números consecutivos
iguais, como ilustrado na figura abaixo para três montanhas. Os números representam a altura da
montanha ao longo de uma certa direção.

O gerente do sistema de informações geográficas pesquisou e encontrou uma maneira de identificar se uma
sequência de números inteiros representa uma montanha com mais de um pico, ou com apenas um pico. Ele
observou que, como não há números consecutivos iguais, se houver três números consecutivos na sequência,
tal que o número do meio é menor do que os outros dois números, então a montanha tem mais de um pico.
Caso contrário, a montanha tem apenas um pico. De forma mais rigorosa, se a sequência é A = [A1;A2;A3; ...;
AN], ele quer saber se há uma posição i, para 2 <= i <= N - 1, tal que Ai-1 > Ai e Ai < Ai+1.
Para ajudar o gerente, seu programa deve determinar, dada a sequência de números inteiros representando a
montanha, se ela tem mais de um pico, ou se tem um pico apenas.
Entrada
A primeira linha da entrada contém um inteiro N, representando o tamanho da sequência. A segunda linha
contém N inteiros Ai, 1 <=1 i <= N, representando a sequência de alturas da montanha.
Saída
Seu programa deve imprimir uma linha contendo o caractere “S” se há mais de um pico, ou o caractere “N” se
há apenas um pico.*/

import java.util.*;
public class rafael21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n, picos;

        picos = 0;
        
        System.out.println("21. Programa que identifica se uma montanha tem dois picos.");

        System.out.print("Digite o tamanho da sequência:");
        n = teclado.nextInt();

        int [] vetor = new int[n];

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.println("Digite a altura da "+(i+1)+"° faixa da montanha: ");
            vetor[i] = teclado.nextInt();
        }

        for (int i = 0 ; i < (vetor.length-2) ; i++){
            if ( vetor[i]< vetor[i+1] && vetor[i+1] > vetor[i+2]){
                picos++;
            }
        }

        System.out.println("Resultado:");

        if (picos == 2){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }

        teclado.close();
    }
}
