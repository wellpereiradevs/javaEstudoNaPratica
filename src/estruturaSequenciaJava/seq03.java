package estruturaSequenciaJava;

import java.util.Scanner;

public class seq03 {
    public static void main(String[] args) {
        /*Fazer um programa para ler quatro valores inteiros A, B, C e D.
        A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D,
        segundo a fórmula: DIFERENCA = (A * B - C * D).*/
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, dif;

        System.out.println("Entrada dos valores: "); //input da entrada dos valores
        A = sc.nextInt(); //input do valor de A
        B = sc.nextInt(); //input do valor de B
        C = sc.nextInt(); //input do valor de C
        D = sc.nextInt(); //input do valor de D

        dif = A * B - C * D; //fórmula da diferença do produto

        System.out.println("DIFERENÇA = " + dif); //Saída do resultado do valor da diferença do produto
    }
}
