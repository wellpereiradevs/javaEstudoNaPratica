package estruturaSequenciaJava;

import java.util.Locale;
import java.util.Scanner;

public class seq04 {
    public static void main(String[] args) {
        /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
        o valor que recebe por hora e calcula o salário desse funcionário.
        A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas; //valor do que é 'inteiro' como número do funcionário, e seu número de horas
        double valorHora, salario; //valor recebido por hora, e em seguida o cálculo do salário

        System.out.println("Entrada: ");
        numero = sc.nextInt(); //input do número do funcionário
        horas = sc.nextInt(); //input do número de horas trabalhadas
        valorHora = sc.nextDouble(); //input do valor recebido por horas

        salario = valorHora * horas; //cálculo do salário

        System.out.println("NUMBER = " + numero); //Saída do número do funcionário
        System.out.printf("SALARY = U$%.2f%n", salario); //Saída do salário calculado em dólar com 2 casas decimais
    }
}
