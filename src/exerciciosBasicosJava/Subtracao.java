package exerciciosBasicosJava;

import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        //Escreva um programa que subtraia dois números
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Insira o segundo número: ");
        double n2 = sc.nextDouble();

        double subtracao = n1 - n2;
        System.out.println("Resultado: " + subtracao);
    }
}
