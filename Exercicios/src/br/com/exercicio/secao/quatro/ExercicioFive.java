package br.com.exercicio.secao.quatro;

import java.util.Scanner;

public class ExercicioFive {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		
		int maior = (numero1 > numero2) ? numero1 : numero2;
		
		System.out.println("o maior numero informado é: " + maior);
		System.out.println("A diferença entre os numero que foi informado é " + Math.abs(numero1 - numero2));
		
		teclado.close();
	}
}
