package br.com.jaybank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;

	}

	@Override
	public String toString() {

		return "ContaCorrente" + super.toString();
	}

}