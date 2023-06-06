package estruturaRepeticaoJava;

import java.util.Scanner;

public class rep07 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número N.
        Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Coloque o número: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
    }
}
