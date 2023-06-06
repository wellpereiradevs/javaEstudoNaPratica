package estruturaRepeticaoJava;

import java.util.Scanner;

public class rep08 {
    public static void main(String[] args) {
        /*Ler um valor N.
        Calcular e escrever seu respectivo fatorial.
        Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número aqui: ");
        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);
    }
}
