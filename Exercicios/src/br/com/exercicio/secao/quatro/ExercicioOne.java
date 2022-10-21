package br.com.exercicio.secao.quatro;

import java.util.Scanner;

public class ExercicioOne {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		
		int maior_numero = (numero1 > numero2) ? numero1 : numero2;
		
		System.out.println("O maior numero informado é: " + maior_numero);
	}

}
