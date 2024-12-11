package java100exercicios;

import java.util.Scanner;

/* Exercicio 05: calcular o IMG de um indivíduo, utilizando a fórmula
 * IMG = peso / altura ^2
 */
public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu peso em KG: ");
		double peso = sc.nextDouble();
		System.out.print("Digite a sua altura em metros: ");
		double altura = sc.nextDouble();
		double imc = peso / (altura * altura);
		System.out.println("O Seu IMC é: "+imc);
		sc.close();
	}

}
