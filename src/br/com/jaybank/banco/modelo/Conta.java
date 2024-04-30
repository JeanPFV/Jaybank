package br.com.jaybank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Jean
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>,Serializable {
	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;

	/**
	 * Contrutor para inicializar o objeto Conta a partir de uma agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		total++;
		// System.out.println("o total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando uma conta");
	}

	public abstract void deposita(double valor);

	/**
	 * o Valor deve ser maior que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);

		} else {
			this.saldo -= valor;
		}

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode número menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {

		return ", Numero: " + this.numero + " | Agencia: " + this.agencia + " | Saldo - R$" + this.saldo;
	}

	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
}