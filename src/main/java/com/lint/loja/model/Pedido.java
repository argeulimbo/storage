package com.lint.loja.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lint.loja.model.enums.Status;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Integer numero;
	
	@Column(nullable = false)
	private String descricaoItem;
	
	@Column
	private Integer quantidadePedido;
	
	@Column
	private Double valorUnitarioItemPedido;
	
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
	
	public void valorTotalPedido(Produto produto) {
		
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
