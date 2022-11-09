package br.edu.infnet.orm.modelo.entidade;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Pedido {

	private Long numero;
	
	private LocalDate data;
	
	private Cliente cliente;
	
	
	private List<Produto> produtos;

	public Pedido() {
	}
	
	public Pedido(Long numero, LocalDate data, Cliente cliente) {
		super();
		this.numero = numero;
		this.data = data;
		this.cliente = cliente;
	}


	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", data=" + data + ", cliente=" + cliente + ", produtos=" + produtos + "]";
	}
	
	
}
