package java100exercicios;

import java.util.Scanner;

/* Exercício 02: escrever um programa que calcule a média aritmética
 * de dois números fornecidos pelo usuário - 11/12/2024
 */
public class MediaAritmetica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Forneça o primeiro número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Forneça o segundo número: ");
		double numero2 = sc.nextDouble();
		double mediaAritmetica = (numero1 + numero2)/2;
		System.out.println("A média dos números fornecidos é: "+mediaAritmetica);
		sc.close();
	}

}
