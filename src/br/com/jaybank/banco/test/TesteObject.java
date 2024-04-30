package br.com.jaybank.banco.test;

import br.com.jaybank.banco.modelo.ContaCorrente;
import br.com.jaybank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		Object cc = new ContaCorrente(123, 321);
		Object cp = new ContaPoupanca(222, 333);

		System.out.println(cc);
		System.out.println(cp);

	}

}
