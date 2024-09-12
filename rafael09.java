/*9. Escreva um programa que leia um conjunto de 50 fichas correspondente à alunos e armazene-as em
vetores, cada uma contendo, a altura e o código do sexo de uma pessoa (código = 1 se for masculino e
2 se for feminino), e calcule e imprima:
- A maior, menor e a médias das alturas da turma;
- As mulheres com altura acima da média da altura dos homens;
- Os homens com altura abaixo da média da altura das mulheres;
- As pessoas com altura abaixo da média da turma.*/

import java.util.*;
public class rafael09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] cod = new int [50];
        double [] altura = new double[cod.length];
        double alturaMaior, alturaMenor, media, soma, somaH, somaM, mediaH, mediaM;
        int homens, mulheres, mAcima, hAbaixo, pessoaAbaixo;

        alturaMaior = 0;
        alturaMenor = 99;
        soma = 0;
        homens = 0;
        mulheres = 0;
        somaH = 0; 
        somaM = 0;
        hAbaixo = 0;
        mAcima = 0;
        pessoaAbaixo = 0;

        System.out.println("9. Programa que calcula a media das alturas de homens e mulheres");

        for (int i = 0 ; i<cod.length ; i++ ){
            System.out.print("Digite a altura do "+(i+1)+"° aluno: ");
            altura[i] = teclado.nextDouble();
            System.out.print("Digite o sexo (1 para masculino e 2 para feminino): ");
            cod[i] = teclado.nextInt();
        }

        for (int i = 0 ; i < altura.length ; i++){
            soma = soma + altura[i];
            if (altura[i] > alturaMaior){
                alturaMaior = altura[i];
            }
            if (altura[i] < alturaMenor){
                alturaMenor = altura[i];
            }

            if (cod[i] == 1){
                somaH = somaH + altura[i];
                homens++;
            }
            else if(cod[i] == 2){
                somaM = somaM + altura[i];
                mulheres++;
            }

        }   

        media = soma / altura.length;
        mediaH = somaH / homens;
        mediaM = somaM / mulheres;
        
        for ( int i = 0 ; i < altura.length ; i++){
            if (cod[i] == 1){
                if (altura[i] < mediaM){
                    hAbaixo++;
                }
            }
            else if (cod[i] == 2){
                if (altura[i] > mediaH){
                    mAcima++;
                }
            }
        }

        for (int i = 0 ; i < altura.length ; i++){
            if (altura[i] < media){
                pessoaAbaixo++;
            }
        }

        System.out.println("Resultado: ");
        System.out.println("Maior altura: "+alturaMaior+"   Menor altura: "+alturaMenor+"   Média das alturas: "+media);
        System.out.println("Mulheres acima da media de homens: "+mAcima);
        System.out.println("Homens abaixo da media de mulheres: "+hAbaixo);
        System.out.println("Pessoa abaixo da media da turma: "+pessoaAbaixo);

        teclado.close();
    }
}