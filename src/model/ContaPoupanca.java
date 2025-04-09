package model;

import exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== EXTRATO CONTA POUPANÇA ===");
		ImprimirInfosComuns();
		
	}

	@Override
	public void sacar(double valor) {
		if (valor > saldo) {
            throw new SaldoInsuficienteException(String.format("Saque de R$ %.2f negado: saldo insuficiente. Saldo atual: R$ %.2f",valor, saldo));
        }
        saldo -= valor;
	}

}
