package com.lint.loja.service;

import com.lint.loja.model.Pedido;

public interface PedidoService {
	
	Pedido findById(Long id);
	
	Pedido create(Pedido pedidoToCreate);


}
