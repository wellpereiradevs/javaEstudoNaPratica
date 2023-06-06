package estruturaSequenciaJava;

import java.util.Locale;
import java.util.Scanner;

public class seq06 {
    public static void main(String[] args) {
        /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
        Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.*/

        Locale.setDefault(Locale.US); //deixa o separador de decimais como "." ao invés de "," ...Ex: 2,89 -> 2.89
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo; //valores 'double'

        A = sc.nextDouble(); //input do valor de A
        B = sc.nextDouble(); //input do valor de B
        C = sc.nextDouble(); //input do valor de C

        triangulo = A * C / 2.0; //fórmula do triângulo
        circulo = 3.14159 * C * C; //fórmula do círculo
        trapezio = (A + B) / 2.0 * C; //fórmula do trapézio
        quadrado = B * B; //fórmula do quadrado pedida
        retangulo = A * B; //fórmula do retângulo pedida

        System.out.printf("TRIANGULO: %.3f%n", triangulo); //Saída do resultado do triângulo
        System.out.printf("CIRCULO: %.3f%n", circulo); //Saída do resultado do círculo
        System.out.printf("TRAPEZIO: %.3f%n", trapezio); //Saída do resultado do trapézio
        System.out.printf("QUADRADO: %.3f%n", quadrado); //Saída do resultado do quadrado
        System.out.printf("RETANGULO: %.3f%n", retangulo); //Saída do resultado do retângulo
    }
}
