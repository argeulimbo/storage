package com.lint.loja.model;

import java.util.Objects;

import com.lint.loja.model.enums.Status;

public class Pedido {
	
	private Long id;
	private Integer numero;
	private String descricaoItem;
	
	private Produto produtoPedido;
	private Fornecedor fornecedorPedido;
	
	private Status statusPedido;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getDescricaoItem() {
		return descricaoItem;
	}
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	public Produto getProdutoPedido() {
		return produtoPedido;
	}
	public void setProdutoPedido(Produto produtoPedido) {
		this.produtoPedido = produtoPedido;
	}
	public Fornecedor getFornecedorPedido() {
		return fornecedorPedido;
	}
	public void setFornecedorPedido(Fornecedor fornecedorPedido) {
		this.fornecedorPedido = fornecedorPedido;
	}
	
	public Status getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(Status statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + " | Pedido Nº " + numero + " | Descrição: " + descricaoItem + " | Status: " + getStatusPedido();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}	

}
