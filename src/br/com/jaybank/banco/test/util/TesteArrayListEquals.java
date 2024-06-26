package br.com.jaybank.banco.test.util;

import java.util.ArrayList;

import br.com.jaybank.banco.modelo.Conta;
import br.com.jaybank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta cc1 = new ContaCorrente(22, 11);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe =  lista.contains(cc3);
		
		System.out.println("Existe? " + existe);
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
