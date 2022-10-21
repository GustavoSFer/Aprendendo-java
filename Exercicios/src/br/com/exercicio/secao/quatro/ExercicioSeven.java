package br.com.exercicio.secao.quatro;

import java.util.Scanner;

public class ExercicioSeven {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero = teclado.nextInt();
		
		if(numero <= 0) {
			System.out.println("Número inválido!");
		} else {
			String numeroString = String.valueOf(numero);
			String[] result = numeroString.split("");
			
			int soma = 0;
			
			for (int i = 0; i < numeroString.length(); i++) {
				soma += Integer.parseInt(result[i]);
			}
			System.out.println(soma);
		}
		teclado.close();
	}
}
