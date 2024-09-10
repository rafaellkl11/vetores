/*1. Uma turma possui 40 alunos. Faça um programa que leia o nome e a idade de todos os alunos e logo
em seguida imprima:
A. Total de alunos com idade menor ou igual a 16 anos
B. Total de alunos com idade maior que 16 anos
C. Média das idades
D. Alunos com idade acima da média
E. Nome e Idade do aluno mais novo
F. Nome e Idade do aluno mais velho*/

import java.util.*;
public class rafael01{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        float [] idade = new float[40];
        String [] aluno = new String[40];
        int idadeTotalMenor, idadeTotalMaior, pessoasAcimaMedia, index;
        float soma, media, idadeMaisVelho, idadeMaisNovo;
        String nomeMaisVelho, nomeMaisNovo;

        idadeTotalMenor = 0;
        idadeTotalMaior = 0;
        soma = 0;
        pessoasAcimaMedia = 0;
        index = 0;
        nomeMaisNovo = "";
        nomeMaisVelho = "";


        System.out.println("1. Programa que cadastra o nome e a idade de 40 alunos.");
        
        for (int i = 0; i <= 39; i++){
            System.out.print("Digite o nome do "+(i+1)+"° aluno: ");
            aluno [i] = teclado.nextLine();
            System.out.print("Digite a idade do "+(i+1)+"° aluno: ");
            idade [i] = teclado.nextFloat();
            teclado.nextLine();

            soma = soma + idade[i];

            if (idade[i]<=16){
                idadeTotalMenor++;
            }
            else{
                idadeTotalMaior++;
            }

        }

        media = soma / (aluno.length);

        for (int i = 0; i<=(idade.length-1); i++){
            if(idade[i]>media){
            pessoasAcimaMedia++;
            }
        }
        
        String [] acimaMedia = new String[pessoasAcimaMedia];

        for (int i = 0; i<=(aluno.length-1); i++){
            if(idade[i]>media){
                acimaMedia[index] = aluno[i];
                index++;                
                
            }
        }

        idadeMaisVelho = idade[0];
        nomeMaisVelho  = aluno[0];

        for(int i = 0; i <= (idade.length-1) ; i++){
            if (idade[i] > idadeMaisVelho){
                idadeMaisVelho = idade[i];
                nomeMaisVelho = aluno[i];
            }
        }

        idadeMaisNovo = idade[0];
        nomeMaisNovo = aluno[0];

        for(int i = 0; i <= (idade.length-1) ; i++){
            if (idade[i] < idadeMaisNovo){
                idadeMaisNovo = idade[i];
                nomeMaisNovo = aluno[i];
            }
        }


        System.out.println("Resultado:");
        System.out.println("Total de alunos com idade menor que 16: "+idadeTotalMenor);
        System.out.println("Total de alunos com idade maior que 16: "+idadeTotalMaior);
        System.out.println("Média das idades: "+media);
        System.out.print("Alunos com idade acima da média: ");
        for (int i = 0; i <= pessoasAcimaMedia-1; i++){
            System.out.print(acimaMedia[i]+", ");
        }
        System.out.println("\nNome e idade do aluno mais novo: "+ nomeMaisNovo +" com "+idadeMaisNovo+" anos.");
        System.out.println("Nome e idade do aluno mais velho: "+ nomeMaisVelho + " com "+idadeMaisVelho+" anos.");
        
        teclado.close();
   }
}