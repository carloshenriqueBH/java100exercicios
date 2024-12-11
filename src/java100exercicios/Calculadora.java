package java100exercicios;

import java.util.Scanner;

/*
 * Exercicio 01: o usuario deve fornecer dois numeros e o programa
 * vai calcular a soma, divisao, multiplicacao e subtracao entre eles.
 * 11/12/2024
 */
public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double numero1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		double numero2 = sc.nextDouble();
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double divisao = numero1 / numero2;
		double multiplicacao = numero1 * numero2;
		System.out.println("A soma dos dois números é: "+soma);
		System.out.println("A subtração dos dois números é: "+subtracao);
		System.out.println("A divisão dos dois números é: "+divisao);
		System.out.println("A multiplicação dos dois números é: "+multiplicacao);
		sc.close();



	}

}
