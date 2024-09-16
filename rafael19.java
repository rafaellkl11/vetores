/*19. Implemente um algoritmo que preencha com valores inteiros um vetor de 10 posições. Em seguida
solicite o usuário que digite um valor qualquer e pesquise se o valor informado pelo usuário pertence
ou não ao vetor preenchido inicialmente. Caso não, mostre a mensagem “O valor X não está presente
no vetor”; caso sim, mostre a mensagem “O valor X está na posição Y do vetor”. Exemplo:
Vetor preenchido:
Valor digitado pelo usuário: 30 -> Mensagem: “Valor 30 não está presente no vetor”
Valor digitado pelo usuário: 84 -> Mensagem: “Valor 84 está na posição 5 no vetor”*/

import java.util.*;
public class rafael19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vetor = new int [10];
        int num, y;
        Random random = new Random();
        boolean result;

        num = 0;
        y = 0;
        result = false;

        System.out.print("19. Program que preenche um vetor de 10 posições e verifica se o número digitado está no vetor");

        for (int i = 0 ; i < vetor.length ; i++){
            vetor[i] = random.nextInt(100);
        }

        while (num != -1){
            System.out.print("Digite um número de 0 a 100: ");
            num = teclado.nextInt();
            for ( int i = 0 ; i < vetor.length ; i++){
                result = false;
                if (num == vetor[i]){
                    result = true;
                    y = i;
                    break;
                }
            }
            System.out.println("\n Resposta: ");
            if(result==true){
                System.out.print("O número "+num+" está na posição "+y+"\n\n");
            }
            else{
                System.out.print("O número "+num+" não está no vetor\n\n");
            }
        }
        teclado.close();
    }
}
