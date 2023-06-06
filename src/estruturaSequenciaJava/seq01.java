package estruturaSequenciaJava;

import java.util.Scanner;

public class seq01 {
    public static void main(String[] args) {
        /*Faça um programa para ler dois valores inteiros,
        depois mostrar na tela a soma desses números com uma mensagem explicativa*/

        Scanner sc = new Scanner(System.in); //input da entrada

        System.out.println("Entrada:"); //Saída para digitar
        int a = sc.nextInt(); //input do número
        int b = sc.nextInt(); //input do outro número

        int soma = a + b;
        System.out.println("Saída: SOMA = " + soma);
    }
}
