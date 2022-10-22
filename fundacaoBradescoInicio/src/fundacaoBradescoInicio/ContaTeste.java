package fundacaoBradescoInicio;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.cliente = "Gustavo";
		c1.depositar(200);
		c1.extrato();
		
		c1.depositar(1000);
		c1.extrato();
		c1.sacar(800);
		
		c1.extrato();
		

	}

}
