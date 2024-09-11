/*4. Faça um programa em JAVA que gere um vetor com 10 posições onde cada elemento coresponde ao
quadrado de sua posição. Imprima o vetor resultante.*/

public class rafael04 {
    public static void main(String[] args){
        double [] vetor = new double[10];

        System.out.println("4. Programa que calcula o quadrado de cada posição de um vetor de 10 elementos");

        for (int i = 0 ; i < vetor.length ; i++){
            vetor[i] = Math.pow(i,2);
        }

        System.out.println("Resultado");
        System.out.print("Elementos: ");
        for( int i = 0; i < vetor.length; i++){
            System.out.printf("%.0f, ",vetor[i]);
        }


    }
}
