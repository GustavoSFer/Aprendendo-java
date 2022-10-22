package fundacaoBradescoInicio;

public class Conta {
	String cliente;
	double saldo;
	
	void sacar(int valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
		}
	}
	
	void depositar(int valor) {
		this.saldo += valor;
	}
	
	void extrato() {
		System.out.println("Seu saldo é de: " + this.saldo);
	}
}
