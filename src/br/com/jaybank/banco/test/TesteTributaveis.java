package br.com.jaybank.banco.test;

import br.com.jaybank.banco.modelo.CalculadorDeImposto;
import br.com.jaybank.banco.modelo.ContaCorrente;
import br.com.jaybank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
