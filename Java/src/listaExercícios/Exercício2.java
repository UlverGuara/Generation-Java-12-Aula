package listaExerc�cios;

import java.util.Scanner;

//2. Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

public class Exerc�cio2 {
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
		} else if (numero1 > numero2 && numero2 > numero3) {
			System.out.println(+numero1 + ", " + numero2 + " e " + numero3 + ".");
		} else if (numero1 > numero3 && numero3 > numero2) {
			System.out.println(+numero1 + ", " + numero3 + " e " + numero2 + ".");
		} else if (numero2 > numero1 && numero1 > numero3) {
			System.out.println(+numero2 + ", " + numero1 + " e " + numero3 + ".");
		} else if (numero2 > numero3 && numero3 > numero1) {
			System.out.println(+numero2 + ", " + numero3 + " e " + numero1 + ".");
		} else if (numero3 > numero1 && numero1 > numero2) {
			System.out.println(+numero3 + ", " + numero1 + " e " + numero2 + ".");
		} else if (numero3 > numero2 && numero2 > numero1) {
			System.out.println(+numero3 + ", " + numero2 + " e " + numero1 + ".");
		} else {
			System.out.println("**VALOR INV�LIDO**");
		}
	}

}
