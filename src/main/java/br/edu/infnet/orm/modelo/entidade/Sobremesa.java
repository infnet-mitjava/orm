package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

@Entity
//@PrimaryKeyJoinColumn(name = "produto_id")
public class Sobremesa extends Produto {

	private int quantidade;
	private boolean doce;
	private String informacao;
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public boolean isDoce() {
		return doce;
	}
	public void setDoce(boolean doce) {
		this.doce = doce;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	
	
}
