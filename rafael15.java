/*15. Faça um programa que carregue um vetor de 5 posições, calcule e mostre o somatório e o produtório
do mesmo.*/

import java.util.*;
public class rafael15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [] vetor = new double[5];
        double somatorio, produtorio;

        somatorio = 0;
        produtorio = 1;

        System.out.println("15. Programa que carrega um vetor de 5 posições e calcule o somatório e o \nprodutório");

        for ( int i = 0 ; i < vetor.length ; i++){
            System.out.print("Digte o "+(i+1)+"° valor: ");
            vetor[i] = teclado.nextDouble();
        }
         
        for (int i = 0 ; i < vetor.length ; i++){
            somatorio = somatorio + vetor[i];
            produtorio = produtorio * vetor[i];
        }

        System.out.println("Resultado: ");
        System.out.println("Somatório: "+somatorio);
        System.out.println("Produtório: "+produtorio);


        teclado.close();
    }
}
