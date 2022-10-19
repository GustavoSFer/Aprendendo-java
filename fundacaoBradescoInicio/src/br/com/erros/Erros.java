package br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Erros {

	public static void main(String[] args) {
		
		
		try {
			Scanner teclado = new Scanner(System.in);
			
			int a = teclado.nextInt();
			int b = teclado.nextInt();
			double result = a / b;
			System.out.println(result);
		} catch(InputMismatchException e1) {
			System.out.println("Erro InputMismatchException");
		} catch(Throwable e2) {
			System.out.println("Numero, não pode ser divisivel: Erro " + e2.getMessage());
		}
		
		
	}

}
