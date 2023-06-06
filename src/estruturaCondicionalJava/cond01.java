package estruturaCondicionalJava;

import java.util.Scanner;

public class cond01 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou positivo.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número:"); //input do número
        int N = sc.nextInt();

        //Condição para se o número for menor que zero, ele é negativo. E se o número for maior que zero, ele é positivo
        if (N < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("POSITIVO");
        }
    }
}
