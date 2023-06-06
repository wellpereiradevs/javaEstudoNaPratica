package exerciciosBasicosJava;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {

        //Escreva um programa que divida dois números
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double d1 = sc.nextDouble();

        System.out.print("Insira o segundo número: ");
        double d2 = sc.nextDouble();

        double divisao = d1 / d2;
        System.out.println("Resultado: " + divisao);
    }

}
