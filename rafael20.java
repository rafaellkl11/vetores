/*20. Faça um programa que simule um controle bancário. O sistema bancário tem a capacidade de
armazenar as informações somente de 50 usuários e contém as opções de cadastrar usuário; efetuar
depósito; efetuar saque; consultar saldo em conta e finalizar o programa. O seguinte menu deverá
aparecer o seguinte menu na tela para o usuário: (Desafio: fazer com interface gráfica)

Menu de Operações
1. Efetuar depósito
2. Efetuar saque
3. Consultar saldo em conta;
4. Finalizar o programa

- Na opção de cadastrar usuário devem ser lidos os seguintes dados: nome do usuário (vetor de String
com 50 posições); número da conta (vetor inteiro de 50 posições); saldo da conta (vetor float com 50
posições). O número da conta devem ser armazenados em um vetor de números inteiros (não pode
haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de
números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta
504 foi armazenada na quinta posição do vetor de número de contas, seu saldo deverá ficar na quinta
posição do vetor de saldos.
- Para efetuar o depósito, deve-se solicitar o número da conta e o valor a ser depositado. Se a conta não
estiver cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu inicial. Se a
conta existir, atualizar e exibir o novo saldo;

50 60 15 22 33 84 100

INSTITUTO FEDERAL DE MINAS GERAIS

Campus Sabará

8

Elaboração Prof. Bruno Nonato Gomes
- Para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver
cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu. Se a conta existir,
verificar se o seu saldo é suficiente para cobrir o saque. (Suponha que a conta não possa ficar com
saldo negativo). Se o saldo for suficiente, realizar o saque, exibir o novo saldo e voltar ao menu. Caso
contrário, mostrar a mensagem “Saldo insuficiente!” e voltar ao menu.
- Para consultar saldo em conta, deve-se solicitar o número da conta a ser pesquisada. Se a conta não
estiver cadastrada, deverá aparecer a mensagem “Conta não encontrada!”; senão, mostrar a conta com
seu respectivo saldo e voltar ao menu;
O programa termina quando for digitada a opção 4 – Finalizar o programa.*/

import java.util.*;
public class rafael20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String [] nome = new String[50];
        int [] conta = new int[nome.length];
        double [] saldo = new double[nome.length];
        int opcao1, opcao2, index, numConta, num;
        double valor;
        boolean verif = false, verif2 = false;

        opcao1 = 0;
        opcao2 = 0;
        index = 0;
        numConta = 0;

        System.out.println("20. Programa que simula um controle bancário");
        while (opcao1 != 3){
            System.out.println("\nMenu:");
            System.out.println("    1.Cadastrar usuario");
            System.out.println("    2.Menu de operações");
            System.out.println("    3.Sair do programa");
            System.out.print("\nDigite o número da opção que deseja: ");
            opcao1 = teclado.nextInt();
            
            if(opcao1 == 1){
                for (int i = 0 ; i < nome.length ; i++){
                    if (nome[i]==null){
                        index = i;
                        break;
                    }
                }
                while (verif!=true) {
                    numConta = random.nextInt(nome.length);
                    for (int i = 0; i < conta.length ; i++ ){
                        if (conta[i] == numConta){
                            break;
                        }
                    }
                    if (verif == false){
                        break;
                    }
                }
                System.out.print("Digite o nome do usuario: ");
                teclado.nextLine();
                nome[index] = teclado.nextLine();
                conta[index] = numConta;

                System.out.println("\nCadastrado com sucesso!");
                System.out.println("Nome: "+nome[index]);
                System.out.println("n° da conta: "+conta[index]);
            }
            else if(opcao1 == 2){
                opcao2 = 0;
                while (opcao2 != 4){
                    System.out.println("\nMenu de operações: ");
                    System.out.println("    1. Efetuar depósito");
                    System.out.println("    2. Efetuar saque");
                    System.out.println("    3. Consultar saldo em conta");
                    System.out.println("    4. Voltar");
                    System.out.print("\nDigite o número da opção que deseja: ");
                    opcao2 = teclado.nextInt();

                    if (opcao2==1){
                        System.out.print("Digite o número da conta: ");
                        num = teclado.nextInt();
                        verif2 = false;
                        for (int i = 0 ; i < conta.length ; i++){
                            if(num == conta[i]){
                                index = i;
                                verif2 = true;
                                break;
                            }
                        }

                        if(verif2==false){
                            System.out.println("Conta não encontrada!");
                            break;
                        }

                        System.out.println("\nConta encontrada!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.println("Titular: "+nome[index]);
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.print("Digite o valor do depósito: ");
                        valor = teclado.nextDouble();

                        saldo[index] = saldo[index]+valor;

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("Saldo: "+saldo[index]);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    else if(opcao2==2){
                        System.out.print("Digite o número da conta: ");
                        num = teclado.nextInt();
                        verif2 = false;
                        for (int i = 0 ; i < conta.length ; i++){
                            if(num == conta[i]){
                                index = i;
                                verif2 = true;
                                break;
                            }
                        }

                        if(verif2==false){
                            System.out.println("Conta não encontrada!");
                            break;
                        }

                        System.out.println("\nConta encontrada!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Titular: "+nome[index]);
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("Digite o valor do saque: ");
                        valor = teclado.nextDouble();

                        if (valor > saldo[index]){
                            System.out.println("Saldo insuficiente ");
                        }
                        else{
                            saldo[index] = saldo[index]-valor;
                        }

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("Saldo: "+saldo[index]);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else if(opcao2==3){
                        System.out.print("\nDigite o número da conta: ");
                        num = teclado.nextInt();
                        verif2 = false;
                        for (int i = 0 ; i < conta.length ; i++){
                            if(num == conta[i]){
                                index = i;
                                verif2 = true;
                                break;
                            }
                        }

                        if(verif2==false){
                            System.out.println("Conta não encontrada!");
                            break;
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("\nConta encontrada!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Saldo: "+saldo[index]);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else if(opcao2==4){
                        System.err.println("Voltando...");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        System.out.println("Erro, digite novamente!");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            else if(opcao1 == 3){
                System.out.println("Programa encerrado com sucesso");
            }
            else {
                System.out.println("Erro, digite novamente!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        teclado.close();
    }
}