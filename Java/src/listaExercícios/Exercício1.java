package listaExerc�cios;

import java.util.Scanner;

//1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class Exerc�cio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("Digite o valor do Primeiro n�mero: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o valor do Segundo n�mero: ");
		numero2 = ler.nextInt();
		System.out.println("Digite o valor do Terceiro n�mero: ");
		numero3 = ler.nextInt();

		if (numero1 == numero2 && numero2 == numero3) {
			System.out.println("\nTodos os n�meros s�o iguais! Com os valores de: " + numero1 + ", " + numero2 + " e "
					+ numero3 + ".");
		} else if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO Primeiro n�mero � o maior com o valor de: " + numero1 + ".");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("\nO Segundo n�mero � o maior com o valor de: " + numero2 + ".");
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("\nO Terceiro n�mero � o maior com o valor de: " + numero3 + ".");
		} else {
			System.out.println("**VALOR INV�LIDO**");
		}

	}

}
