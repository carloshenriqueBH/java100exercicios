package java100exercicios;

import java.util.Scanner;

/* Exercício 03: escrever um programa que calcule a média aritmética
 * de tres notas fornecidos pelo usuário - 11/12/2024
 */
public class MediaAritmeticaNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Forneça a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Forneça a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Forneça a terceira nota: ");
		double nota3 = sc.nextDouble();
		double mediaNotas = (nota1 + nota2 + nota3)/3;
		System.out.println("A média das notas do aluno é: "+mediaNotas);
		sc.close();

	}

}
