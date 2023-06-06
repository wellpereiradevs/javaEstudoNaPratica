package estruturaSequenciaJava;

import java.util.Locale;
import java.util.Scanner;

public class seq05 {
    public static void main(String[] args) {
        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        Calcule e mostre o valor a ser pago.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qte1, qte2; //valores de int
        double preco1, preco2, total; //valores de double

        cod1 = sc.nextInt(); //input do código da peça
        qte1 = sc.nextInt(); //input do número de peças
        preco1 = sc.nextDouble(); //input do valor de unidade da peça

        cod2 = sc.nextInt(); //input do código da peça
        qte2 = sc.nextInt(); //input do número de peças
        preco2 = sc.nextDouble(); //input do valor de unidade da peça

        total = preco1 * qte1 + preco2 * qte2; //cálculo total do valor a pagar

        System.out.printf("VALOR A PAGAR: R$%.2f%n", total); //Saída do resultado do valor a pagar
    }
}
