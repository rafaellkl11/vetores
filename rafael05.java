/*5. Em uma competição somente atletas que possuem altura maior ou igual a média geral das alturas dos
inscritos podem participar. Sabe-se que a organização recebeu 20 inscrições. Faça um programa que
identifique e mostre quais atletas podem participar da competição.*/

import java.util.*;
public class rafael05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double [] altura = new double[20];
        double soma, media;
        int quantAcimaMedia, index;

        soma = 0;
        quantAcimaMedia = 0;
        index = 0; 

        System.out.println("5.  Programa que mostra quais atletas podem participar de um evento a partir da altura");

        for( int i = 0 ; i < altura.length ; i++){
            System.out.print("Digite a altura do "+(i+1)+"° atleta: ");
            altura[i] = teclado.nextDouble();
            soma = soma + altura[i];
        }

        media = soma / altura.length;

        for (int i = 0 ; i< altura.length; i++){
            if (altura[i] > media){
                quantAcimaMedia++;
            }
        }

        int [] atleta = new int [quantAcimaMedia];

        for (int i = 0 ; i < altura.length ; i++){
            if (altura[i] > media){
                atleta[index] = (i+1);
                index++;
            }
        }

        System.out.println("Resultado: ");
        System.out.print("O n° dos atletas que podem participar são: ");
        for (int i = 0 ; i < atleta.length ; i++){
            System.out.print(atleta[i]+", ");
        }



        teclado.close();
    }
}
