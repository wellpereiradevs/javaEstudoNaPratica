package estruturaRepeticaoJava;

import java.util.Scanner;

public class rep10 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro positivo N.
        O programa deve então mostrar na tela N linhas, começando de 1 até N.
        Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu número: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", i, segundo, terceiro);
        }
    }
}
