/*14. Faça um algoritmo em JAVA que preencha dois vetores de 10 posições e exiba um terceiro vetor
resultante em que cada posição é a soma das posições dos outros vetores. Exemplo
vet1 = [10 27 3 -4 -6 -19 6 9 14 53 ]
vet2 = [ 0 -7 6 4 -5 15 -6 19 1 47 ]
vet3 = [10 20 9 0 -11 -4 0 28 15 100 ]*/

import java.util.*;;
public class rafael14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vetor1 = new int [10];
        int [] vetor2 = new int [vetor1.length];
        int [] vetor3 = new int [vetor1.length];

        System.out.println("14. Programa que calcula a soma dos elementos 2 vetores ");

        System.out.println("\nVetor 1:");
        for (int i = 0 ; i < vetor1.length ; i++){
            System.out.print("Digite o valor do "+(i+1)+"° elemento: ");
            vetor1[i] = teclado.nextInt();
        }
        System.out.println("\nVetor 2:");
        for ( int i = 0 ; i < vetor2.length ; i++){
            System.out.print("Digite o valor do "+(i+1)+"° elemento: ");
            vetor2[i] = teclado.nextInt();
        }

        for (int i = 0 ; i < vetor3.length ; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("\nResultado: ");
        System.out.print("Vetor 3: ");
        for (int i = 0 ; i < vetor3.length ; i++){
            System.out.print(vetor3[i]+", ");
        }

        teclado.close();
    }
}
