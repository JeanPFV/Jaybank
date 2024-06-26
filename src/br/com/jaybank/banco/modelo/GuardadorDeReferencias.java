package br.com.jaybank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		posicaoLivre++;
	}

	public int getQuantidade() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
