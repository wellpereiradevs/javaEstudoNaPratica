package estruturaCondicionalJava;

import java.util.Scanner;

public class cond03 {
    public static void main(String[] args) {
        /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
        ou "Nao Sao Multiplos", indicando se os valores lidos são múltiplos entre si.
        Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois valores: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao Sao Multiplos");
        }
    }
}
