package java100exercicios;

import java.util.Scanner;

/* Exercício 04: escrever um programa que calcule a média geométrica
 * de tres números fornecidos pelo usuário - 11/12/2024
 * A média geométrica é calculada usando a fórmula:
 * mediaGeometrica (numero1 * numero2 * numero3) ^ (1/3)
 * utilizaremos a função math.pow() para fazer o cálculo
 * da raiz cúbica dos produtos do números 
 */
public class MediaGeometrica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double primeiro = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double segundo = sc.nextDouble();
		System.out.println("Digite o último número: ");
		double ultimo = sc.nextDouble();
		double produto = primeiro * segundo * ultimo;
		double mediaGeometrica = Math.pow(produto, 1.0/3.0);
		System.out.println("A média geométrica dos números fornecidos é: "+mediaGeometrica);
		sc.close();
	}

}
