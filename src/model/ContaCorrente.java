package model;

import exception.LimiteExcedidoException;

public class ContaCorrente extends Conta {
	
	private static final double LIMITE = 500.0;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== EXTRATO CONTA CORRENTE ===");
		ImprimirInfosComuns();
		System.out.println(String.format("Limite: %.2f", LIMITE));
			
	}

	@Override
	public void sacar(double valor) {
		if (valor > (saldo+LIMITE)) {
            throw new LimiteExcedidoException(String.format("Saque de R$ %.2f negado: Limite Excedido. Saldo atual + limite: R$ %.2f",valor, saldo+LIMITE));
        }
        saldo -= valor;
	}

}
