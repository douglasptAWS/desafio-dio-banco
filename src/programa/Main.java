package programa;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente douglas = new Cliente("Douglas");

		Conta cc = new ContaCorrente(douglas);
		cc.depositar(100.0);
		Conta cp = new ContaPoupanca(douglas);
		
		cc.transferir(50.0, cp);
		
		cc.imprimirExtrato();
		
		cp.imprimirExtrato();
		
		cp.sacar(20.0);
		
		cc.sacar(600.0);

	}

}
