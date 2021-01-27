package listaExercícios;

import java.util.Scanner;

//1. Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Exercício1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("Digite o valor do Primeiro número: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o valor do Segundo número: ");
		numero2 = ler.nextInt();
		System.out.println("Digite o valor do Terceiro número: ");
		numero3 = ler.nextInt();

		if (numero1 == numero2 && numero2 == numero3) {
			System.out.println("\nTodos os números são iguais! Com os valores de: " + numero1 + ", " + numero2 + " e "
					+ numero3 + ".");
		} else if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO Primeiro número é o maior com o valor de: " + numero1 + ".");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("\nO Segundo número é o maior com o valor de: " + numero2 + ".");
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("\nO Terceiro número é o maior com o valor de: " + numero3 + ".");
		} else {
			System.out.println("**VALOR INVÁLIDO**");
		}

	}

}
