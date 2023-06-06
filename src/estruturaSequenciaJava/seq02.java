package estruturaSequenciaJava;

import java.util.Locale;
import java.util.Scanner;

public class seq02 {
    public static void main(String[] args) {
        /*Faça um programa para ler o valor do raio de um círculo,
        depois mostrar o valor da área deste círculo com quatro casas decimais*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159; //definimos os 'valores' e atribuimos um valor númerico

        System.out.println("Entrada:"); //input do número
        raio = sc.nextDouble();

        area = pi * raio * raio; //fórmula da área de pi

        System.out.printf("Saída: A=%.4f%n", area); //Saída do resultado com 4 casas decimais
    }
}
