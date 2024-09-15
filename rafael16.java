/*16. Escreva um algoritmo que leia preencha e mostre um vetor de 10 posições, cada posição é composta
pelo fatorial da mesma.

vet = [0 1 2 6 24 120 720 5040 40320 362880]*/

public class rafael16 {
    public static void main(String[] args) {
        double [] vetor = new double[10];
        double fatorial;

        fatorial = 0;

        System.out.println("16. Programa que calcula o fatorial de cada posição de um vetor de 10 \nposições.");

        for (int i = 1; i < vetor.length ; i++){
            fatorial = i;
            vetor[i] = 1;
            for (int j = 0 ; j < i ; j++){
                vetor[i] = vetor[i] * (fatorial-j);
            }
        }


        System.out.println("Resultado: ");
        for (int i = 0 ; i<vetor.length ; i++){
            System.out.printf("%.0f, ",vetor[i]);
        }
    }
}
