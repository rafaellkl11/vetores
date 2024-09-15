/*17. Desenvolva um programa que identifique, armazene em um vetor e mostre os 100 primeiros números
primos a partir de 1. O algoritmo fica muito mais eficiente utilizando o crivo de Eratóstenes. Como
desafio, implemente o algoritmo utilizando a “forma tradicional” e depois utilizando o crivo de
Eratóstenes, compute os tempos de ambas implementações e verifique a diferença entre os mesmos.*/

public class rafael17 {
    public static void main(String[] args) {
        double [] primos = new double[100];
        int num, qtd;
        boolean primo;
        long tempoInicial = System.currentTimeMillis(); 
        
        primos [0] = 2;
        qtd = 1;
        num = 3;

        System.out.println("17. Programa encontra os 100 primeiros números primos");

        while (qtd != primos.length){
            primo = true;
            for (int i = 0 ; i < primos.length ; i++){
                if ((num % primos[i]) == 0){
                    primo = false;
                    break;
                }
            }
            if (primo == true){
                primos[qtd] = num;
                qtd++;
            }
            num++;
        }

        long tempoFinal = System.currentTimeMillis();

        for (int i = 0 ; i < primos.length; i++){
            System.out.printf("%.0f, ",primos[i]);
        }
        System.out.printf("\nTempo gasto: %.3f s%n", (tempoFinal - tempoInicial) / 1000d);
    }
}
