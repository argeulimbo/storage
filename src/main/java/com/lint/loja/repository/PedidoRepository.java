package com.lint.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lint.loja.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
